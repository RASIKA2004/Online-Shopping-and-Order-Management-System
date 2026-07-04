package onlineshoppingandordermanagement;

// Thrown when payment fails
public class PaymentFailedException extends Exception {

    public PaymentFailedException(String message) {
        super(message);
    }
}
