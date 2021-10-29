package com.dyj.mybatis.test;

import com.dyj.mybatis.domain.User;
import com.dyj.mybatis.mapper.UserMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserTest {

//    @Test
//    public  void test1() throws IOException {
//        InputStream resourceAsStream = Resources.getResourceAsStream("sqlMapConfig.xml");
//        SqlSessionFactory build = new SqlSessionFactoryBuilder().build(resourceAsStream);
//        SqlSession sqlSession = build.openSession();
//        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
//        //pageNum当前页,pageSize每页显示的条数,写在调用方法上面
//        PageHelper.startPage(1,1);
//        List<User> allResultMap = mapper.findAllResultMap();
//        for (User user : allResultMap) {
//            System.out.println(user);
//        }
//        PageInfo<User> userPageInfo = new PageInfo<User>(allResultMap);
//        System.out.println("总条数:"+userPageInfo.getTotal());
//        System.out.println("总页数:"+userPageInfo.getPages());
//        System.out.println("是否是第一页:"+userPageInfo.isIsFirstPage());
//        sqlSession.close();
//    }
//    @Test
//    public  void test2() throws IOException {
//        InputStream resourceAsStream = Resources.getResourceAsStream("sqlMapConfig.xml");
//        SqlSessionFactory build = new SqlSessionFactoryBuilder().build(resourceAsStream);
//        SqlSession sqlSession = build.openSession();
//        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
//        User user = new User();
//        user.setId(3);
//        user.setUsername("test");
//        List<User> allResultMap = mapper.findUserByIf(user);
//        for (User users : allResultMap) {
//            System.out.println(users);
//        }
//    }
//
//    @Test
//    public  void test3() throws IOException {
//        InputStream resourceAsStream = Resources.getResourceAsStream("sqlMapConfig.xml");
//        SqlSessionFactory build = new SqlSessionFactoryBuilder().build(resourceAsStream);
//        SqlSession sqlSession = build.openSession(true);
//        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
//        User user = new User();
//        user.setId(1);
//        user.setUsername("dyj");
//        user.setBirthday(new Date());
//        user.setSex("男");
////        user.setAddress("福建");
//        mapper.updateIf(user);
//        sqlSession.close();
//    }
//    @Test
//    public  void test4() throws IOException {
//        InputStream resourceAsStream = Resources.getResourceAsStream("sqlMapConfig.xml");
//        SqlSessionFactory build = new SqlSessionFactoryBuilder().build(resourceAsStream);
//        SqlSession sqlSession = build.openSession(true);
//        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
//        List<Integer> list = new ArrayList<>();
//        list.add(1);
//        list.add(2);
//        list.add(3);
//
////        user.setAddress("福建");
//        List<User> listuser = mapper.findByList(list);
//        for (User user : listuser) {
//            System.out.println(user);
//        }
//        sqlSession.close();
//    }
//    @Test
//    public  void test5() throws IOException {
//        InputStream resourceAsStream = Resources.getResourceAsStream("sqlMapConfig.xml");
//        SqlSessionFactory build = new SqlSessionFactoryBuilder().build(resourceAsStream);
//        SqlSession sqlSession = build.openSession(true);
//        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
//        Integer[] array = new Integer[]{1,2,3};
//
//
//        List<User> listuser = mapper.findByArray(array);
//        for (User user : listuser) {
//            System.out.println(user);
//        }
//        sqlSession.close();
//    }
    @Test
public  void test1() throws IOException {
                InputStream resourceAsStream = Resources.getResourceAsStream("sqlMapConfig.xml");
        SqlSessionFactory build = new SqlSessionFactoryBuilder().build(resourceAsStream);
        SqlSession sqlSession = build.openSession(true);
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> allWithOrder = mapper.findAllWithOrder();
        for (User user : allWithOrder) {
            System.out.println(user);
        }
    }
    @Test
    public  void test2() throws IOException {
        InputStream resourceAsStream = Resources.getResourceAsStream("sqlMapConfig.xml");
        SqlSessionFactory build = new SqlSessionFactoryBuilder().build(resourceAsStream);
        SqlSession sqlSession = build.openSession(true);
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> allWithOrder = mapper.findAllWithRole();
        for (User user : allWithOrder) {
            System.out.println(user);
        }
    }
}
