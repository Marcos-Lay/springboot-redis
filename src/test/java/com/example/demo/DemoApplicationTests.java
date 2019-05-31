package com.example.demo;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.demo.dao.UserDao;
import com.example.demo.entity.User;
import com.example.demo.mapper.UserMapper;
import com.example.demo.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {
    @Resource
    private UserMapper userMapper;
    @Resource
    private UserDao userDao;
    @Resource
    private UserService userService;
    @Test
    public void test() {
        User user = userMapper.selectById(1);
        System.out.println(user);
    }
    @Test
    public void query(){
        User users = userDao.queryUser(1);
        System.out.println(users);
    }
    @Test
    public void insert(){
        try {
            User user = new User();
            user.setId(12);
            user.setName("malei");
            userDao.insertUser(user);

        } catch (Exception e) {
            e.printStackTrace();

        }
    }
    //mybatis-plus分页与条件查询
    @Test
    public void selectPage(){
        Page<User> userPage = new Page<>(1, 2);
        QueryWrapper<User> userQueryWrapper = new QueryWrapper<>();
        userQueryWrapper.eq("name","malei");
        IPage<User> userIPage = userMapper.selectPage(userPage, userQueryWrapper);
        System.out.println(userIPage.getRecords());
    }
    @Test
    public void MHselect(){
        QueryWrapper<User> userQueryWrapper = new QueryWrapper<>();
        userQueryWrapper.like("name","malei");
        List<User> users = userMapper.selectList(userQueryWrapper);
        users.forEach(System.out::println);
    }
    //@TableField(strategy = FieldStrategy.IGNORED)
    //插入null值
    @Test
    public void update(){
        User user = new User();
        user.setId(1);
        user.setName("name");
        user.setName1(null);
        userMapper.updateById(user);
    }
    @Test
    public void queryRedis(){
        User users = userService.queryUser(32);
        System.out.println(users);
    }
    @Test
    public void insertRedis(){
        User user = new User();
        user.setId(34);
        user.setName("malei");
        user.setAge(1);
        user.setName1("malei");
        userService.insertUser(user);
    }
    @Test
    public void deleteUser(){
        userService.deleteUser(30);
    }
}
