package com.pg.repository;

import com.pg.entity.PhoneCategory;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class PhoneCategoryRepositoryTest {
    @Autowired
    private PhoneCategoryRepository phoneCategoryRepository;

    @Test
    void findAll(){
        List<PhoneCategory> list = phoneCategoryRepository.findAll();
        for (PhoneCategory phoneCategory : list) {
            System.out.println(phoneCategory);
        }
    }

    @Test
    void findByCategoryType(){
        PhoneCategory phoneCategory = phoneCategoryRepository.findByCategoryType(1);
        System.out.println(phoneCategory);
    }

}