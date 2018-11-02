package com.my.sample.api.service;

import com.my.sample.api.model.dto.weather.CityWeather;

public interface WeatherService {

    CityWeather get(String cityName);
}
