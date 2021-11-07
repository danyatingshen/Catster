package com.futurex.course.CourseApp;

import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigInteger;

public interface UserDao extends JpaRepository<User, BigInteger> {
}
