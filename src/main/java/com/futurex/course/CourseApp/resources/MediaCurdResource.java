package com.futurex.course.CourseApp.resources;

import java.util.concurrent.ExecutionException;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MediaCurdResource {
  @GetMapping("/media/debug")
  public String test() throws InterruptedException, ExecutionException {
    return "Working";
  }
}
