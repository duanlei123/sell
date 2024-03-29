package com.imooc.converter;

import com.imooc.dataobject.OrderMaster;
import com.imooc.dto.OrderDTO;
import org.springframework.beans.BeanUtils;
import org.springframework.data.domain.jaxb.SpringDataJaxb;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @ ClassName OrderMaster2OrderDTOConverter
 * @ Description
 * @ Auther wb-dl321273
 * @ Version 1.0
 **/
public class OrderMaster2OrderDTOConverter {

    public static OrderDTO convert(OrderMaster orderMaster){
        OrderDTO orderDTO = new OrderDTO();
        BeanUtils.copyProperties(orderMaster,orderDTO);
        return orderDTO;
    }

    public static List<OrderDTO> convert(List<OrderMaster> orderMasterList){
        return orderMasterList.stream().map(e ->
                    convert(e)
                ).collect(Collectors.toList());
    }
}
