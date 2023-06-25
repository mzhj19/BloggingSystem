package com.ZahidHasan.Blog.repository;

import com.ZahidHasan.Blog.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
