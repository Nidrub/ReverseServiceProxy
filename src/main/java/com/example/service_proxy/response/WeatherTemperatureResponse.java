package com.example.service_proxy.response;


import com.example.service_proxy.response.subresposes.*;

import java.util.List;

public class WeatherTemperatureResponse {
    //weather
    private Coordsub coord;
   private List<Weathersub> weather;
   private Mainsub main;
   private int visibility;
   private Windsub wind;
   private Cloudssub clouds;
   private int dt;
   private Syssub sys;
   private int timezone;
   private int id;
   private String name;
   private int cod;

    public Coordsub getCoord() {
        return coord;
    }

    public void setCoord(Coordsub coord) {
        this.coord = coord;
    }

    public List<Weathersub> getWeather() {
        return weather;
    }

    public void setWeather(List<Weathersub> weather) {
        this.weather = weather;
    }

    public Mainsub getMain() {
        return main;
    }

    public void setMain(Mainsub main) {
        this.main = main;
    }

    public int getVisibility() {
        return visibility;
    }

    public void setVisibility(int visibility) {
        this.visibility = visibility;
    }

    public Windsub getWind() {
        return wind;
    }

    public void setWind(Windsub wind) {
        this.wind = wind;
    }

    public Cloudssub getClouds() {
        return clouds;
    }

    public void setClouds(Cloudssub clouds) {
        this.clouds = clouds;
    }

    public int getDt() {
        return dt;
    }

    public void setDt(int dt) {
        this.dt = dt;
    }

    public Syssub getSys() {
        return sys;
    }

    public void setSys(Syssub sys) {
        this.sys = sys;
    }

    public int getTimezone() {
        return timezone;
    }

    public void setTimezone(int timezone) {
        this.timezone = timezone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }
}
