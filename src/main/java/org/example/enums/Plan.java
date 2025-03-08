package org.example.enums;

public enum Plan {
    BASIC("Basic Plan", 50.0),
    PREMIUM("Premium Plan", 100.0),
    VIP("VIP Plan", 200.0);

    private final String name;
    private final double price;

    Plan(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return name + " (Price: $" + price + ")";
    }
}
