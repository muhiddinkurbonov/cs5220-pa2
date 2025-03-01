package org.example;

public class Electronics extends Product{
    private int warrantyPeriod;

    public Electronics(String productId, String name, double price, int warrantyPeriod) {
        super(productId, name, price);
        this.warrantyPeriod = warrantyPeriod;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(" | Warranty: %d months", warrantyPeriod);
    }
}
