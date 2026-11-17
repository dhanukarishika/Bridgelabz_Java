/*
 * This program demonstrates the use of throw and throws in Java exception handling.
 * It validates the amount and interest rate and raises an exception if either is negative.
 */
package ExceptionHandling.Module1;
class calculation {
    // Validates the amount and interest rate before proceeding.
    public void calculateIntrest(double amount, double rate, int years) throws IllegalAccessException {
        if (amount < 0 || rate < 0) {
            // Throws a checked exception if the amount or rate is negative.
            throw new IllegalAccessException("Amount or Rate should be positive");
        }
    }
}
public class ThrowAndThrows {
    public static void main(String[] args) {
        // Defines the amount, interest rate, and duration.
        double amount = -100;
        double rate = 100;
        int years = 2;
        try {
            // Creates the calculation object and validates the supplied values.
            calculation calculation = new calculation();
            calculation.calculateIntrest(amount, rate, years);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } catch (IllegalAccessException e) {
            // Wraps the checked exception inside a RuntimeException.
            throw new java.lang.RuntimeException(e);
        }

    }
}