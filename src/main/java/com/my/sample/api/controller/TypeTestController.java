package com.my.sample.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class TypeTestController {

    @GetMapping("int")
    public int anInt() {
        return 100;
    }

    @GetMapping("double")
    public double aDouble() {
        return 23.12d;
    }

    @GetMapping("map")
    public Map<String, Object> aMap() {
        Map<String, Object> map = new HashMap<>();
        map.put("name", "测试");
        map.put("age", 18);
        map.put("adress", "北京");
        map.put("price", 123.24d);
        return map;
    }
}
