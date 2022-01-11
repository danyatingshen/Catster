package com.futurex.course.CourseApp.model.processing;

import org.springframework.stereotype.Component;

@Component
public class MediaProcessingRequest {
  private String userId;
  private String logId;
  private String taskId;
  private String audioUrl;
  private String pictureUrl;
  private String createDate;

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

  public String getTaskId() {
    return taskId;
  }

  public void setTaskId(String taskId) {
    this.taskId = taskId;
  }

  public String getAudioUrl() {
    return audioUrl;
  }

  public void setAudioUrl(String audioUrl) {
    this.audioUrl = audioUrl;
  }

  public String getPictureUrl() {
    return pictureUrl;
  }

  public void setPictureUrl(String pictureUrl) {
    this.pictureUrl = pictureUrl;
  }

  public String getCreateDate() {
    return createDate;
  }

  public void setCreateDate(String createDate) {
    this.createDate = createDate;
  }

  public MediaProcessingRequest(){}

  public MediaProcessingRequest(String userId, String logId, String taskId, String audioUrl, String pictureUrl, String createDate) {
    this.userId = userId;
    this.logId = logId;
    this.taskId = taskId;
    this.audioUrl = audioUrl;
    this.pictureUrl = pictureUrl;
    this.createDate = createDate;
  }
}
