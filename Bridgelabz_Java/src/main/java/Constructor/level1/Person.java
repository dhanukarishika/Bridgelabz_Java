/*
 * Q3. Person Copy Constructor
 * Create a Person class with a copy constructor
 * that copies another person's attributes.
 */
package Constructor.level1;
public class Person {
    private String name;
    private int age;
    public Person(String name, int age) {
        setName(name);
        setAge(age);
    }
    public Person(Person other) {
        if (other == null) {
            throw new IllegalArgumentException("Person to copy cannot be null.");
        }
        this.name = other.name;
        this.age = other.age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be empty.");
        }
        this.name = name.trim();
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative.");
        }
        this.age = age;
    }
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
    public static void main(String[] args) {
        Person originalPerson = new Person("Rishika", 21);
        Person copiedPerson = new Person(originalPerson);
        System.out.println("Original Person");
        originalPerson.displayDetails();
        System.out.println("\nCopied Person");
        copiedPerson.displayDetails();
        copiedPerson.setName("Vaidehi");
        System.out.println("\nAfter Updating the Copied Person");
        System.out.println("Original Name: " + originalPerson.getName());
        System.out.println("Copied Name: " + copiedPerson.getName());
    }
}