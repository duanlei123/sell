package com.imooc.dataobject;

import com.imooc.enums.OrderStatusEnum;
import com.imooc.enums.PayStatusEnum;
import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * @ ClassName OrderMaster
 * @ Description 订单主表实体
 * @ Auther wb-dl321273
 * @ Version 1.0
 **/
@Entity
@DynamicUpdate
@Data
public class OrderMaster {

    @Id
    private String orderId;

    private String buyerName; //买家名称
    private String buyerPhone; //买家手机号
    private String buyerAddress; //地址
    private String buyerOpenid; //微信openid
    private BigDecimal orderAmount; //订单总金额
    private Integer orderStatus = OrderStatusEnum.NEW.getCode(); //订单状态 0新下单
    private Integer payStatus = PayStatusEnum.WAIT.getCode(); //支付状态 0未支付

//    @Transient  //忽略数据库对应字段
//    private List<OrderDetail> orderDetailList;

    private Date createTime;
    private Date updateTime;
}
