package com.caster.model.user;

public class UserDefinitionEgg {
  private String firstName;
  private String lastName;
  private UserProperty userProperty;
  private UserSecrete userSecrete;
  private UserSettingProperty userSettingProperty;

  public UserDefinitionEgg() {
  }

  public UserDefinitionEgg(String firstName, String lastName, UserProperty userProperty, UserSecrete userSecrete, UserSettingProperty userSettingProperty) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.userProperty = userProperty;
    this.userSecrete = userSecrete;
    this.userSettingProperty = userSettingProperty;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public UserProperty getUserProperty() {
    return userProperty;
  }

  public void setUserProperty(UserProperty userProperty) {
    this.userProperty = userProperty;
  }

  public UserSecrete getUserSecrete() {
    return userSecrete;
  }

  public void setUserSecrete(UserSecrete userSecrete) {
    this.userSecrete = userSecrete;
  }

  public UserSettingProperty getUserSettingProperty() {
    return userSettingProperty;
  }

  public void setUserSettingProperty(UserSettingProperty userSettingProperty) {
    this.userSettingProperty = userSettingProperty;
  }

  public UserFullDefinition toUserFullDefinition (
      String uuid,
      long logId
  ) {
    return new UserFullDefinition(
        uuid,
        logId,
        getFirstName(),
        getLastName(),
        getUserProperty(),
        getUserSecrete(),
        getUserSettingProperty()
    );
  }
}
