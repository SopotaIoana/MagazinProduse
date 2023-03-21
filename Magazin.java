package org.example;

import java.util.Objects;

public class Magazin {
    private String name;
    private double price;
    private int quantity;

    public Magazin(String name, double price, int quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Magazin{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Magazin magazin)) return false;
        return Double.compare(magazin.getPrice(), getPrice()) == 0 && getQuantity() == magazin.getQuantity() && Objects.equals(getName(), magazin.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getPrice(), getQuantity());
    }
}

