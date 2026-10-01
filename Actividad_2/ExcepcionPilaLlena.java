package Actividad_2;

public class ExcepcionPilaLlena extends RuntimeException {
    public ExcepcionPilaLlena() {
        this("La pila esta llena");
    }

    public ExcepcionPilaLlena(String mensaje) {
        super(mensaje);
    }
}