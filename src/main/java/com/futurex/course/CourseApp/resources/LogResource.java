package com.futurex.course.CourseApp.resources;

import java.util.concurrent.ExecutionException;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.futurex.course.CourseApp.model.media.MediaProcessingRequest;
import com.futurex.course.CourseApp.model.media.MediaProcessingResult;


@RestController
public class LogResource {
  @GetMapping("/media/debug")
  public String test() throws InterruptedException, ExecutionException {
    return "Working";
  }

  @PostMapping("/media/process")
  public MediaProcessingResult processingMedia(@RequestBody MediaProcessingRequest mediaProcessingRequest) throws InterruptedException, ExecutionException {
    //todo: need to add ML + upsert log
    return new MediaProcessingResult("userId","logId","taskId","hello");
  }
}
