package com.futurex.course.CourseApp.resources;

import java.util.concurrent.ExecutionException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.futurex.course.CourseApp.manager.firebase.FirebaseManager;
import com.futurex.course.CourseApp.model.user.User;

@RestController
public class UserResource {

    @Autowired
    private FirebaseManager firebaseManager;

    @GetMapping("/debug")
    public String test() throws InterruptedException, ExecutionException {
        return "Working";
    }

    @GetMapping("/getUser")
    public User getUser(@RequestParam() String uid) throws InterruptedException, ExecutionException {
        return firebaseManager.getUser(uid);
    }

    @PostMapping("/createUser")
    public String createUser(@RequestBody User user) throws InterruptedException, ExecutionException {
        firebaseManager.createUser(user);
        return "Created User " + user.getUsername();
    }

    //todo: finish update + delete after update model
    @PutMapping("/updateUser")
    public String updateUser(@RequestBody User user) throws InterruptedException, ExecutionException {
        return "Updated User" + user.getUsername();
    }

    @DeleteMapping("/deleteUser")
    public String deleteUser(@RequestParam String uid) {
        return "Deleted User " + uid;
    }

}
