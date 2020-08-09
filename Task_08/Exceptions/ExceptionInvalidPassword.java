package Task_08.Exceptions;

public class ExceptionInvalidPassword extends ExceptionAuthentication {
    public ExceptionInvalidPassword(String message) {
        super(message);
    }

    public ExceptionInvalidPassword() {
        super();
    }
}