package com.pg.service.impl;

import com.pg.dto.OrderDTO;
import com.pg.service.OrderService;
import com.pg.vo.OrderDetailVO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class OrderServiceImplTest {
    @Autowired
    private OrderService orderService;

    @Test
    void create() {
        OrderDTO orderDTO = new OrderDTO();
        orderDTO.setBuyerName("张三");
        orderDTO.setBuyerPhone("13678655643");
        orderDTO.setBuyerAddress("安徽省蚌埠市龙子湖区蚌埠学院");
        orderDTO.setSpecsId(1);
        orderDTO.setPhoneQuantity(1);

        OrderDTO result = orderService.create(orderDTO);
        System.out.println(result);
    }

    @Test
    void findOrderDetail(){
        OrderDetailVO orderDetailVO = orderService.findOrderDetailByOrderId("1636520529620390271");
        int i = 0;
    }

    @Test
    void pay(){
        System.out.println(orderService.pay("1636520529620390271"));
    }
}