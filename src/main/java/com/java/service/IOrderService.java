package com.java.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.java.entity.Order;

import java.util.List;
import java.util.Map;


public interface IOrderService extends IService<Order> {

    /**
     * 根据条件分页查询订单数据
     * @param map
     * @return
     */
    List<Order> list(Map<String,Object> map);

    /**
     * 根据条件查询订单总记录数
     * @param map
     * @return
     */
    Long getTotal(Map<String,Object> map);
}
