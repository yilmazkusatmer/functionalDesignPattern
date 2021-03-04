package de.yiku.factorypattern;

public enum Color {
    RED,
    ORANGE,
    BLUE,
    YELLOW,
    BLACK;

    @Override
    public String toString() {
        return this.name().substring(0, 1).toUpperCase() +
                this.name().substring(1).toLowerCase();
    }
}
