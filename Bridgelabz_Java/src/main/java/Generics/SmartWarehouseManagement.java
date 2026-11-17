package Generics;
import java.util.ArrayList;
import java.util.List;
/*
 * Q1. Smart Warehouse Management System
 * Store and retrieve different warehouse items using
 * generic classes, bounded types, and wildcards.
 */
public class SmartWarehouseManagement {
    // Base class for all warehouse items
    static abstract class WarehouseItem {
        String name;
        WarehouseItem(String name) {
            this.name = name;
        }
        @Override
        public String toString() {
            return name;
        }
    }
    static class Electronics extends WarehouseItem {
        Electronics(String name) {
            super(name);
        }
    }
    static class Groceries extends WarehouseItem {
        Groceries(String name) {
            super(name);
        }
    }
    static class Furniture extends WarehouseItem {
        Furniture(String name) {
            super(name);
        }
    }
    // Generic storage accepts only WarehouseItem subclasses
    static class Storage<T extends WarehouseItem> {
        private List<T> items = new ArrayList<>();
        public void addItem(T item) {
            items.add(item);
        }
        public T getItem(int index) {
            return items.get(index);
        }
        public List<T> getItems() {
            return items;
        }
    }
    // Wildcard method displays any type of warehouse item
    public static void displayItems(List<? extends WarehouseItem> items) {
        for (WarehouseItem item : items) {
            System.out.println(item);
        }
    }
    public static void main(String[] args) {
        Storage<Electronics> electronics = new Storage<>();
        electronics.addItem(new Electronics("Laptop"));
        electronics.addItem(new Electronics("Mobile"));
        Storage<Groceries> groceries = new Storage<>();
        groceries.addItem(new Groceries("Rice"));
        groceries.addItem(new Groceries("Milk"));
        Storage<Furniture> furniture = new Storage<>();
        furniture.addItem(new Furniture("Chair"));
        furniture.addItem(new Furniture("Table"));
        System.out.println("Electronics:");
        displayItems(electronics.getItems());
        System.out.println("\nGroceries:");
        displayItems(groceries.getItems());
        System.out.println("\nFurniture:");
        displayItems(furniture.getItems());
        System.out.println("\nRetrieved Item: " + electronics.getItem(0));
    }
}