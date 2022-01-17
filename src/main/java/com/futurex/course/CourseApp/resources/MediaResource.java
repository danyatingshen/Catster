package com.futurex.course.CourseApp.resources;

import java.util.concurrent.ExecutionException;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.futurex.course.CourseApp.model.processing.MediaProcessingRequest;
import com.futurex.course.CourseApp.model.processing.MediaProcessingResult;

@RestController
public class MediaResource {
  @GetMapping("/media/debug")
  public String test() throws InterruptedException, ExecutionException {
    return "Working";
  }

  @PostMapping("/media/process")
  public MediaProcessingResult processingMedia(@RequestBody MediaProcessingRequest mediaProcessingRequest) throws InterruptedException, ExecutionException {
    return new MediaProcessingResult("userId","logId","taskId","hello");
  }
}
