package com.futurex.Caster;

import java.math.BigInteger;

import org.springframework.data.jpa.repository.JpaRepository;

import com.futurex.Caster.model.users.User;

public interface UserDao extends JpaRepository<User, BigInteger> {
}
