package exercises.simple_banking_system_try_catch.exceptions;

public class DomainException extends RuntimeException {
    private static final long serialVersionUID = 1L;
    public DomainException(String message) {
        super(message);
    }
}
