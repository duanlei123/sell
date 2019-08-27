package com.imooc.dataobject;

import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.util.Date;

/**
 * @ ClassName ProductCategory
 * @ Description 类目实体类
 * @ Auther wb-dl321273
 * @ Version 1.0
 * product_category
 **/
//@Table(name = "product_category") 如果表名和类名未按照表名下划线, 类目驼峰方式命名.需要做一个表名和实体类的映射
@Entity
@DynamicUpdate  //作用是动态更新的作用, 修改操作时,先查询后更新, 时的updateTime自动更新。
@Data   //代替get 和 set 方法。
public class ProductCategory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer categoryId; //类目id
    private String categoryName; //类目名称
    private Integer categoryType; //类目编号

    private Date createTime;
    private Date updateTime;
}
