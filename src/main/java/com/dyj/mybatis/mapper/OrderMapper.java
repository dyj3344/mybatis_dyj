package com.dyj.mybatis.mapper;

import com.dyj.mybatis.domain.Orders;

import java.util.List;

public interface OrderMapper {
    /*
    一对一关联查询,与此同时查询出每个订单所属的用户信息
     */
    public List<Orders> findAllWithUser();

}
