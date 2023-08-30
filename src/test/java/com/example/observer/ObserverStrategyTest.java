package com.example.observer;

import com.example.observer.display.EnglishDisplay;
import com.example.observer.display.KoreanDisplay;
import org.junit.jupiter.api.Test;

public class ObserverStrategyTest {

    @Test
    void name1() {
        WeatherStation weatherStation = new WeatherStation(28.0, 0.7);
        KoreanDisplay koreanDisplay = new KoreanDisplay(weatherStation);
        EnglishDisplay englishDisplay = new EnglishDisplay(weatherStation);

        weatherStation.addObserver(koreanDisplay);
        weatherStation.addObserver(englishDisplay);

        weatherStation.updateTemperature(27.0);
        weatherStation.updateHumidity(0.6);
    }
}
