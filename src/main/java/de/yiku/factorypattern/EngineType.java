package de.yiku.factorypattern;

public enum EngineType {
    INLINE("Inline Engine"),
    STRAIGHT("Straight Engine"),
    FLAT("Flat Engine"),
    V("V Engine");

    private final String name;

    EngineType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
