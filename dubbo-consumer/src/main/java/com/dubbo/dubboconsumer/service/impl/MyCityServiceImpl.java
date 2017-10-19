package com.dubbo.dubboconsumer.service.impl;

import com.alibaba.dubbo.config.annotation.Reference;
import com.dubbo.dubboconsumer.service.MyCityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.CityService;

@Service
public class MyCityServiceImpl implements MyCityService{

    @Reference(version="1.0.0")   //服务消费方配置   引入服务提供方的接口实现
    private CityService citySercvice;

    @Override
    public String getCityName() {
        return citySercvice.getCityName("昌都");
    }
}
