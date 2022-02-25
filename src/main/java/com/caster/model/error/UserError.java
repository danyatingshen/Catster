package com.caster.model.error;

public class UserError {
  private UserErrorType userErrorType;
  private String errorMassage;

  public UserError(UserErrorType userErrorType, String errorMassage) {
    this.userErrorType = userErrorType;
    this.errorMassage = errorMassage;
  }

  public UserErrorType getUserErrorType() {
    return userErrorType;
  }

  public void setUserErrorType(UserErrorType userErrorType) {
    this.userErrorType = userErrorType;
  }

  public String getErrorMassage() {
    return errorMassage;
  }

  public void setErrorMassage(String errorMassage) {
    this.errorMassage = errorMassage;
  }

  public String buildNotFoundError (String uuid) {
    return String.format("[uuid=%s|errorType=%s|errorMassage=%s]",uuid, this.getUserErrorType().toString(),this.errorMassage);
  }
}
