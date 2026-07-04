package onlineshoppingandordermanagement;

// Thrown when stock is not available
public class InsufficientStockException extends Exception {

    public InsufficientStockException(String message) {
        super(message);
    }
}
