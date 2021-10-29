package com.dyj.mybatis.domain;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Orders {

    private Integer id;
    private String ordertime;
    private Double total;
    private Integer uid;

    // 表示当前订单属于那个用户 association
    private User user;


}
