package com.imooc.dto;

import lombok.Data;

/**
 * @ ClassName CartDTO
 * @ Description  DTO包下对象用例接收前端传入的数据的。
 * @ Auther wb-dl321273
 * @ Version 1.0
 **/
@Data
public class CartDTO {

    private String productId;
    private Integer productQuantity;

    public CartDTO(String productId, Integer productQuantity) {
        this.productId = productId;
        this.productQuantity = productQuantity;
    }
}
