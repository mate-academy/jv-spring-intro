package mate.academy.spring.exception;

public class DataProcessException extends RuntimeException {
    public DataProcessException() {
    }

    public DataProcessException(String message) {
        super(message);
    }

    public DataProcessException(String message, Throwable cause) {
        super(message, cause);
    }

    public DataProcessException(Throwable cause) {
        super(cause);
    }
}
