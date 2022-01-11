package com.futurex.Caster;

import java.util.HashMap;
import java.util.Map;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class UserManager {
  private static final FirebaseDatabase DATABASE = FirebaseDatabase.getInstance();
  private static final DatabaseReference USER_REF = DATABASE.getReference("users");

  public UserManager() {
  }

  public static class testUser {

    public String date_of_birth;
    public String full_name;
    public String nickname;

    public testUser(String dateOfBirth, String fullName) {
      // ...
    }

    public testUser(String dateOfBirth, String fullName, String nickname) {
      // ...
    }

  }

  public void createUser(
  ) {
    Map<String, testUser> users = new HashMap<>();
    users.put("alanisawesome", new testUser("June 23, 1912", "Alan Turing"));
    users.put("gracehop", new testUser("December 9, 1906", "Grace Hopper"));
    //USER_REF.setValueAsync(ImmutableMap.of("1",UserFactory.USER));
    USER_REF.setValueAsync(users);
  }
}
