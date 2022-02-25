package com.caster.manager.media;

import java.util.UUID;
import java.util.concurrent.ExecutionException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.caster.model.error.MediaError;
import com.caster.model.error.MediaErrorType;
import com.caster.model.log.LogIdentifier;
import com.caster.model.log.SingleLogEgg;
import com.caster.model.media.MediaProcessingResult;
import com.caster.model.media.TranslationResult;
import com.caster.manager.log.LogManager;

@Service
public class MediaManager {
  @Autowired
  private LogManager logManager;

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
        "place holder translation massage result from ML",
        true
    );

    logManager.insertASingleLog(
        new SingleLogEgg(
            new LogIdentifier(userId,logId),
            translationResult
        )
    );

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
