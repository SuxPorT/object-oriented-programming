package Task_08.Exceptions;

public class ExceptionSecurity extends Exception {
    public ExceptionSecurity (String message) {
        super(message);
    }

    public ExceptionSecurity() {
        super();
    }
}