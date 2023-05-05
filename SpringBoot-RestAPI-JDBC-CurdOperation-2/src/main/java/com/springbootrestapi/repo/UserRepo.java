package com.springbootrestapi.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springbootrestapi.entity.User;

public interface UserRepo extends JpaRepository<User,Long> {
}
