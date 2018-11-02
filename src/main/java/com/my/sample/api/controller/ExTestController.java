package com.my.sample.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExTestController {

    @GetMapping("ex")
    public String ex() {
        throw new UnsupportedOperationException("测试异常返回");
    }

    @GetMapping("bind")
    public String bindEx() {
        throw new IllegalArgumentException("测试异常");
    }

}
