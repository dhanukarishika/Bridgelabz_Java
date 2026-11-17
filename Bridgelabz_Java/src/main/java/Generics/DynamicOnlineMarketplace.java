package Generics;
import java.util.*;
/*
 * Q2. Dynamic Online Marketplace
 * Manage different product categories using generics
 * and apply discounts using a bounded generic method.
 */
public class DynamicOnlineMarketplace {
    // Base class for product categories
    static abstract class Category {
        String name;
        double minPrice, maxPrice;
        Category(String name, double minPrice, double maxPrice) {
            this.name = name;
            this.minPrice = minPrice;
            this.maxPrice = maxPrice;
        }
    }
    static class BookCategory extends Category {
        BookCategory() {
            super("Books", 100, 2000);
        }
    }
    static class ClothingCategory extends Category {
        ClothingCategory() {
            super("Clothing", 500, 10000);
        }
    }
    static class GadgetCategory extends Category {
        GadgetCategory() {
            super("Gadgets", 1000, 100000);
        }
    }
    // Generic product class restricted to valid categories
    static class Product<T extends Category> {
        String name;
        T category;
        double price;
        Product(String name, T category, double price) {
            if (price < category.minPrice || price > category.maxPrice) {
                throw new IllegalArgumentException("Price outside category range");
            }
            this.name = name;
            this.category = category;
            this.price = price;
        }
        @Override
        public String toString() {
            return name + " (" + category.name + ") - Rs. " + price;
        }
    }
    // Generic method to apply a discount
    public static <T extends Product<?>> void applyDiscount(T product, double percentage) {
        product.price -= product.price * percentage / 100;
    }
    public static void main(String[] args) {
        Product<BookCategory> book =
                new Product<>("Java Book", new BookCategory(), 500);
        Product<ClothingCategory> clothing =
                new Product<>("T-Shirt", new ClothingCategory(), 1000);
        Product<GadgetCategory> gadget =
                new Product<>("Headphones", new GadgetCategory(), 4000);
        // Store products of different categories in one catalog
        List<Product<? extends Category>> catalog =
                Arrays.asList(book, clothing, gadget);
        System.out.println("Original Product Catalog:");
        for (Product<? extends Category> product : catalog) {
            System.out.println(product);
        }
        applyDiscount(book, 10);
        applyDiscount(clothing, 20);
        applyDiscount(gadget, 5);
        System.out.println("\nAfter Applying Discounts:");
        for (Product<? extends Category> product : catalog) {
            System.out.println(product);
        }
    }
}