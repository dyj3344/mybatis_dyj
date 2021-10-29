package com.dyj.mybatis.test;

import com.dyj.mybatis.domain.Orders;
import com.dyj.mybatis.mapper.OrderMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class OrderTest {

    @Test
    public  void test1() throws IOException {
        InputStream resourceAsStream = Resources.getResourceAsStream("sqlMapConfig.xml");
        SqlSessionFactory build = new SqlSessionFactoryBuilder().build(resourceAsStream);
        SqlSession sqlSession = build.openSession();
        OrderMapper mapper = sqlSession.getMapper(OrderMapper.class);
        List<Orders> allWithUser = mapper.findAllWithUser();

        for (Orders orders : allWithUser) {
            System.out.println(orders);
        }
        sqlSession.close();


    }
}
