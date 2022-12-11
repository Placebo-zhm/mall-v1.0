package com.java.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.java.entity.BigType;


public interface BigTypeMapper extends BaseMapper<BigType> {

    public BigType findById(Integer id);
}
