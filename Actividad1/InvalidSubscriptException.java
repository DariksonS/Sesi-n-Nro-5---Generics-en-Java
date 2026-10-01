package Actividad1;

public class InvalidSubscriptException extends RuntimeException{
	public InvalidSubscriptException() {
        super("Subíndice fuera de rango o inválido.");
    }
    public InvalidSubscriptException(String mensaje) {
        super(mensaje);
    }
}
