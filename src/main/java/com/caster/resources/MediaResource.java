package com.caster.resources;

import java.util.concurrent.ExecutionException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.caster.model.media.MediaProcessingResult;
import com.caster.manager.media.MediaManager;

@RestController
public class MediaResource {

  @Autowired
  private MediaManager mediaManager;

  @GetMapping("/media/debug")
  @CrossOrigin
  public String test() throws InterruptedException, ExecutionException {
    return "Working";
  }

  @PostMapping("/media/process")
  @CrossOrigin
  public MediaProcessingResult mediaProcessor(@RequestParam("userId") String userId,
                                              @RequestParam("logId") String logId,
                                              @RequestParam("file") MultipartFile file) throws InterruptedException, ExecutionException {
   return mediaManager.processMedia(userId,logId,file);
  }
}
