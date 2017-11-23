package aop_examples.business;

/**
 * @author Evgeny Borisov
 * @since 3.2
 */
public class DataBaseNotFoundException extends RuntimeException {
    public DataBaseNotFoundException(String message) {
        super(message);
    }
}
