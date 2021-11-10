package com.pg.repository;

import com.pg.entity.BuyerAddress;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class BuyerAddressRepositoryTest {
    @Autowired
    private BuyerAddressRepository buyerAddressRepository;

    @Test
    void findAll(){
        List<BuyerAddress> list = buyerAddressRepository.findAll();
        for (BuyerAddress buyerAddress : list) {
            System.out.println(buyerAddress);
        }
    }

    @Test
    void save(){
        BuyerAddress buyerAddress = new BuyerAddress();
        buyerAddress.setBuyerName("张三");
        buyerAddress.setAreaCode("330104");
        buyerAddress.setBuyerAddress("安徽省蚌埠市龙子湖区曹山路蚌埠学院");
        buyerAddress.setBuyerPhone("13658568763");
        buyerAddressRepository.save(buyerAddress);
    }

    @Test
    void update(){
        BuyerAddress buyerAddress = buyerAddressRepository.findById(35).get();
        buyerAddress.setBuyerName("小明");
        buyerAddressRepository.save(buyerAddress);
    }
}