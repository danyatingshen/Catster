package com.caster.model.log;

import org.springframework.stereotype.Component;

@Component
public class LogIdentifier {
  private String userId;
  private String logId;

  public LogIdentifier() {
  }

  public LogIdentifier(String userId, String logId) {
    this.userId = userId;
    this.logId = logId;
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


  public String toString () {
    return String.format("%s-%s", this.getUserId(),this.getLogId());
  }
}
