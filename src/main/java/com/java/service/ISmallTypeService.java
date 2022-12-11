package com.java.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.java.entity.SmallType;

import java.util.List;
import java.util.Map;


public interface ISmallTypeService extends IService<SmallType> {
    List<SmallType> list(Map<String,Object> map);

    Long getTotal(Map<String,Object> map);
}
