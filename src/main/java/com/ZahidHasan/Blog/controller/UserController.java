package com.ZahidHasan.Blog.controller;

import com.ZahidHasan.Blog.dto.UserDTO;
import com.ZahidHasan.Blog.model.User;
import com.ZahidHasan.Blog.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class UserController {
    @Autowired
    UserService userService;

    @PostMapping("/user")
    public ResponseEntity<String>  saveUser(@RequestBody UserDTO userDTO) {
        boolean isSaved = userService.saveUser(userDTO);
        if(isSaved) {
            return ResponseEntity.ok("User has been saved successfully");
        }
        return (ResponseEntity<String>) ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
