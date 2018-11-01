package com.my.sample.api.controller.validate;

import com.my.sample.api.model.form.UserAddForm;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("users")
public class UserController {

    @PostMapping("")
    public String add(@Validated UserAddForm userAddForm) {
        log.info("参数内容：{}", userAddForm);
        return "success";
    }
}
