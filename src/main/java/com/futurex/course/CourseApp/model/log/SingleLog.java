package com.futurex.course.CourseApp.model.log;

import org.springframework.stereotype.Component;

@Component
public class SingleLog {
  private String logId;
  private int singleLogId;
  private String logContent;
  private String createdAt;
  private String archivedAt;
  private String updatedAt;

  public SingleLog(String logId, int singleLogId, String logContent, String createdAt, String archivedAt, String updatedAt) {
    this.logId = logId;
    this.singleLogId = singleLogId;
    this.logContent = logContent;
    this.createdAt = createdAt;
    this.archivedAt = archivedAt;
    this.updatedAt = updatedAt;
  }

  public SingleLog(){}

  public String getLogId() {
    return logId;
  }

  public void setLogId(String logId) {
    this.logId = logId;
  }

  public int getSingleLogId() {
    return singleLogId;
  }

  public void setSingleLogId(int singleLogId) {
    this.singleLogId = singleLogId;
  }

  public String getLogContent() {
    return logContent;
  }

  public void setLogContent(String logContent) {
    this.logContent = logContent;
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
}
