package entities.custom_exceptions;

public class DuplicatedValueExceptions extends Exception {
    public DuplicatedValueExceptions(String message) {
        super(message);
    }
}
