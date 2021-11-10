package com.pg.service.impl;

import com.pg.service.PhoneService;
import com.pg.vo.DataVO;
import com.pg.vo.PhoneInfoVO;
import com.pg.vo.SpecsPackageVO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class PhoneServiceImplTest {
    @Autowired
    private PhoneService phoneService;

    @Test
    void findDataVO() {
        DataVO dataVO = phoneService.findDataVO();
        int i = 0;
    }

    @Test
    void findPhoneInfoVOByCategoryType(){
        List<PhoneInfoVO> list = phoneService.findPhoneInfoVOByCategoryType(2);
        int i = 0;
    }

    @Test
    void findSku(){
        SpecsPackageVO specsPackageVO = phoneService.findSpecsByPhoneId(1);
        int i = 0;
    }

    @Test
    void subStock(){
        phoneService.subStock(2,1);
    }
}