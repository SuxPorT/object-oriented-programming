package Task_08.Exceptions;

public class ExceptionInsufficientFunds extends Exception {
    public ExceptionInsufficientFunds(String message) {
        super(message);
    }

    public ExceptionInsufficientFunds() {
        super();
    }
}