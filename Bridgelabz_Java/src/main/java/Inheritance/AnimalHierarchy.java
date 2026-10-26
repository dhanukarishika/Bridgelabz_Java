/*
 * This program demonstrates inheritance and method overriding in Java.
 * Different animal classes inherit from the Animal class and provide their own sounds.
 */

package Inheritance;

class Animal{
    String name = "Animals";
    int age = 5;

    // Displays the general sound message for animals
    public void makeSound(){
        System.out.println("Different animals makes different sounds");
    }
}

class Dog extends Animal{
    String sound = "bow bow!";

    // Overrides the makeSound() method of the Animal class
    public void makeSound(){
        System.out.println("Dog sounds like: "+sound);
    }
}

class Cat extends Animal{
    String sound = "mew mew!";

    // Overrides the makeSound() method of the Animal class
    public void makeSound(){
        System.out.println("Cat sounds like: "+sound);
    }
}

class Bird extends Animal{
    String sound = "kaw kaw!";

    // Overrides the makeSound() method of the Animal class
    public void makeSound(){
        System.out.println("Bird sounds like: "+sound);
    }
}


public class AnimalHierarchy {
    public static void main(String[] args){

        // Creating objects of the parent and child classes
        Animal animal = new Animal();
        Dog dog = new Dog();
        Cat cat = new Cat();
        Bird bird = new Bird();

        // Calling the overridden makeSound() methods
        animal.makeSound();
        dog.makeSound();
        cat.makeSound();
        bird.makeSound();
    }
}