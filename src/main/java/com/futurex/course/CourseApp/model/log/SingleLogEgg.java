package com.futurex.course.CourseApp.model.log;

public class SingleLogEgg {
  private String logId;
  private String logContent;

  public SingleLogEgg(String logId, String logContent) {
    this.logId = logId;
    this.logContent = logContent;
  }

  public String getLogId() {
    return logId;
  }

  public void setLogId(String logId) {
    this.logId = logId;
  }

  public String getLogContent() {
    return logContent;
  }

  public void setLogContent(String logContent) {
    this.logContent = logContent;
  }
}
