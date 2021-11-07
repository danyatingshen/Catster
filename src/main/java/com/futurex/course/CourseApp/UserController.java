package com.futurex.course.CourseApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    //todo: integrate swagger UI

    @Autowired
    private UserDao userDao;

    @RequestMapping("/users")
    public List<User> getUsers() {
        return userDao.findAll();
    }

}
