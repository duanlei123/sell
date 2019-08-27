package com.imooc.repository;

import com.imooc.dataobject.OrderDetail;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class OrderDetailRepositoryTest {

    @Autowired
    private OrderDetailRepository repository;

    @Test
    public void saveTest(){
        OrderDetail orderDetail = new OrderDetail();
        orderDetail.setDetailId("123456799");
        orderDetail.setOrderId("123457");
        orderDetail.setProductIcon("http://xxxx.jpg");
        orderDetail.setProductId("123457");
        orderDetail.setProductName("皮皮虾");
        orderDetail.setProductPrice(new BigDecimal(2.2));
        orderDetail.setProductQuantity(2);
        OrderDetail save = repository.save(orderDetail);
        Assert.assertNotNull(save);

    }

    @Test
    public void findByOrderIdTest(){
        List<OrderDetail> byOrderId = repository.findByOrderId("123457");
        Assert.assertNotEquals(0,byOrderId.size());
    }
}