package com.pg.enums;

import lombok.Getter;

@Getter
public enum PayStatusEnum {
    UNPAID(0,"未支付"),
    PAID(1,"已支付");

    private Integer  code;
    private String msg;

    PayStatusEnum(Integer oce, String msg) {
        this.code = oce;
        this.msg = msg;
    }
}
