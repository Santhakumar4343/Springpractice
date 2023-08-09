package com.nsk.repo;


import org.springframework.data.jpa.repository.JpaRepository;

import com.nsk.entity.User;
public interface UserRepository extends JpaRepository<User, Long> {
}
