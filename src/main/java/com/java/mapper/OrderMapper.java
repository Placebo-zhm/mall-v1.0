package com.java.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.java.entity.Order;

import java.util.List;
import java.util.Map;

public interface OrderMapper extends BaseMapper<Order> {

    List<Order> list(Map<String,Object> map);

    Long getTotal(Map<String,Object> map);
}
