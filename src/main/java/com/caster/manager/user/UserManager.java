package com.caster.manager.user;

import java.time.Clock;
import java.util.concurrent.ExecutionException;

import org.springframework.stereotype.Service;

import com.caster.model.user.UserFullDefinition;
import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.DocumentSnapshot;
import com.google.cloud.firestore.Firestore;
import com.google.cloud.firestore.WriteResult;
import com.google.firebase.cloud.FirestoreClient;

@Service
public class UserManager {

  public UserFullDefinition getUser(String uuid) throws ExecutionException, InterruptedException {
    Firestore firestore = FirestoreClient.getFirestore();
    ApiFuture<DocumentSnapshot> documentReference = firestore.collection("users").document(uuid).get();
    if (documentReference.get().exists()){
      UserFullDefinition user = documentReference.get().toObject(UserFullDefinition.class);
      return user;
    }
    return null;
  }

  public UserFullDefinition upsertUser(UserFullDefinition user) {
    Firestore firestore = FirestoreClient.getFirestore();
    try{
      ApiFuture<WriteResult> firebaseResult = firestore.collection("users").document(user.getUuid()).set(user);
    } catch (Exception e) {
      //todo: add more detailed user info for debug, error handle
      System.out.println("Error to connect to Firebase when createUserCore");
    }
    return user;
  }

  public void archiveUser(String uuid) {
    Firestore firestore = FirestoreClient.getFirestore();
    try{
      UserFullDefinition maybeUser = getUser(uuid);
      maybeUser.setArchivedAt(Clock.systemUTC().instant().toString());
      ApiFuture<WriteResult> firebaseResult = firestore.collection("users").document(maybeUser.getUuid()).set(maybeUser);
    } catch (Exception e) {
      //todo: add more detailed user info for debug, error handle
      System.out.println("Error to connect to Firebase when archiveUser");
    }
  }

  public void purgeUser(String uuid) {
    Firestore firestore = FirestoreClient.getFirestore();
    try{
      ApiFuture<WriteResult> firebaseResult = firestore.collection("users").document(uuid).delete();
    } catch (Exception e) {
      //todo: add more detailed user info for debug, error handle
      System.out.println("Error to connect to Firebase when purgeUser");
    }
  }
}
