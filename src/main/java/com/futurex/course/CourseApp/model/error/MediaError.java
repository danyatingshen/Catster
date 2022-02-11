package com.futurex.course.CourseApp.model.error;

import org.springframework.stereotype.Component;

@Component
public class MediaError {
  private MediaErrorType mediaErrorType;
  private String errorMassage;

  public MediaError() {
  }

  public MediaError(MediaErrorType mediaErrorType, String errorMassage) {
    this.mediaErrorType = mediaErrorType;
    this.errorMassage = errorMassage;
  }

  public MediaErrorType getMediaErrorType() {
    return mediaErrorType;
  }

  public void setMediaErrorType(MediaErrorType mediaErrorType) {
    this.mediaErrorType = mediaErrorType;
  }

  public String getErrorMassage() {
    return errorMassage;
  }

  public void setErrorMassage(String errorMassage) {
    this.errorMassage = errorMassage;
  }
}
