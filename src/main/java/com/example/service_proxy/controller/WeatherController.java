package com.example.service_proxy.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.example.service_proxy.response.WeatherLocationResponse;
import com.example.service_proxy.service.WeatherService;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/weather")
public class WeatherController {
    @Autowired
    private WeatherService weatherLocationService;

    @GetMapping("/getLanLon")
    public List<WeatherLocationResponse> getLocations(@RequestParam String location) {
        return weatherLocationService.getLocations(location);
    }

    @GetMapping("/getWeather")
    public Map<String, Object> getWeather(@RequestParam double lon, @RequestParam double lat , @RequestParam boolean celsius) {
        return weatherLocationService.getWeather(lon, lat, celsius);
    }
}
