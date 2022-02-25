package com.caster.manager.user;

import java.time.Clock;
import java.util.Optional;
import java.util.UUID;
import java.util.concurrent.ExecutionException;

import org.springframework.stereotype.Service;

import com.caster.model.error.UserError;
import com.caster.model.error.UserErrorType;
import com.caster.model.user.UserDefinitionEgg;
import com.caster.model.user.UserDefinitionPatch;
import com.caster.model.user.UserFullDefinition;
import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.DocumentSnapshot;
import com.google.cloud.firestore.Firestore;
import com.google.firebase.cloud.FirestoreClient;

@Service
public class UserManager {

  public UserFullDefinition create(UserDefinitionEgg userDefinitionEgg) {
    UUID uuid = UUID.randomUUID();
    String uuidToStore = uuid.toString();
    long LogId = uuid.hashCode();
    UserFullDefinition definition = userDefinitionEgg.toUserFullDefinition(
        uuidToStore,LogId
    );
    definition.setCreatedAt(Clock.systemUTC().toString());
    return upsertUserInDatabase(definition);
  }

  public UserFullDefinition update(UserDefinitionPatch userDefinitionPatch){
    UserFullDefinition existingDefinition = get(userDefinitionPatch.getUuid())
        .orElseThrow(() ->
            new IllegalArgumentException(
                new UserError(
                    UserErrorType.USER_NOT_FOUND,
                    "Can't find user when update"
                ).buildNotFoundError(userDefinitionPatch.getUuid())
                )
            );
    UserFullDefinition definitionToUpdate = new UserFullDefinition(
        userDefinitionPatch.getUuid(),
        existingDefinition.getLogId(),
        userDefinitionPatch.getFirstName().orElse(existingDefinition.getFirstName()),
        userDefinitionPatch.getLastName().orElse(existingDefinition.getLastName()),
        userDefinitionPatch.getUserProperty().orElse(existingDefinition.getUserProperty()),
        userDefinitionPatch.getUserSecrete().orElse(existingDefinition.getUserSecrete()),
        userDefinitionPatch.getUserSettingProperty().orElse(existingDefinition.getUserSettingProperty())
    );
    definitionToUpdate.setCreatedAt(existingDefinition.getCreatedAt());
    definitionToUpdate.setUpdatedAt(Clock.systemUTC().toString());
    return upsertUserInDatabase(definitionToUpdate);
  }

  public Optional<UserFullDefinition> get(String uuid) {
    Firestore firestore = FirestoreClient.getFirestore();
    try {
      ApiFuture<DocumentSnapshot> documentReference = firestore.collection("users").document(uuid).get();
      if (documentReference.get().exists()){
        UserFullDefinition user = documentReference.get().toObject(UserFullDefinition.class);
        return Optional.ofNullable(user);
      }
    } catch ( ExecutionException | InterruptedException exception ) {
      throw new RuntimeException(
          new UserError(
              UserErrorType.USER_FIREBASE_API_ERROR,
              "USER_FIREBASE_API_ERROR"
          ).buildNotFoundError(uuid)
      );
    }
    return Optional.empty();
  }

  public void archive(String uuid) {
    Firestore firestore = FirestoreClient.getFirestore();
    UserFullDefinition existingDefinition = get(uuid)
        .orElseThrow(() ->
            new IllegalArgumentException(
                new UserError(
                    UserErrorType.USER_NOT_FOUND,
                    "Can't find user when archive"
                ).buildNotFoundError(uuid)
            )
        );
    existingDefinition.setArchivedAt(Clock.systemUTC().instant().toString());
   firestore.collection("users").document(existingDefinition.getUuid()).set(existingDefinition);
  }

  public void purge(String uuid) throws IllegalArgumentException, UnsupportedOperationException {
    Firestore firestore = FirestoreClient.getFirestore();
      UserFullDefinition existingDefinition = get(uuid)
          .orElseThrow(() ->
              new IllegalArgumentException(
                  new UserError(
                      UserErrorType.USER_NOT_FOUND,
                      "Can't find user when purge"
                  ).buildNotFoundError(uuid)
              )
          );
      if (existingDefinition.getArchivedAt().isEmpty()) {
        throw new UnsupportedOperationException(
            new UserError(
                UserErrorType.USER_NOT_ARCHIVED,
                "User need to be archived before purge"
            ).buildNotFoundError(uuid)
        );
      }
      firestore.collection("users").document(uuid).delete();

  }

  private UserFullDefinition upsertUserInDatabase(UserFullDefinition user) {
    Firestore firestore = FirestoreClient.getFirestore();
    firestore.collection("users").document(user.getUuid()).set(user);
    return user;
  }
}
