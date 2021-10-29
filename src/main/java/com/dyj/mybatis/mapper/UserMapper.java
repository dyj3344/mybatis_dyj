package com.dyj.mybatis.mapper;

import com.dyj.mybatis.domain.User;

import java.util.List;

public interface UserMapper {
//       /*
//        根据id查询用户
//     */
//
//    public User findUserById(int id);
//
//    /*
//        查询所有用户
//     */
//    public List<User> findAllResultMap();
//
//    /*
//    动态查询sql:if标签
//     */
//    public List<User> findUserByIf(User user);
//    /*
//   动态更新sql:set if标签
//    */
//    public void updateIf(User user);
//
//    /*
//   动态sql:foreach标签多值查询list
//    */
//    public List<User> findByList(List<Integer> list);
//
//    /*
//  动态sql:foreach标签多值查询array
//   */
//    public List<User> findByArray(Integer[] list);


    public  List<User> findAllWithOrder();

    public  List<User> findAllWithRole();
}
