package com.futurex.course.CourseApp.model.media;

public class MediaProcessingResult{
  private String userId;
  private String logId;
  private String taskId;

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

  public String getProcessingResult() {
    return processingResult;
  }

  public void setProcessingResult(String processingResult) {
    this.processingResult = processingResult;
  }

  private String processingResult;


  public MediaProcessingResult(){
    super();
  }

  public MediaProcessingResult(String userId, String logId, String taskId, String processingResult) {
    this.userId = userId;
    this.logId = logId;
    this.taskId = taskId;
    this.processingResult = processingResult;
  }
}
