package com.imooc.exception;

import com.imooc.enums.ResultEnum;

import javax.persistence.criteria.CriteriaBuilder;

/**
 * @ ClassName SellException
 * @ Description 异常
 * @ Auther wb-dl321273
 * @ Version 1.0
 **/
public class SellException extends RuntimeException{

    private Integer code;

    public SellException(ResultEnum resultEnum) {
        super(resultEnum.getMessage());
        this.code = resultEnum.getCode();
    }

    public SellException(Integer code, String message) {
        super(message);
        this.code = code;
    }
}
