package com.pg.service.impl;

import com.pg.entity.BuyerAddress;
import com.pg.form.AddressForm;
import com.pg.repository.BuyerAddressRepository;
import com.pg.service.AddressService;
import com.pg.vo.AddressVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class AddressServiceImpl implements AddressService {
    @Autowired
    private BuyerAddressRepository  buyerAddressRepository;
    @Override
    public List<AddressVO> findAll() {
        List<BuyerAddress> buyerAddressList = buyerAddressRepository.findAll();
        List<AddressVO> list = buyerAddressList.stream().map(e -> new AddressVO(
                e.getAddressId(),
                e.getAreaCode(),
                e.getBuyerName(),
                e.getBuyerPhone(),
                e.getBuyerAddress()
        )).collect(Collectors.toList());

        return list;
    }

    @Override
    public void saveOrUpdate(AddressForm addressForm) {
        BuyerAddress buyerAddress;
        if (addressForm.getId() == null){
            buyerAddress = new BuyerAddress();
        }else {
            buyerAddress = buyerAddressRepository.findById(addressForm.getId()).get();
        }
        buyerAddress.setBuyerName(addressForm.getName());
        buyerAddress.setBuyerPhone(addressForm.getTel());
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(addressForm.getProvince())
                .append(addressForm.getCity())
                .append(addressForm.getCounty());
        buyerAddress.setBuyerAddress(stringBuffer.toString());
        buyerAddress.setAreaCode(addressForm.getAreaCode());

        buyerAddressRepository.save(buyerAddress);
    }
}
