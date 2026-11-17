package Generics;
import java.util.*;
/*
 * Q4. Personalized Meal Plan Generator
 * Generate and validate different meal plans using
 * generic classes, interfaces, and bounded generic methods.
 */
public class PersonalizedMealPlan {
    // Common interface for all meal categories
    interface MealPlan {
        String getType();
    }
    static class VegetarianMeal implements MealPlan {
        public String getType() {
            return "Vegetarian";
        }
    }
    static class VeganMeal implements MealPlan {
        public String getType() {
            return "Vegan";
        }
    }
    static class KetoMeal implements MealPlan {
        public String getType() {
            return "Keto";
        }
    }
    static class HighProteinMeal implements MealPlan {
        public String getType() {
            return "High-Protein";
        }
    }
    // Generic class restricted to valid meal categories
    static class Meal<T extends MealPlan> {
        T category;
        String name;
        int calories;
        Meal(T category, String name, int calories) {
            this.category = category;
            this.name = name;
            this.calories = calories;
        }
    }
    // Generic method to validate and generate meal plans
    public static <T extends MealPlan> void generateMealPlan(Meal<T> meal) {
        if (meal.name == null || meal.name.trim().isEmpty() || meal.calories <= 0) {
            System.out.println("Invalid Meal Plan");
            return;
        }
        System.out.println(meal.category.getType() + ": "
                + meal.name + " (" + meal.calories + " calories)");
    }
    public static void main(String[] args) {
        List<Meal<? extends MealPlan>> plans = Arrays.asList(
                new Meal<>(new VegetarianMeal(), "Paneer Salad", 400),
                new Meal<>(new VeganMeal(), "Lentil Bowl", 350),
                new Meal<>(new KetoMeal(), "Avocado Eggs", 500),
                new Meal<>(new HighProteinMeal(), "Grilled Chicken", 550)
        );
        System.out.println("Personalized Meal Plans:");
        for (Meal<? extends MealPlan> meal : plans) {
            generateMealPlan(meal);
        }
        // Demonstrate validation
        generateMealPlan(new Meal<>(new VeganMeal(), "", 0));
    }
}