package de.yiku.observerpattern;

public interface RegisterWeatherData {
    public void addObserver(Observer observer);

    public void removeObserver(Observer observer);

    public void notifyObserver();
}
