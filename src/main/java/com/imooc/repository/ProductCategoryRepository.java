package com.imooc.repository;

import com.imooc.dataobject.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * 类目dao层接口.
 */
public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Integer> {

    //注意方法名称不可修改
    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);
}
