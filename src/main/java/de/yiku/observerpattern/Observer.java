package de.yiku.observerpattern;

@FunctionalInterface
public interface Observer {
    void update(Weather weather);
}
