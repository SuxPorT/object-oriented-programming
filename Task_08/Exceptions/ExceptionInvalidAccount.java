package Task_08.Exceptions;

public class ExceptionInvalidAccount extends ExceptionAuthentication {
    public ExceptionInvalidAccount(String message) {
        super(message);
    }

    public ExceptionInvalidAccount() {
        super();
    }
}