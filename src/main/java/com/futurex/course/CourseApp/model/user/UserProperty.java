package com.futurex.course.CourseApp.model.user;

import org.springframework.stereotype.Component;

@Component
public class UserProperty {
  private String name;
  private UserScope userType;

  public UserProperty(){};

  public UserProperty(String name, UserScope userType) {
    this.name = name;
    this.userType = userType;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public UserScope getUserType() {
    return userType;
  }

  public void setUserType(UserScope userType) {
    this.userType = userType;
  }
}