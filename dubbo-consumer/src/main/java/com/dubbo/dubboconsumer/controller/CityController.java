package com.dubbo.dubboconsumer.controller;

import com.dubbo.dubboconsumer.service.MyCityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CityController {

    @Autowired
    MyCityService myCityService;

    @GetMapping(value = "/hi")
    public String hi(String name){
        return myCityService.getCityName();
    }
}
