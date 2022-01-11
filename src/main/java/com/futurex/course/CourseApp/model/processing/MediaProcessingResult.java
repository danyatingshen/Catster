package com.futurex.course.CourseApp.model.processing;

public class MediaProcessingResult extends MediaProcessingRequest{
  private String processingResult;

  public MediaProcessingResult(){}
  public MediaProcessingResult(String processingResult) {
    this.processingResult = processingResult;
  }

  public String getProcessingResult() {
    return processingResult;
  }

  public void setProcessingResult(String processingResult) {
    this.processingResult = processingResult;
  }
}
