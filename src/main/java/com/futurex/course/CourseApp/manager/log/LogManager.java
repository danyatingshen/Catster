package com.futurex.course.CourseApp.manager.log;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ExecutionException;

import org.springframework.stereotype.Service;

import com.futurex.course.CourseApp.model.log.Log;
import com.futurex.course.CourseApp.model.log.LogIdentifier;
import com.futurex.course.CourseApp.model.log.SingleLog;
import com.futurex.course.CourseApp.model.log.SingleLogEgg;
import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.DocumentSnapshot;
import com.google.cloud.firestore.Firestore;
import com.google.common.collect.ImmutableList;
import com.google.firebase.cloud.FirestoreClient;

@Service
public class LogManager {
  private final static String LOG_COLLECTION_NAME = "logs";

  public Log getAllLog(LogIdentifier logIdentifier) throws ExecutionException, InterruptedException {
    Firestore firestore = FirestoreClient.getFirestore();
    ApiFuture<DocumentSnapshot> documentReference = firestore.collection(LOG_COLLECTION_NAME).document(logIdentifier.toString()).get();
    if (documentReference.get().exists()){
      Log log = documentReference.get().toObject(Log.class);
      return log;
    }
    //todo: add more detailed user info for debug, error handle
    return null;
  }

  public SingleLog insertASingleLog(SingleLogEgg singleLogEgg) throws ExecutionException, InterruptedException {
    String SingleLogId = UUID.randomUUID().toString();
    SingleLog singleLogToCreate =singleLogEgg.toSingleLog(singleLogEgg, SingleLogId);
    singleLogToCreate.setCreatedAt(Long.toString(System.currentTimeMillis()));

    Log existingLog = getAllLog(singleLogEgg.getLogIdentifier());
    Firestore firestore = FirestoreClient.getFirestore();

    try{
      if (existingLog == null) {
        firestore.collection(LOG_COLLECTION_NAME).document(singleLogEgg.getLogIdentifier().toString()).set(
            new Log(singleLogToCreate.getLogIdentifier(), ImmutableList.of(singleLogToCreate))
        );
        return singleLogToCreate;
      } else {
        List<SingleLog> updatedSingleLogs = new ArrayList<>(existingLog.getSingleLogs());
        updatedSingleLogs.add(singleLogToCreate);
        existingLog.setSingleLogs(updatedSingleLogs);
        firestore.collection(LOG_COLLECTION_NAME).document(singleLogEgg.getLogIdentifier().toString()).set(existingLog);
      }

      return singleLogToCreate;

    } catch (Exception e) {
      //todo: add more detailed user info for debug, error handle
      System.out.println("Error to connect to Firebase when createASingleLog");
      System.out.println(e.fillInStackTrace());
      return new SingleLog();
    }
  }
}