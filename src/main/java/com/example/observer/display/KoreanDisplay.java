package com.example.observer.display;

import com.example.observer.Observer;
import com.example.observer.WeatherStation;

public class KoreanDisplay implements Observer {
    private WeatherStation weatherStation;

    public KoreanDisplay(WeatherStation weatherStation) {
        this.weatherStation = weatherStation;
    }

    @Override
    public void update() {
        System.out.printf("한국어 디스플레이 [온도 = %f, 습도 = %f]\n", weatherStation.getTemperature(), weatherStation.getHumidity());
    }
}
