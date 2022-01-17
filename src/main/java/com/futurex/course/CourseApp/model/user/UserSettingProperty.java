package com.futurex.course.CourseApp.model.user;

import org.springframework.stereotype.Component;

@Component
public class UserSettingProperty {
  private boolean isOnline;

  public UserSettingProperty(){}
  public UserSettingProperty(boolean isOnline) {
    this.isOnline = isOnline;
  }

  public boolean isOnline() {
    return isOnline;
  }

  public void setOnline(boolean online) {
    isOnline = online;
  }
}
