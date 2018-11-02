package com.my.sample.api.config.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties(prefix = "third.weather")
public class ThirdWeatherProperties {

    private String uri;
}
