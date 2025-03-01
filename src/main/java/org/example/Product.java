package org.example;

public class Product {
    private String productId;
    private String name;
    private double price;

    public Product(String productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return String.format("ID: %s | Name: %s | Price: $%.2f", productId, name, price);
    }
}
