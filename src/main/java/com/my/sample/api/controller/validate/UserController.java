package com.my.sample.api.controller.validate;

import com.my.sample.api.model.form.UserAddForm;
import com.my.sample.api.model.form.UserEditForm;
import com.my.sample.api.model.po.User;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("users")
public class UserController {

    @PostMapping("")
    public User add(@Validated UserAddForm userAddForm) {
        log.info("参数内容：{}", userAddForm);

        // 转换成User对象，保存到数据库
        User user = new User();
        BeanUtils.copyProperties(userAddForm, user);
        user.setUserNo(RandomStringUtils.randomAlphanumeric(16));
        // 保存到数据库

        // 返回
        return user;
    }

    /**
     * 用户信息修改（普通），根据不同的组进行不同的数据验证
     *
     * @param userEditForm 表单信息
     */
    @PatchMapping("custom")
    public void customEdit(@Validated(UserEditForm.CustomUserEditGroup.class) UserEditForm userEditForm) {

    }

    /**
     * 用户信息修改（管理员），根据不同的组进行不同的数据验证
     *
     * @param userEditForm 表单信息
     */
    @PatchMapping("manager")
    public void managerEdit(@Validated(UserEditForm.ManagerUserEditGroup.class) UserEditForm userEditForm) {

    }
}
