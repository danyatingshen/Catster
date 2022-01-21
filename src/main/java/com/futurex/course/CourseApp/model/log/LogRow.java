package com.futurex.course.CourseApp.model.log;

import java.util.List;

public class LogRow {
  private String logId;
  private List<SingleLog> logs;

  public LogRow(String logId, List<SingleLog> logs) {
    this.logId = logId;
    this.logs = logs;
  }

  public String getLogId() {
    return logId;
  }

  public void setLogId(String logId) {
    this.logId = logId;
  }

  public List<SingleLog> getLogs() {
    return logs;
  }

  public void setLogs(List<SingleLog> logs) {
    this.logs = logs;
  }
}
