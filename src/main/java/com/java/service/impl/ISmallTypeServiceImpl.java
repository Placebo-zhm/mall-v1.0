package com.java.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.java.entity.SmallType;
import com.java.mapper.SmallTypeMapper;
import com.java.service.ISmallTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;


@Service("smallTypeService")
public class ISmallTypeServiceImpl extends ServiceImpl<SmallTypeMapper,SmallType> implements ISmallTypeService {

    @Autowired
    private SmallTypeMapper smallTypeMapper;

    @Override
    public List<SmallType> list(Map<String, Object> map) {
        return smallTypeMapper.list(map);
    }

    @Override
    public Long getTotal(Map<String, Object> map) {
        return smallTypeMapper.getTotal(map);
    }
}
