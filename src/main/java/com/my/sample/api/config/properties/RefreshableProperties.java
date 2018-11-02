package com.my.sample.api.config.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;

/**
 * 可以动态刷新的配置
 */
@Data
@ConfigurationProperties(prefix = "test")
public class RefreshableProperties {

    private int limit;

}
