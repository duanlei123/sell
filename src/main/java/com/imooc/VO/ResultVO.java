package com.imooc.VO;

import lombok.Data;

/**
 * @ ClassName ResultVO
 * @ Description http请求返回最外层对象 VO用来返回到前端数据的.
 * @ Auther wb-dl321273
 * @ Version 1.0
 **/
@Data
public class ResultVO<T> {

    //错误码
    private Integer code;
    //提示信息
    private String msg = "";
    //具体内容
    private T data;
}
