package com.juanmidev.blog.aplication.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.juanmidev.blog.aplication.user.repository.entity.User;


public interface UserRepository extends JpaRepository<User, Long> {

}
