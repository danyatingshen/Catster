package com.futurex.Caster;

import java.io.FileInputStream;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.google.auth.oauth2.GoogleCredentials;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;

@SpringBootApplication
public class ProBeautyApplication {
	@Autowired
	FirebaseInitializer firebaseInitializer;
	public static void main(String[] args) throws IOException {
		FileInputStream serviceAccount =
				new FileInputStream("caster-59b75-firebase-adminsdk-i6rj5-d62608ac12.json");

		FirebaseOptions options = new FirebaseOptions.Builder()
				.setCredentials(GoogleCredentials.fromStream(serviceAccount))
				.setDatabaseUrl("https://caster-59b75-default-rtdb.firebaseio.com/")
				.build();

		if (FirebaseApp.getApps().isEmpty()) {
			FirebaseApp.initializeApp(options);
		}

		SpringApplication.run(ProBeautyApplication.class, args);
	}

}
