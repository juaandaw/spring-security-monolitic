package com.juanmidev.blog.aplication.post.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.juanmidev.blog.aplication.post.repository.entity.Post;


public interface PostRepository extends JpaRepository<Post, Long> {

}
