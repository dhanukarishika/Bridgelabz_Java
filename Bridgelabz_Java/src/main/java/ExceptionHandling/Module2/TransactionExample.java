package ExceptionHandling.Module2;
/*
 * Program to demonstrate rethrowing exceptions with custom transaction context.
 * It catches transaction failures and throws a custom TransactionException.
 */
class TransactionException extends Exception {
    public TransactionException(String message, Throwable cause) {
        super(message, cause);
    }
}
class TransactionService {
    // Process a transaction
    public void processTransaction(int transactionId, double amount)
            throws TransactionException {
        try {
            // Validate transaction amount
            if (amount <= 0) {
                throw new IllegalArgumentException("Invalid transaction amount");
            }
            System.out.println("Transaction successful");
        } catch (IllegalArgumentException e) {
            // Rethrow exception with transaction details
            throw new TransactionException(
                    "Transaction failed. ID: " + transactionId +
                            ", Amount: " + amount, e
            );
        }
    }
}
public class TransactionExample {
    public static void main(String[] args) {
        TransactionService service = new TransactionService();
        try {
            // Process transaction
            service.processTransaction(101, -500);
        } catch (TransactionException e) {
            // Handle custom transaction exception
            System.out.println(e.getMessage());
            System.out.println("Reason: " + e.getCause().getMessage());
        }
    }
}
