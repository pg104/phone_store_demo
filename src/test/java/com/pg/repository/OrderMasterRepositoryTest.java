package com.pg.repository;

import com.pg.entity.OrderMaster;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.util.List;

@SpringBootTest
class OrderMasterRepositoryTest {
    @Autowired
    private OrderMasterRepository orderMasterRepository;

    @Test
    void findAll(){
        List<OrderMaster> list = orderMasterRepository.findAll();
        for (OrderMaster orderMaster : list) {
            System.out.println(orderMaster);
        }
    }

    @Test
    void save(){
        OrderMaster orderMaster = new OrderMaster();
        orderMaster.setOrderId("123456");
        orderMaster.setBuyerName("张三");
        orderMaster.setBuyerAddress("安徽省蚌埠市龙子湖区曹山路蚌埠学院");
        orderMaster.setBuyerPhone("13658568763");
        orderMaster.setOrderAmount(new BigDecimal(6400));
        orderMaster.setPayStatus(0);
        orderMaster.setPhoneIcon("../static/15a5dcf2-4b50-41a0-93e8-08df97c21341.jpg");
        orderMaster.setPhoneId(1);
        orderMaster.setPhoneName("HUAWEI 畅想9 Plus");
        orderMaster.setPhoneQuantity(2);
        orderMaster.setSpecsId(1);
        orderMaster.setSpecsName("32GB");
        orderMaster.setSpecsPrice(new BigDecimal(280000));
        orderMasterRepository.save(orderMaster);
    }

    @Test
    void findById(){
        OrderMaster orderMaster = orderMasterRepository.findById("123456").get();
        System.out.println(orderMaster);
    }

    @Test
    void pay(){
        OrderMaster orderMaster = orderMasterRepository.findById("123456").get();
        orderMaster.setPayStatus(1);
        orderMasterRepository.save(orderMaster);
    }
}