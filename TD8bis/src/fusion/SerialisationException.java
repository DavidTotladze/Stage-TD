package fusion;

public class SerialisationException extends RuntimeException{

    public SerialisationException(String message) {
        super(message);
    }

    public SerialisationException(String message, Throwable cause) {
        super(message, cause);
    }
}
