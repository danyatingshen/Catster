package com.futurex.Caster;

import java.io.FileInputStream;
import java.io.IOException;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

import com.google.auth.oauth2.GoogleCredentials;
import com.google.cloud.firestore.Firestore;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.cloud.FirestoreClient;

@Service
public class FirebaseInitializer {

  @PostConstruct
  public void initDB () throws IOException {
    FileInputStream serviceAccount =
        new FileInputStream("caster-59b75-firebase-adminsdk-i6rj5-d62608ac12.json");

    FirebaseOptions options = new FirebaseOptions.Builder()
        .setCredentials(GoogleCredentials.fromStream(serviceAccount))
        .setDatabaseUrl("https://caster-59b75-default-rtdb.firebaseio.com/")
        .build();

    if (FirebaseApp.getApps().isEmpty()) {
      FirebaseApp.initializeApp(options);
    }

  }

  public Firestore getFirestore() {
    return FirestoreClient.getFirestore();
  }
}
