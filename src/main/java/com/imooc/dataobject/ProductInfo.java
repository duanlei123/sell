package com.imooc.dataobject;

import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @ ClassName ProductInfo
 * @ Description 商品实体
 * @ Auther wb-dl321273
 * @ Version 1.0
 **/
@Table(name = "product_info")
@Entity
@DynamicUpdate
@Data
public class ProductInfo {

    @Id
    private String productId;

    private String productName; //名称
    private BigDecimal productPrice; //单价
    private Integer productStock; //库存
    private String productDescription; //描述
    private String productIcon; //小图
    private Integer productStatus; //状态 0正常 1下架
    private Integer categoryType; //类目编号


    private Date createTime;
    private Date updateTime;
}
