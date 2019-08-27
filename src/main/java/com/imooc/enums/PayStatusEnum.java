package com.imooc.enums;

import lombok.Getter;

/**
 * @ ClassName PayStatusEnum
 * @ Description
 * @ Auther wb-dl321273
 * @ Version 1.0
 **/
@Getter
public enum  PayStatusEnum {

    WAIT(0,"未支付"),
    SUCCESS(1,"已支付"),
    ;
    private Integer code;
    private String message;

    PayStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
