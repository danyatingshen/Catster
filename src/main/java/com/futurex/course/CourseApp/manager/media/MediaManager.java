package com.futurex.course.CourseApp.manager.media;

import java.util.UUID;
import java.util.concurrent.ExecutionException;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.futurex.course.CourseApp.model.error.MediaError;
import com.futurex.course.CourseApp.model.error.MediaErrorType;
import com.futurex.course.CourseApp.model.media.MediaProcessingResult;
import com.futurex.course.CourseApp.model.media.TranslationResult;

@Service
public class MediaManager {
  public MediaProcessingResult processMedia(
      String userId,
      String logId,
      MultipartFile file
  ) throws ExecutionException, InterruptedException {
    String correlationId = UUID.randomUUID().toString();
    if (file.isEmpty()) {
      return new MediaProcessingResult(
          userId,
          logId,
          correlationId,
          new MediaError(MediaErrorType.FILE_IS_EMPTY,"File is empty"));
    }
    // TODO: process the file with ML -> TranslationResult
    String fileUUID = String.format("%s-%s-%s",userId,logId,correlationId);
    TranslationResult translationResult = new TranslationResult(
        file.getOriginalFilename(),
        fileUUID,
        "fake translation massage result from ML",
        true
    );
    // TODO: generate log for userid/logId -> singleLogId
    if (!translationResult.isGetTranslated()) {
      return new MediaProcessingResult(
          userId,
          logId,
          correlationId,
          new MediaError(MediaErrorType.TRANSLATION_PROCESSING_ERROR,"something went wrong when translating")
      );
    }
    return
        new MediaProcessingResult(
            userId,
            logId,
            correlationId,
            translationResult
        );
  }
}
