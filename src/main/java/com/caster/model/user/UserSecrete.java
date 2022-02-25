package com.caster.model.user;

import org.springframework.stereotype.Component;

@Component
public class UserSecrete {
  private String password;

  public UserSecrete(){};
  public UserSecrete(String password) {
    this.password = password;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }
}
