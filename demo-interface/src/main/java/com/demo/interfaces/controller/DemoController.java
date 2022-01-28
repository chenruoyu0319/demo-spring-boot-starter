package com.demo.interfaces.controller;

import com.demo.starter.DemoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author cry777
 * @program demo1
 * @description
 * @create 2022-01-27
 */
@RestController
public class DemoController {

    @Resource(name = "demo")
    private DemoService demoService;

    @GetMapping("/say")
    public String sayWhat(){
        return demoService.say();
    }

}