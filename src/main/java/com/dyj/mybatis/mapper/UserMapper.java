package com.dyj.mybatis.mapper;

import com.dyj.mybatis.domain.User;

import java.util.List;

public interface UserMapper {
       /*
        根据id查询用户
     */

    public User findUserById(int id);

    /*
        查询所有用户
     */
    public List<User> findAllResultMap();
}
