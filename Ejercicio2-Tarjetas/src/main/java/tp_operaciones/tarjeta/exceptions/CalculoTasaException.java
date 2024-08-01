package tp_operaciones.tarjeta.exceptions;


public class CalculoTasaException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public CalculoTasaException(String message) {
        super(message);
    }

    public CalculoTasaException(String message, Throwable cause) {
        super(message, cause);
    }
}