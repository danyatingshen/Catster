package com.futurex.Caster;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.google.cloud.firestore.CollectionReference;

@RestController
public class UserController {
    @Autowired
    FirebaseInitializer firebaseInitializer;

    @RequestMapping("/test/users")
    public void getTestUsers() {
        CollectionReference collectionReference = firebaseInitializer.getFirestore().collection("users");
    }



}
