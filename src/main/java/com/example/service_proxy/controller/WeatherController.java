package com.example.service_proxy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.example.service_proxy.response.WeatherLocationResponse;
import com.example.service_proxy.service.WeatherLocationService;

import java.util.List;

@RestController
@RequestMapping("/weather")
public class WeatherController {
    @Autowired
    private WeatherLocationService weatherLocationService;

    @GetMapping("/locations")
    public List<WeatherLocationResponse> getLocations(@RequestParam String location) {
        return weatherLocationService.getLocations(location);
    }
}
