package com.nsk.service;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nsk.entity.User;
import com.nsk.repo.UserRepository;

@Service
public class UserService {
 @Autowired
private  UserRepository userRepository;

 public User saveUser(User user) {
     return userRepository.save(user);
 }
}

