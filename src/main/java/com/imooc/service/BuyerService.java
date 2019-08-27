package com.imooc.service;

import com.imooc.dto.OrderDTO;

/**
 * @ ClassName BuyerService
 * @ Description  买家service
 * @ Auther wb-dl321273
 * @ Version 1.0
 **/
public interface BuyerService {

    //查询一个订单
    OrderDTO findOrderOne(String openid, String orderId);
    //取消订单
    OrderDTO cancelOrder(String openid, String orderId);
}
