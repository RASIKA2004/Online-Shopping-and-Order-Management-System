package onlineshoppingandordermanagement;

// Thrown when login credentials are invalid
public class InvalidLoginException extends Exception {

    public InvalidLoginException(String message) {
        super(message);
    }
}