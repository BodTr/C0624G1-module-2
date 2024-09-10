package bom.custom_exceptions;

public class InvalidValueExceptions extends Exception {

    public InvalidValueExceptions() {
        super("custom invalid value exceptions");
    }

    public InvalidValueExceptions(String message) {
        super(message);
    }
}
