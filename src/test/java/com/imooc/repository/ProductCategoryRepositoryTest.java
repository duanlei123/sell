package com.imooc.repository;

import com.imooc.dataobject.ProductCategory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import javax.transaction.Transactional;
import java.util.Arrays;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductCategoryRepositoryTest {

    @Autowired
    private ProductCategoryRepository repository;

    @Test
    public void findOneTest(){
//        ProductCategory productCategory = repository.getOne(1); //当参数id为空直接报错.
        ProductCategory productCategory = repository.findById(1).get(); //当参数id为空返回null
        Assert.assertNotNull(productCategory);
    }

    @Test
    @Transactional  //回归操作
    public void saveTest(){
        ProductCategory productCategory = new ProductCategory();
        productCategory.setCategoryName("测试专用");
        productCategory.setCategoryType(3);
        ProductCategory save = repository.save(productCategory);
        Assert.assertNotNull(save);
    }

    @Test
    @Transactional
    public void updateTest(){
        ProductCategory productCategory = repository.findById(1).get();
        productCategory.setCategoryName("测试专用");
        ProductCategory save = repository.save(productCategory);
        Assert.assertNotNull(save);
    }

    @Test
    public void findByCategoryTypeInTest(){
        List<Integer> list = Arrays.asList(2,3,4);
        List<ProductCategory> categoryTypeIn = repository.findByCategoryTypeIn(list);
        Assert.assertNotEquals(0,categoryTypeIn.size());
    }
}