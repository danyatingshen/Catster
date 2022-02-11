package com.futurex.course.CourseApp.model.log;

import org.springframework.stereotype.Component;

import com.futurex.course.CourseApp.model.media.TranslationResult;

@Component
public class SingleLog {
  private LogIdentifier logIdentifier;
  private String SingleLogId;
  private TranslationResult translationResult;
  private String createdAt;
  private String purgeAt;

  public SingleLog() {
  }

  public SingleLog(LogIdentifier logIdentifier, String singleLogId, TranslationResult translationResult) {
    this.logIdentifier = logIdentifier;
    SingleLogId = singleLogId;
    this.translationResult = translationResult;
  }

  public SingleLog(LogIdentifier logIdentifier, String singleLogId, TranslationResult translationResult, String createdAt, String purgeAt) {
    this.logIdentifier = logIdentifier;
    SingleLogId = singleLogId;
    this.translationResult = translationResult;
    this.createdAt = createdAt;
    this.purgeAt = purgeAt;
  }

  public LogIdentifier getLogIdentifier() {
    return logIdentifier;
  }

  public void setLogIdentifier(LogIdentifier logIdentifier) {
    this.logIdentifier = logIdentifier;
  }

  public String getSingleLogId() {
    return SingleLogId;
  }

  public void setSingleLogId(String singleLogId) {
    SingleLogId = singleLogId;
  }

  public TranslationResult getTranslationResult() {
    return translationResult;
  }

  public void setTranslationResult(TranslationResult translationResult) {
    this.translationResult = translationResult;
  }

  public String getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }

  public String getPurgeAt() {
    return purgeAt;
  }

  public void setPurgeAt(String purgeAt) {
    this.purgeAt = purgeAt;
  }

}
