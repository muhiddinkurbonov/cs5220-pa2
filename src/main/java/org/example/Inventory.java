package org.example;

import java.util.ArrayList;

// generic class where T represents any product category
class Inventory<T> {
    private ArrayList<T> inventoryItems;

    public Inventory() {
        inventoryItems = new ArrayList<>();
    }

    public void addInventoryItem(T inventoryItem) {
        inventoryItems.add(inventoryItem);
        System.out.println("Added: " + inventoryItem);
    }

    public void removeInventoryItem(T inventoryItem) {
        if(inventoryItems.remove(inventoryItem)) {
            System.out.println("Removed: " + inventoryItem);
        } else {
            System.out.println("Item not found: " + inventoryItem);
        }
    }

    public void displayInventoryItems() {
        if(inventoryItems.isEmpty()) {
            System.out.println("Inventory is empty!");
        } else {
            System.out.println("Current inventory:");
            for(T inventoryItem : inventoryItems) {
                System.out.println(inventoryItem);
            }
        }
        System.out.println("=======================");
    }
}
