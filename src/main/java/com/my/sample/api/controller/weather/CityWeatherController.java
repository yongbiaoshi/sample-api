package com.my.sample.api.controller.weather;

import com.my.sample.api.model.dto.weather.CityWeather;
import com.my.sample.api.service.WeatherService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("weather")
public class CityWeatherController {

    @Resource
    WeatherService weatherService;

    @GetMapping("/{cityName}")
    public CityWeather cityWeather(@PathVariable String cityName) {
        return weatherService.get(cityName);
    }

}
