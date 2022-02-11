package com.futurex.course.CourseApp.model.log;

import org.springframework.stereotype.Component;

import com.futurex.course.CourseApp.model.media.TranslationResult;

@Component
public class SingleLogEgg {
  private LogIdentifier logIdentifier;
  private TranslationResult translationResult;

  public SingleLogEgg() {
  }

  public SingleLogEgg(LogIdentifier logIdentifier, TranslationResult translationResult) {
    this.logIdentifier = logIdentifier;
    this.translationResult = translationResult;
  }

  public LogIdentifier getLogIdentifier() {
    return logIdentifier;
  }

  public void setLogIdentifier(LogIdentifier logIdentifier) {
    this.logIdentifier = logIdentifier;
  }

  public TranslationResult getTranslationResult() {
    return translationResult;
  }

  public void setTranslationResult(TranslationResult translationResult) {
    this.translationResult = translationResult;
  }

  public SingleLog toSingleLog (SingleLogEgg singleLogEgg, String singleLogId) {
    return new SingleLog(
        singleLogEgg.getLogIdentifier(),
        singleLogId,
        singleLogEgg.getTranslationResult()
    );
  }
}
