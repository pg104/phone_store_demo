package com.pg.service.impl;

import com.pg.form.AddressForm;
import com.pg.service.AddressService;
import com.pg.vo.AddressVO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class AddressServiceImplTest {
    @Autowired
    private AddressService addressService;

    @Test
    void findAll() {
        List<AddressVO> list = addressService.findAll();
        int i = 0;
    }

    @Test
    void saveOrUpdate(){
        AddressForm addressForm = new AddressForm();
        addressForm.setId(35);
        addressForm.setName("李四");
        addressForm.setTel("13656764587");
        addressForm.setProvince("安徽省");
        addressForm.setCity("蚌埠市");
        addressForm.setCounty("龙子湖区");
        addressForm.setAreaCode("101010");
        addressForm.setAddressDetail("蚌埠学院");
        addressService.saveOrUpdate(addressForm);
    }
}