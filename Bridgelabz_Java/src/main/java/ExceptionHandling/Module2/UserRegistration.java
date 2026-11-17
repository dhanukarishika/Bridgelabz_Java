package ExceptionHandling.Module2;
/*
 * Program to demonstrate throw and throws using user registration.
 * It handles UserAlreadyExistsException and UserNotFoundException.
 */
import java.util.*;
class UserAlreadyExistsException extends Exception {
    public UserAlreadyExistsException(String message) {
        super(message);
    }
}
class UserNotFoundException extends Exception {
    public UserNotFoundException(String message) {
        super(message);
    }
}
class UserService {
    // Store registered users
    Set<String> users = new HashSet<>();
    // Register a new user
    public void registerUser(String username) throws UserAlreadyExistsException {
        // Check whether the user already exists
        if (users.contains(username)) {
            throw new UserAlreadyExistsException("User already exists: " + username);
        }
        users.add(username);
        System.out.println("User registered successfully: " + username);
    }
    // Check whether a user exists
    public void checkUserExistence(String username) throws UserNotFoundException {
        // Throw exception if user is not found
        if (!users.contains(username)) {
            throw new UserNotFoundException("User not found: " + username);
        }
        System.out.println("User found: " + username);
    }
}
public class UserRegistration {
    public static void main(String[] args) {
        UserService service = new UserService();
        try {
            // Register users
            service.registerUser("Akhil");
            // Try registering the same user again
            service.registerUser("Akhil");
        } catch (UserAlreadyExistsException e) {
            System.out.println(e.getMessage());
        }
        try {
            // Check whether the user exists
            service.checkUserExistence("Rahul");
        } catch (UserNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
