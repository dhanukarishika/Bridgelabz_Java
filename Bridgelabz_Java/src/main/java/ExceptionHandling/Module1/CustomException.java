/*
 * This program demonstrates how to create and use a custom exception for age validation.
 * It checks whether a person's age is at least 18 and throws an exception if it is not.
 */
package ExceptionHandling.Module1;
class exception extends Exception {
    // Passes a message when a custom exception object is created.
    public exception(String message) {
        System.out.println(message);
    }
}
class agevalidator {
    // Validates the given age and throws a custom exception if the age is below 18.
    public void validate(int age) throws exception {
        if (age < 18) {
            throw new exception("invalid age");
        } else {
            System.out.println("Age Valid");
        }
    }
}
public class CustomException {
    public static void main(String[] args) {
        // Calls the age validation method and handles any exception that occurs.
        try {
            agevalidator agevalidator = new agevalidator();
            agevalidator.validate(13);
        } catch (Exception e) {
            //System.out.println(e.getMessage());
        }

    }
}