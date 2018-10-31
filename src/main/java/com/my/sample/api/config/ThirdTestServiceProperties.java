package com.my.sample.api.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Data
@ConfigurationProperties(prefix = "third.test")
public class ThirdTestServiceProperties {

    private String rootUri;
    private String pingUri;
}
