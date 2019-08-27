package com.imooc;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @ ClassName LoggerTest
 * @ Description 日志测试类
 * @ Auther wb-dl321273
 * @ Version 1.0
 **/
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j   //注解代替 LoggerFactory
public class LoggerTest {

    private final Logger logger = LoggerFactory.getLogger(LoggerTest.class);

    @Test
    public void test02(){
        String name = "imooc";
        String password = "123456";
        log.info("name: {}, password: {}", name, password);
        logger.error("error...");
        logger.warn("warn...");
    }

    @Test
    public void test01(){
        String name = "imooc";
        String password = "123456";

        log.debug("debug...");
        log.info("name: " + name + " ,password: " + password);
        log.info("name: {}, password: {}", name, password);
        log.error("error...");
        log.warn("warn...");
    }
}
