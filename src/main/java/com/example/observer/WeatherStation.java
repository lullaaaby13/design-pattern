package com.example.observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Subject {
    private double temperature;
    private double humidity;

    private List<Observer> observers = new ArrayList<>();

    public WeatherStation(double temperature, double humidity) {
        this.temperature = temperature;
        this.humidity = humidity;
    }

    public double getTemperature() {
        return temperature;
    }

    public double getHumidity() {
        return humidity;
    }

    public void updateTemperature(double temperature) {
        this.temperature = temperature;
        notifyToObservers();
    }

    public void updateHumidity(double humidity) {
        this.humidity = humidity;
        notifyToObservers();
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyToObservers() {
        observers.forEach(Observer::update);
    }
}
