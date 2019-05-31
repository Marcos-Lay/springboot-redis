package com.example.demo.service;

import com.example.demo.entity.User;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface UserService {
    User queryUser(Integer id);

    User insertUser(User user);

    void deleteUser(Integer id);
}
