package cafe;

public class DistributeurException extends RuntimeException{
    public DistributeurException() {
    }

    public DistributeurException(Exception e) {
        super("Distributeur hors service", e);
    }
}
