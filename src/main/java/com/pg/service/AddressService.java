package com.pg.service;

import com.pg.form.AddressForm;
import com.pg.vo.AddressVO;

import java.util.List;

public interface AddressService {
    public List<AddressVO> findAll();
    public void saveOrUpdate(AddressForm addressForm);
}
