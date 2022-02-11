package com.futurex.course.CourseApp.model.media;

import org.springframework.stereotype.Component;

import com.futurex.course.CourseApp.model.error.MediaError;

@Component
public class MediaProcessingResult{
  private String userId;
  private String logId;
  private String correlationId;
  private TranslationResult translationResult;
  private MediaError mediaError;
  private String timeStamp;

  public MediaProcessingResult() {
  }

  public MediaProcessingResult(String userId, String logId, String correlationId, TranslationResult translationResult) {
    this.userId = userId;
    this.logId = logId;
    this.correlationId = correlationId;
    this.translationResult = translationResult;
  }

  public MediaProcessingResult(String userId, String logId, String correlationId, MediaError mediaError) {
    this.userId = userId;
    this.logId = logId;
    this.correlationId = correlationId;
    this.mediaError = mediaError;
  }

  public MediaProcessingResult(String userId, String logId, String correlationId, TranslationResult translationResult, MediaError mediaError) {
    this.userId = userId;
    this.logId = logId;
    this.correlationId = correlationId;
    this.translationResult = translationResult;
    this.mediaError = mediaError;
  }

  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public String getLogId() {
    return logId;
  }

  public void setLogId(String logId) {
    this.logId = logId;
  }

  public String getCorrelationId() {
    return correlationId;
  }

  public void setCorrelationId(String correlationId) {
    this.correlationId = correlationId;
  }

  public TranslationResult getTranslationResult() {
    return translationResult;
  }

  public void setTranslationResult(TranslationResult translationResult) {
    this.translationResult = translationResult;
  }

  public MediaError getMediaError() {
    return mediaError;
  }

  public void setMediaError(MediaError mediaError) {
    this.mediaError = mediaError;
  }
}
