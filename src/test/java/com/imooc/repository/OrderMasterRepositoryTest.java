package com.imooc.repository;

import com.imooc.dataobject.OrderMaster;
import org.aspectj.weaver.ast.Or;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

@RunWith(SpringRunner.class)
@SpringBootTest
public class OrderMasterRepositoryTest {

    @Autowired
    private OrderMasterRepository repository;


    @Test
    public void saveTest(){
        OrderMaster orderMaster = new OrderMaster();
        orderMaster.setOrderId("123457");
        orderMaster.setBuyerName("玉麒麟");
        orderMaster.setBuyerPhone("13356986554");
        orderMaster.setBuyerAddress("梁山左屋");
        orderMaster.setBuyerOpenid("002");
        orderMaster.setOrderAmount(new BigDecimal(2.5));
        OrderMaster save = repository.save(orderMaster);
        Assert.assertNotNull(save);
    }

    @Test
    public void findByBuyerOpenidTest(){
        PageRequest pageRequest = PageRequest.of(0,3);
        Page<OrderMaster> byBuyerOpenid = repository.findByBuyerOpenid("001", pageRequest);
        Assert.assertNotEquals(0,byBuyerOpenid.getTotalElements());
    }

}