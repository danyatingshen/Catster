package com.futurex.course.CourseApp.manager.user;

import java.util.concurrent.ExecutionException;

import org.springframework.stereotype.Service;

import com.futurex.course.CourseApp.model.log.SingleLogEgg;
import com.futurex.course.CourseApp.model.user.UserFullDefinition;
import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.DocumentSnapshot;
import com.google.cloud.firestore.Firestore;
import com.google.cloud.firestore.WriteResult;
import com.google.firebase.cloud.FirestoreClient;

@Service
public class LogManager {
  private final static String LOG_COLLECTION_NAME = "logs";

  public UserFullDefinition getUser(String uuid) throws ExecutionException, InterruptedException {
    Firestore firestore = FirestoreClient.getFirestore();
    ApiFuture<DocumentSnapshot> documentReference = firestore.collection("users").document(uuid).get();
    if (documentReference.get().exists()){
      UserFullDefinition user = documentReference.get().toObject(UserFullDefinition.class);
      return user;
    }
    return null;
  }

  public UserFullDefinition upsertSingleLog(SingleLogEgg logEgg) {
    Firestore firestore = FirestoreClient.getFirestore();

    try{
      ApiFuture<WriteResult> firebaseResult = firestore.collection(LOG_COLLECTION_NAME).document(logEgg.getLogId()).set(logEgg);
    } catch (Exception e) {
      //todo: add more detailed user info for debug, error handle
      System.out.println("Error to connect to Firebase when createUserCore");
    }
    return new UserFullDefinition();
  }

  // todo: archive and purge
}