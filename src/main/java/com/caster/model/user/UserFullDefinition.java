package com.caster.model.user;

import org.springframework.stereotype.Component;

@Component
public class UserFullDefinition {
  private String uuid;
  private Long logId;
  private String firstName;
  private String lastName;
  private String createdAt;
  private String archivedAt;
  private String updatedAt;
  private UserProperty userProperty;
  private UserSecrete userSecrete;
  private UserSettingProperty userSettingProperty;

  public UserFullDefinition(){};

  public UserFullDefinition(String uuid, Long logId, String firstName, String lastName, String createdAt, String archivedAt, String updatedAt, UserProperty userProperty, UserSecrete userSecrete, UserSettingProperty userSettingProperty) {
    this.uuid = uuid;
    this.logId = logId;
    this.firstName = firstName;
    this.lastName = lastName;
    this.createdAt = createdAt;
    this.archivedAt = archivedAt;
    this.updatedAt = updatedAt;
    this.userProperty = userProperty;
    this.userSecrete = userSecrete;
    this.userSettingProperty = userSettingProperty;
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

  public String getUuid() {
    return uuid;
  }

  public void setUuid(String uuid) {
    this.uuid = uuid;
  }

  public Long getLogId() {
    return logId;
  }

  public void setLogId(Long logId) {
    this.logId = logId;
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

  public String getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }

  public String getArchivedAt() {
    return archivedAt;
  }

  public void setArchivedAt(String archivedAt) {
    this.archivedAt = archivedAt;
  }

  public String getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
  }

  public UserProperty getUserProperty() {
    return userProperty;
  }

  public void setUserProperty(UserProperty userProperty) {
    this.userProperty = userProperty;
  }
}
