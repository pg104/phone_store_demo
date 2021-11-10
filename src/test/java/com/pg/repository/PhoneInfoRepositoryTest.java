package com.pg.repository;

import com.pg.entity.PhoneInfo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class PhoneInfoRepositoryTest {
    @Autowired
    private PhoneInfoRepository phoneInfoRepository;

    @Test
    void findAll(){
        List<PhoneInfo> list = phoneInfoRepository.findAll();
        for (PhoneInfo phoneInfo : list) {
            System.out.println(phoneInfo);
        }
    }

    @Test
    void findByCategoryType(){
        List<PhoneInfo> list = phoneInfoRepository.findByCategoryType(1);
        for (PhoneInfo phoneInfo : list) {
            System.out.println(phoneInfo);
        }
    }
}