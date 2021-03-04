package de.yiku.factorypattern;

public abstract class Vehicle {
    private final Color color;
    private final EngineType engineType;
    private final String name;

    public Vehicle(Color color, EngineType engineType) {
        this.color = color;
        this.engineType = engineType;
        this.name = this.getClass().getSimpleName();
    }

    public Color getColor() {
        return color;
    }

    public EngineType getEngineType() {
        return engineType;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Vehicle vehicle = (Vehicle) o;

        if (color != vehicle.color) return false;
        if (engineType != vehicle.engineType) return false;
        return name != null ? name.equals(vehicle.name) : vehicle.name == null;
    }

    @Override
    public int hashCode() {
        int result = color != null ? color.hashCode() : 0;
        result = 31 * result + (engineType != null ? engineType.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "color=" + color +
                ", engineType=" + engineType +
                ", name='" + name + '\'' +
                '}';
    }
}
