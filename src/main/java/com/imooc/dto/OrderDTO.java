package com.imooc.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.imooc.dataobject.OrderDetail;
import com.imooc.enums.OrderStatusEnum;
import com.imooc.enums.PayStatusEnum;
import com.imooc.utils.serializer.Date2Long;
import lombok.Data;

import javax.persistence.Transient;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @ ClassName OrderDTO
 * @ Description
 * @ Auther wb-dl321273
 * @ Version 1.0
 **/
@Data
//@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
//@JsonInclude(JsonInclude.Include.NON_NULL)
public class OrderDTO {

    private String orderId;

    private String buyerName; //买家名称
    private String buyerPhone; //买家手机号
    private String buyerAddress; //地址
    private String buyerOpenid; //微信openid
    private BigDecimal orderAmount; //订单总金额
    private Integer orderStatus; //订单状态 0新下单
    private Integer payStatus; //支付状态 0未支付

    private List<OrderDetail> orderDetailList;

    @JsonSerialize(using = Date2Long.class)
    private Date createTime;

    @JsonSerialize(using = Date2Long.class)
    private Date updateTime;
}
