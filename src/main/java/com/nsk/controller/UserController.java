package com.nsk.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nsk.entity.User;
import com.nsk.service.UserService;

@RestController
@RequestMapping("/api/users")
@CrossOrigin("*")
public class UserController {

 @Autowired
private  UserService userService;

 @PostMapping("/save")
 public ResponseEntity<User> createUser(@RequestBody User user) {
     User savedUser = userService.saveUser(user);
     return ResponseEntity.ok(savedUser);
 }
}
