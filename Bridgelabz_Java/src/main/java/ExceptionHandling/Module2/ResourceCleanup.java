package ExceptionHandling.Module2;
/*
 * Program to demonstrate exception handling with resource cleanup.
 * It uses AutoCloseable to automatically close a database-like connection.
 */
class DatabaseConnection implements AutoCloseable {
    // Open the connection
    public void connect() {
        System.out.println("Database connection established");
    }
    // Perform database operation
    public void executeQuery() {
        System.out.println("Executing database query");
        // Simulate an exception
        throw new RuntimeException("Database query failed");
    }
    // Close the connection
    @Override
    public void close() {
        System.out.println("Database connection closed");
    }
}
public class ResourceCleanup {
    public static void main(String[] args) {
        // Manage connection using try-with-resources
        try (DatabaseConnection con = new DatabaseConnection()) {
            con.connect();
            // Execute database operation
            con.executeQuery();
        } catch (Exception e) {
            // Handle database exceptions
            System.out.println("Error: " + e.getMessage());
        }
    }
}
