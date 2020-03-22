package com.dyr.dao;

import com.dyr.pojo.User;

import java.util.List;
import java.util.Map;

public interface UserDao {
    //查询全部用户
    List<User> getUserList();
    //根据id查询用户
    User getUserById(int id);
    //插入用户
    int addUser(User user);
    //修改用户信息
    int updateUser(User user);
    //删除用户
    int deleteUser(int id);

    //使用map的万能方法
    int addUser2(Map<String,Object> map);
}
