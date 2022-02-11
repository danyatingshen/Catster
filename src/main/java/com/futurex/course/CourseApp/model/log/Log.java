package com.futurex.course.CourseApp.model.log;

import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class Log {
  private LogIdentifier identifier;
  private List<SingleLog> singleLogs;

  public Log() {
  }

  public Log(LogIdentifier identifier, List<SingleLog> singleLogs) {
    this.identifier = identifier;
    this.singleLogs = singleLogs;
  }

  public LogIdentifier getIdentifier() {
    return identifier;
  }

  public void setIdentifier(LogIdentifier identifier) {
    this.identifier = identifier;
  }

  public List<SingleLog> getSingleLogs() {
    return singleLogs;
  }

  public void setSingleLogs(List<SingleLog> singleLogs) {
    this.singleLogs = singleLogs;
  }
}
