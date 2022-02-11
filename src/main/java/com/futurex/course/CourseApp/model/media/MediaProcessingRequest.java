package com.futurex.course.CourseApp.model.media;

import org.springframework.stereotype.Component;


@Component
public class MediaProcessingRequest {
  private String userId;
  private String logId;
  private String correlationId;
  private String createDate;

  public MediaProcessingRequest(){}

  public MediaProcessingRequest(String userId, String logId, String correlationId, String createDate) {
    this.userId = userId;
    this.logId = logId;
    this.correlationId = correlationId;
    this.createDate = createDate;
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

  public String getCreateDate() {
    return createDate;
  }

  public void setCreateDate(String createDate) {
    this.createDate = createDate;
  }
}
