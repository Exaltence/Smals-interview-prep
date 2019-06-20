package be.smals.fizbuzz.exception;

public class FizBuzzException extends Exception {

    public FizBuzzException(String message, Throwable cause) {
        super(message, cause);
    }

    public FizBuzzException(String message) {
        super(message);
    }
}
