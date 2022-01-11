package com.futurex.course.CourseApp;

import java.io.FileInputStream;
import java.io.IOException;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

import com.google.auth.oauth2.GoogleCredentials;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;

@Service
public class FirebaseInitializer {
  @PostConstruct
  public void initializingDB() throws IOException {
    try{
    FileInputStream serviceAccount =
        new FileInputStream("./serviceAccountKey.json");

    FirebaseOptions options = new FirebaseOptions.Builder()
        .setCredentials(GoogleCredentials.fromStream(serviceAccount))
        .setDatabaseUrl("https://caster-59b75-default-rtdb.firebaseio.com")
        .build();

    FirebaseApp.initializeApp(options);}catch (Exception e) {
      System.out.println("initializingDB Failed");
      e.printStackTrace();
    }
  }
}
