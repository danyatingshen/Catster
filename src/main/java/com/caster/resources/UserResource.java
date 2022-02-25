package com.caster.resources;

import java.util.Optional;

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
import com.caster.model.user.UserDefinitionEgg;
import com.caster.model.user.UserDefinitionPatch;
import com.caster.model.user.UserFullDefinition;

@RestController
public class UserResource {

    @Autowired
    private UserManager userManager;

    @GetMapping("/user/debug")
    @CrossOrigin
    public String test() {
        return "user endpoints are Working";
    }

    @GetMapping("/getUser")
    @CrossOrigin
    public Optional<UserFullDefinition> getUser(@RequestParam String uuid) {
        return userManager.get(uuid);
    }

    @PostMapping("/createUser")
    @CrossOrigin
    public String createUser(@RequestBody UserDefinitionEgg userDefinitionEgg) {
        UserFullDefinition definition = userManager.create(userDefinitionEgg);
        return String.format("[%s,timeStamp:%s]","Created User Successfully", definition.getCreatedAt());
    }

    @PutMapping("/updateUser")
    @CrossOrigin
    public String updateUser(@RequestBody UserDefinitionPatch userDefinitionPatch) {
        UserFullDefinition definition = userManager.update(userDefinitionPatch);
        return String.format("[%s,timeStamp:%s]","Updated User Successfully", definition.getUpdatedAt());
    }

    @PutMapping("/archiveUser")
    @CrossOrigin
    public String archiveUser(@RequestParam String uuid) {
        userManager.archive(uuid);
        return "archiveUser User " + uuid;
    }

    @DeleteMapping("/purgeUser")
    @CrossOrigin
    public String deleteUser(@RequestParam String uuid)  {
        userManager.purge(uuid);
        return "purgeUser User " + uuid;
    }

}
