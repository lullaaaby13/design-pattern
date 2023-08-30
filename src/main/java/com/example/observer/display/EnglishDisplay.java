package com.example.observer.display;

import com.example.observer.Observer;
import com.example.observer.WeatherStation;

public class EnglishDisplay implements Observer {

    private WeatherStation weatherStation;

    public EnglishDisplay(WeatherStation weatherStation) {
        this.weatherStation = weatherStation;
    }

    @Override
    public void update() {
        System.out.printf("EnglishDisplay [Temperature = %f, Humidity = %f]\n", weatherStation.getTemperature(), weatherStation.getHumidity());
    }
}
