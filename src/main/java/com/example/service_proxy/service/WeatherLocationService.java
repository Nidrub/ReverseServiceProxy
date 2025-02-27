package com.example.service_proxy.service;

import com.example.service_proxy.response.WeatherTemperatureResponse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import com.example.service_proxy.response.WeatherLocationResponse;

import java.util.List;

@Service
public class WeatherLocationService {
    private final RestTemplate restTemplate = new RestTemplate();

    @Value("${openweather.api.key}")
    private String apiKey;

    @Value("${openweather.url.lonlan}")
    private String locationUrl;

    @Value("${openweather.url.temp}")
    private String weatherUrl;


    public List<WeatherLocationResponse> getLocations(String location) {
        String url = locationUrl + location + "&limit=5&appid=" + apiKey;
        //make the API call
        WeatherLocationResponse[] locations = restTemplate.getForObject(url, WeatherLocationResponse[].class);
        return List.of(locations);
    }


    public WeatherTemperatureResponse getWeather(double lon, double lat) {
        String url = weatherUrl + "?lat=" + lat + "&lon=" + lon + "&appid=" + apiKey
                + "&units=imperial";
        WeatherTemperatureResponse weather = restTemplate.getForObject(url, WeatherTemperatureResponse.class);
        return weather;
    }


}
