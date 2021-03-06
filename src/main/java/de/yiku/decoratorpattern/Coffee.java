package de.yiku.decoratorpattern;

import java.util.Objects;

public class Coffee {
    private final String description;
    private final double price;

    public Coffee(String description, double price) {
        this.description = description;
        this.price = price;
    }

    public Coffee with(String description, double price) {
        return new Coffee(getDescription() + ", " + description,
                getPrice() + price);
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Coffee coffee = (Coffee) o;

        if (Double.compare(coffee.price, price) != 0) return false;
        return Objects.equals(description, coffee.description);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = description != null ? description.hashCode() : 0;
        temp = Double.doubleToLongBits(price);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Coffee{" +
                "description='" + description + '\'' +
                ", price=" + price +
                '}';
    }
}
