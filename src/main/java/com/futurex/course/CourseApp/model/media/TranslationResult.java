package com.futurex.course.CourseApp.model.media;

import org.springframework.stereotype.Component;

@Component
public class TranslationResult {
  private String fileOriginalName;
  private String fileUUID;
  private String translationMassage;
  private boolean getTranslated;

  public TranslationResult() {
  }

  public TranslationResult(String fileOriginalName, String fileUUID, String translationMassage, boolean getTranslated) {
    this.fileOriginalName = fileOriginalName;
    this.fileUUID = fileUUID;
    this.translationMassage = translationMassage;
    this.getTranslated = getTranslated;
  }

  public String getFileOriginalName() {
    return fileOriginalName;
  }

  public void setFileOriginalName(String fileOriginalName) {
    this.fileOriginalName = fileOriginalName;
  }

  public String getFileUUID() {
    return fileUUID;
  }

  public void setFileUUID(String fileUUID) {
    this.fileUUID = fileUUID;
  }

  public String getTranslationMassage() {
    return translationMassage;
  }

  public void setTranslationMassage(String translationMassage) {
    this.translationMassage = translationMassage;
  }

  public boolean isGetTranslated() {
    return getTranslated;
  }

  public void setGetTranslated(boolean getTranslated) {
    this.getTranslated = getTranslated;
  }
}
