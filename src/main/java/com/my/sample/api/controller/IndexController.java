package com.my.sample.api.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {

    @GetMapping("/index")
    public String index(Model model) {
        model.addAttribute("message", "我是首页");
        return "index";
    }

    @GetMapping("/ex/view")
    public String ex(Model model) {
        throw new UnsupportedOperationException("测试页面返回错误");
    }

}
