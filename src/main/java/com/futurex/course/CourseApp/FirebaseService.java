package com.futurex.course.CourseApp;

import java.util.concurrent.ExecutionException;

import org.springframework.stereotype.Service;

import com.futurex.course.CourseApp.model.User;
import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.DocumentSnapshot;
import com.google.cloud.firestore.Firestore;
import com.google.cloud.firestore.WriteResult;
import com.google.firebase.cloud.FirestoreClient;

@Service
public class FirebaseService {
  public User createUser (User user) {
    Firestore firestore = FirestoreClient.getFirestore();
    ApiFuture<WriteResult> users = firestore.collection("users").document(user.getUserid()).set(user);
    return user;
  }

  public User getUser (String userid) throws ExecutionException, InterruptedException {
    Firestore firestore = FirestoreClient.getFirestore();
    ApiFuture<DocumentSnapshot> documentReference = firestore.collection("users").document(userid).get();
    if (documentReference.get().exists()){
      User user = documentReference.get().toObject(User.class);
      return user;
    }
    return null;
  }
}
