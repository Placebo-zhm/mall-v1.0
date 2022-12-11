package com.java.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.java.entity.SmallType;

import java.util.List;
import java.util.Map;


public interface SmallTypeMapper extends BaseMapper<SmallType> {

    List<SmallType> list(Map<String,Object> map);

    Long getTotal(Map<String,Object> map);

    SmallType findById(Integer id);
}
