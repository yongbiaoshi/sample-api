package com.my.sample.api.config;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;

import java.util.Objects;

/**
 * 接口统一返回结构体
 *
 * @author shiyongbiao
 */
@Builder
@Data
public class UnifiedResponse {

    @JsonProperty("result_code")
    private int resultCode;
    private String message;
    private Object attachment;

    public String toJsonString() {
        return
                String.format(
                        "{\"return_code\":%d,\"message\":\"%s\",\"attachment\":\"%s\"}",
                        resultCode, message, Objects.toString(attachment, "")
                );
    }

}
