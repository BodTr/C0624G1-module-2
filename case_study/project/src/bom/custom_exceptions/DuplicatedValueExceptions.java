package bom.custom_exceptions;

public class DuplicatedValueExceptions extends Exception {
    public DuplicatedValueExceptions() {
        super("custom duplicated value exceptions");
    }

    public DuplicatedValueExceptions(String message) {
        super(message);
    }
}
