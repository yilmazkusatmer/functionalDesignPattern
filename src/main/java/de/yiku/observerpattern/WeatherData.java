package de.yiku.observerpattern;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class WeatherData implements RegisterWeatherData {
    List<Observer> observers;
    private Weather weather;

    public WeatherData() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void addObserver(Observer observer) {
        Objects.requireNonNull(observer);
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        Objects.requireNonNull(observer);
        observers.remove(observer);
    }

    @Override
    public void notifyObserver() {
        observers.forEach(observer -> observer.update(weather));
    }

    public void setMeasurements(Weather weather) {
        this.weather = weather;
        notifyObserver();
    }
}
