package mate.academy.spring.exception;

public class UserNotSavedException extends Exception {
    public UserNotSavedException(String message, Throwable cause) {
        super(message, cause);
    }
}
