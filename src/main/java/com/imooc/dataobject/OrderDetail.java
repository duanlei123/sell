package com.imooc.dataobject;


import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @ ClassName OrderDetail
 * @ Description
 * @ Auther wb-dl321273
 * @ Version 1.0
 **/
@Entity
@DynamicUpdate
@Data
public class OrderDetail {

    @Id
    private String detailId;

    private String orderId; //订单id
    private String productId; //商品id
    private String productName; //商品名称
    private BigDecimal productPrice; //商品单价
    private Integer productQuantity; //商品数量
    private String productIcon; //商品图片

    private Date createTime;
    private Date updateTime;

}
