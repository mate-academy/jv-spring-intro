package mate.academy.spring.exception;

public class DataProcessingException extends RuntimeException {
    public DataProcessingException() {
    }

    public DataProcessingException(String message) {
        super(message);
    }

    public DataProcessingException(String message, Throwable cause) {
        super(message, cause);
    }
}
