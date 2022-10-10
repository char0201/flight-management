package com.flight.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.flight.dto.User;

public interface UserDao extends JpaRepository<User, Long> {

}
