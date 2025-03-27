package edu.set.store.model;

import java.util.Objects;

public class Product {
    private Long code;
    private String name;
    private double price;
    private int quantity;

    public Product(Long code, String name, double price, int quantity) {
        this.code = code;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Product{" +
        "code=" + code +
        ", name='" + name + '\'' +
        ", price=" + price +
        ", quantity=" + quantity +
        '}';
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Product product)) return false;
        return Objects.equals(this.getCode(), product.getCode());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(this.getCode());
    }

    public Long getCode() {
        return code;
    }

    public void setCode(Long code) {
        this.code = code;
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
}
