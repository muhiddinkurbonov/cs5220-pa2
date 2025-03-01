package org.example;

import java.time.LocalDate;

public class Groceries extends Product{
    private LocalDate expirationDate;

    public Groceries(String productId, String name, double price, LocalDate expirationDate) {
        super(productId, name, price);
        this.expirationDate = expirationDate;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(" | Expires: %s", expirationDate);
    }
}
