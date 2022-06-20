package Practice;

public class CustomException extends RuntimeException {

    public CustomException() {
        super();
    }

    public CustomException(String message) {
        super(message);
    }

    public CustomException(Throwable ex) {
        super(ex);
    }

    public CustomException(String message, Throwable ex) {
        super(message, ex);
    }
}

