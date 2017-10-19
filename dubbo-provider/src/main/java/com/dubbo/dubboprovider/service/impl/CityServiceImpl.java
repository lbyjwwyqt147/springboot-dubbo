package com.dubbo.dubboprovider.service.impl;


import com.dubbo.dubboprovider.domain.City;
import com.alibaba.dubbo.config.annotation.Service;
import service.CityService;


// 注册为 Dubbo 服务


@Service(version="1.0.0")   //服务提供方配置   包：com.alibaba.dubbo.config.annotation.Service
public class CityServiceImpl implements CityService {

    public City findCityByName(String cityName) {
        return new City(1L,2L,"温岭","是我的故乡");
    }

    @Override
    public String getCityName(String cityName) {
        return "hello !  欢迎来到"+cityName;
    }
}
