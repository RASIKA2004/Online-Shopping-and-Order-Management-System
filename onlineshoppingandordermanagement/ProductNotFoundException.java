package onlineshoppingandordermanagement;

// Thrown when product is not found
public class ProductNotFoundException extends Exception {

    public ProductNotFoundException(String message) {
        super(message);
    }
}