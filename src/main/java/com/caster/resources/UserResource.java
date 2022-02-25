package com.caster.resources;

import java.util.concurrent.ExecutionException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.caster.manager.user.UserManager;
import com.caster.model.user.UserFullDefinition;

@RestController
public class UserResource {

    @Autowired
    private UserManager userManager;

    @GetMapping("/user/debug")
    @CrossOrigin
    public String test() throws InterruptedException, ExecutionException {
        return "user endpoints are Working";
    }

    @GetMapping("/getUser")
    @CrossOrigin
    public UserFullDefinition getUser(@RequestParam String uuid) throws InterruptedException, ExecutionException {
        return userManager.getUser(uuid);
    }

    @PostMapping("/createUser")
    @CrossOrigin
    public String createUser(@RequestBody UserFullDefinition user) throws InterruptedException, ExecutionException {
        userManager.upsertUser(user);
        return "Created User Successfully at: " + user.getCreatedAt();
    }

    @PutMapping("/updateUser")
    @CrossOrigin
    public String updateUser(@RequestBody UserFullDefinition user) throws InterruptedException, ExecutionException {
        userManager.upsertUser(user);
        return "Updated User" + user.getUpdatedAt();
    }

    @PutMapping("/archiveUser")
    @CrossOrigin
    public String archiveUser(@RequestParam String uuid) {
        userManager.archiveUser(uuid);
        return "archiveUser User " + uuid;
    }

    @DeleteMapping("/purgeUser")
    @CrossOrigin
    public String deleteUser(@RequestParam String uuid) {
        userManager.purgeUser(uuid);
        return "purgeUser User " + uuid;
    }

}
