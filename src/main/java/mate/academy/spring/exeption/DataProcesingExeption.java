package mate.academy.spring.exeption;

public class DataProcesingExeption extends RuntimeException {
    public DataProcesingExeption(String message, Throwable cause) {
        super(message, cause);
    }
}
