package com.java.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.java.entity.WxUserInfo;
import com.java.mapper.WxUserInfoMapper;
import com.java.service.IWxUserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service("wxUserInfoService")
public class IWxUserInfoServiceImpl extends ServiceImpl<WxUserInfoMapper,WxUserInfo> implements IWxUserInfoService {

    @Autowired
    private WxUserInfoMapper wxUserInfoMapper;
}
