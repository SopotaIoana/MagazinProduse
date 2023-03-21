package org.example;

import java.util.Objects;

public class Imbracaminte extends Magazin{
    private String size;
    private String color;

    public Imbracaminte(String name, double price, int quantity, String size, String color){
        super(name,price,quantity);
        this.size = size;
        this.color = color;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Imbracaminte{" +
                "size='" + size + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Imbracaminte that)) return false;
        return Objects.equals(getSize(), that.getSize()) && Objects.equals(getColor(), that.getColor());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getSize(), getColor());
    }
}

