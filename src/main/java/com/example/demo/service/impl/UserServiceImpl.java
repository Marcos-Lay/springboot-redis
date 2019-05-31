package com.example.demo.service.impl;

import com.example.demo.dao.UserDao;
import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @program: demo
 * @description:
 * @author: Marcos-Lay
 * @create: 2019-05-29 11:01
 **/
@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserDao userDao;
    @Override
    @Cacheable(value = "user",key = "#id")
    public User queryUser(Integer id) {
        User users = userDao.queryUser(id);
        return users;
    }

    @Override
    @CachePut(value = "user",key = "#user.id")
    //@CachePut(value = "user",key = "#user.id")
    public User insertUser(User user) {
        userDao.insertUser(user);
        User user1 = userDao.queryUser(user.getId());
        return user1;
    }

    @Override
    @CacheEvict(value = "user",key = "#id")
    public void deleteUser(Integer id) {
        userDao.deleteUser(id);
    }
}
