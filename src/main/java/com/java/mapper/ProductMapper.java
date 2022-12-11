package com.java.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.java.entity.Product;

import java.util.List;
import java.util.Map;


public interface ProductMapper extends BaseMapper<Product> {

    List<Product> list(Map<String,Object> map);

    Long getTotal(Map<String,Object> map);

    void add(Product product);

    void update(Product product);

    Product findById(Integer id);
}
