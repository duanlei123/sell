package com.imooc.utils;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.Random;

/**
 * @ ClassName KeyUtils
 * @ Description
 * @ Auther wb-dl321273
 * @ Version 1.0
 **/
public class KeyUtils {


    /**
     * 生成唯一主键
     * 格式: 时间 + 随机数
     * @return 主键 -- 防止多线程下重复
     */
    public static synchronized String getUniqueKey(){
        Random random = new Random();
        Integer number = random.nextInt(900000) + 10000;
        return System.currentTimeMillis() + String.valueOf(number);
    }

}
