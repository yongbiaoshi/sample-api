package com.my.sample.api.controller.refresh;

import com.my.sample.api.config.properties.RefreshableProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("prop")
public class PropertyController {

    @Resource
    private RefreshableProperties properties;

    /**
     * 通过调用 POST /actuator/refhresh 来刷新该结果
     *
     * @return
     */
    @GetMapping("limit")
    public int limit() {
        return properties.getLimit();
    }
}
