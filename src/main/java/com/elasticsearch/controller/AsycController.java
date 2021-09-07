package com.elasticsearch.controller;

import com.elasticsearch.service.AsycService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description：
 * @Param
 * @Author 郭权钦
 * @Date 20:50
 */
@RestController
public class AsycController {

    @Autowired
    AsycService asycService;

    @GetMapping(value = "/asyc")
    public String test1(){
        asycService.asyc();
        return "fuck";
    }
}
