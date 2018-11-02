package com.my.sample.api.config;

import com.my.sample.api.config.properties.RefreshableProperties;
import com.my.sample.api.config.properties.ThirdTestServiceProperties;
import com.spring4all.swagger.EnableSwagger2Doc;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.web.client.RestTemplate;

import java.time.Duration;

/**
 * 应用基础配置
 *
 * @author shiyongbiao
 */
@EnableSwagger2Doc
@EnableAsync
@EnableConfigurationProperties(value = {ThirdTestServiceProperties.class, RefreshableProperties.class})
@Configuration
public class AppConfig {

    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder) {
        return builder.setConnectTimeout(Duration.ofSeconds(3)).setReadTimeout(Duration.ofSeconds(30)).build();
    }

}