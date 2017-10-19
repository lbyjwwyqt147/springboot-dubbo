package com.dubbo.dubboprovider.service;

import com.dubbo.dubboprovider.domain.City;

public interface CityService {


    /**
     * 根据城市名称，查询城市信息
     * @param cityName
     */
    City findCityByName(String cityName);


    String getCityName(String cityName);

}
