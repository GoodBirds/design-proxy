package com.liwei.designproxy.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liwei
 * @create: 2020/3/17 11:50 下午
 */
@RestController
public class IndexController {

    @GetMapping
    public String getUser(String name, Integer age) {
        return "name:" + name + "age:" + age;
    }
}
