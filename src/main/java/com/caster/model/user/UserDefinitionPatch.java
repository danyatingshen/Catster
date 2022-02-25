package com.caster.model.user;

import java.util.Optional;

public class UserDefinitionPatch {
  private String uuid;
  private Optional<String> firstName;
  private Optional<String> lastName;
  private Optional<UserProperty> userProperty;
  private Optional<UserSecrete> userSecrete;
  private Optional<UserSettingProperty> userSettingProperty;

  public UserDefinitionPatch() {
  }

  public UserDefinitionPatch(String uuid,
                             Optional<String> firstName,
                             Optional<String> lastName,
                             Optional<UserProperty> userProperty,
                             Optional<UserSecrete> userSecrete,
                             Optional<UserSettingProperty> userSettingProperty) {
    this.uuid = uuid;
    this.firstName = firstName;
    this.lastName = lastName;
    this.userProperty = userProperty;
    this.userSecrete = userSecrete;
    this.userSettingProperty = userSettingProperty;
  }

  public String getUuid() {
    return uuid;
  }

  public void setUuid(String uuid) {
    this.uuid = uuid;
  }

  public Optional<String> getFirstName() {
    return firstName;
  }

  public void setFirstName(Optional<String> firstName) {
    this.firstName = firstName;
  }

  public Optional<String> getLastName() {
    return lastName;
  }

  public void setLastName(Optional<String> lastName) {
    this.lastName = lastName;
  }

  public Optional<UserProperty> getUserProperty() {
    return userProperty;
  }

  public void setUserProperty(Optional<UserProperty> userProperty) {
    this.userProperty = userProperty;
  }

  public Optional<UserSecrete> getUserSecrete() {
    return userSecrete;
  }

  public void setUserSecrete(Optional<UserSecrete> userSecrete) {
    this.userSecrete = userSecrete;
  }

  public Optional<UserSettingProperty> getUserSettingProperty() {
    return userSettingProperty;
  }

  public void setUserSettingProperty(Optional<UserSettingProperty> userSettingProperty) {
    this.userSettingProperty = userSettingProperty;
  }
}
