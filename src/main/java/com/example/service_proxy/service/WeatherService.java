package com.example.service_proxy.service;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import com.example.service_proxy.response.WeatherLocationResponse;

import java.util.List;
import java.util.Map;

@Service
public class WeatherService {
    private final RestTemplate restTemplate = new RestTemplate();

    @Value("${openweather.apiKey}")
    private String apiKey;

    @Value("${openweather.urlGetLocation}")
    private String locationUrl;

    @Value("${openweather.urlTemperature}")
    private String weatherUrl;

    //for this one wea are going to filter out only one part that is not needed for the user or for any use in that manner
    public List<WeatherLocationResponse> getLocations(String location) {
        String url = locationUrl + location + "&limit=5&appid=" + apiKey;
        //make the API call
        WeatherLocationResponse[] locations = restTemplate.getForObject(url, WeatherLocationResponse[].class);
        return List.of(locations);
    }

    //returns the full information, hence does not need response format
    public Map<String, Object> getWeather(double lon, double lat, boolean temp) {
        String units = temp ? "metric" : "imperial";
        String url = weatherUrl + "?lat=" + lat + "&lon=" + lon + "&appid=" + apiKey
                + "&units=" + units;
        return restTemplate.getForObject(url, Map.class);
    }


}
