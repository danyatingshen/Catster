package com.caster.model.user;

import org.springframework.stereotype.Component;

@Component
public class UserSettingProperty {
  private boolean isOnline;
  private boolean isUsingData;
  private boolean isUsingSounds;
  private boolean isRecognizing;

  public UserSettingProperty() {
  }

  public UserSettingProperty(boolean isOnline, boolean isUsingData, boolean isUsingSounds, boolean isRecognizing) {
    this.isOnline = isOnline;
    this.isUsingData = isUsingData;
    this.isUsingSounds = isUsingSounds;
    this.isRecognizing = isRecognizing;
  }

  public boolean isOnline() {
    return isOnline;
  }

  public void setOnline(boolean online) {
    isOnline = online;
  }

  public boolean isUsingData() {
    return isUsingData;
  }

  public void setUsingData(boolean usingData) {
    isUsingData = usingData;
  }

  public boolean isUsingSounds() {
    return isUsingSounds;
  }

  public void setUsingSounds(boolean usingSounds) {
    isUsingSounds = usingSounds;
  }

  public boolean isRecognizing() {
    return isRecognizing;
  }

  public void setRecognizing(boolean recognizing) {
    isRecognizing = recognizing;
  }
}
