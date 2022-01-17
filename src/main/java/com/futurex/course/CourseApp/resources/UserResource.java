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

import com.futurex.course.CourseApp.manager.user.UserManager;
import com.futurex.course.CourseApp.model.user.User;
import com.futurex.course.CourseApp.model.user.UserFullDefinition;

@RestController
public class UserResource {

    @Autowired
    private UserManager userManager;

    @GetMapping("/user/debug")
    public String test() throws InterruptedException, ExecutionException {
        return "user endpoints are Working";
    }

    @GetMapping("/getUser")
    public UserFullDefinition getUser(@RequestParam() String uuid) throws InterruptedException, ExecutionException {
        return userManager.getAUser(uuid);
    }

    @PostMapping("/createUser")
    public String createUser(@RequestBody UserFullDefinition user) throws InterruptedException, ExecutionException {
        userManager.createAUser(user);
        return "Created User Successfully at: " + user.getCreatedAt();
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
