package co.udea.maxi.entregas.api.exception;

/**
 * Exception for duplicated data in the application
 */
public class DataNotFoundException extends GeneralRuntimeException {

    private static final long serialVersionUID = 1L;

    public DataNotFoundException(String message) {
        super(message);
    }
}
