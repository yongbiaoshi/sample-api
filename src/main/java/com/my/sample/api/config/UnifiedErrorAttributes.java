package com.my.sample.api.config;

import org.springframework.boot.web.servlet.error.DefaultErrorAttributes;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.WebRequest;

import java.util.Map;


@Component
public class UnifiedErrorAttributes extends DefaultErrorAttributes {

    /**
     * 统一错误返回结构体与{@link UnifiedResponse}相同
     * @param webRequest　请求
     * @param includeStackTrace　堆栈信息
     * @return 返回数据
     */
    @Override
    public Map<String, Object> getErrorAttributes(WebRequest webRequest, boolean includeStackTrace) {
        Map<String, Object> attributes = super.getErrorAttributes(webRequest, includeStackTrace);
        attributes.put("result_code", attributes.get("status"));
        return attributes;
    }

}
