package com.my.sample.api.controller;

import net.bytebuddy.implementation.bytecode.Throw;
import org.springframework.boot.context.properties.bind.BindResult;
import org.springframework.validation.BindException;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.HttpClientErrorException;

import java.nio.charset.Charset;

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
