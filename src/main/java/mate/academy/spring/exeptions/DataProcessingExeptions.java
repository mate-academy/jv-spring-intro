package mate.academy.spring.exeptions;

public class DataProcessingExeptions extends RuntimeException {
    public DataProcessingExeptions(String message) {
        super(message);
    }

    public DataProcessingExeptions(String message, Throwable cause) {
        super(message, cause);
    }
}
