package com.futurex.course.CourseApp.resources;

import java.util.concurrent.ExecutionException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.futurex.course.CourseApp.manager.log.LogManager;
import com.futurex.course.CourseApp.model.log.Log;
import com.futurex.course.CourseApp.model.log.LogIdentifier;
import com.futurex.course.CourseApp.model.log.SingleLog;
import com.futurex.course.CourseApp.model.log.SingleLogEgg;


@RestController
public class LogResource {
  @Autowired
  private LogManager logManager;

  @GetMapping("/log/debug")
  @CrossOrigin
  public String test() throws InterruptedException, ExecutionException {
    return "log Working";
  }

  @PostMapping("/log/insert/singleLog")
  @CrossOrigin
  public SingleLog insertALog(@RequestBody SingleLogEgg singleLogEgg) throws InterruptedException, ExecutionException {
    return logManager.insertASingleLog(singleLogEgg);
  }

  @GetMapping("/log/all")
  @CrossOrigin
  public Log getAllLog(@RequestParam String userId, @RequestParam String logId) throws InterruptedException, ExecutionException {
    return logManager.getAllLog(new LogIdentifier(userId,logId));
  }
}
