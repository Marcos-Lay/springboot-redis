package com.example.demo.dao;

import com.example.demo.entity.User;
import org.apache.ibatis.annotations.Select;
//@Mapper
public interface UserDao {
    @Select("select * from user where id = #{id}")
    User queryUser(Integer id);
    //@Insert("insert into user(id,name) value(#{id},#{name})")
    void insertUser(User user);

    void deleteUser(int id);

    @Select("slect * from user where id = #{id}")
    User queryOne(int id);
}
