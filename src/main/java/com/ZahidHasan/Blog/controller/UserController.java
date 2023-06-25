package com.ZahidHasan.Blog.controller;

import com.ZahidHasan.Blog.dto.UserDTO;
import com.ZahidHasan.Blog.model.User;
import com.ZahidHasan.Blog.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class UserController {
    @Autowired
    UserService userService;

    @PostMapping("/user")
    public ResponseEntity<> saveUser(@RequestBody UserDTO userDTO) {
        userService.saveUser(userDTO);

    }
}
