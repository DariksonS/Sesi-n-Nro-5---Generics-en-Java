package Actividad_2;

public class ExcepcionPilaVacia extends RuntimeException {
    public ExcepcionPilaVacia() {
        this("La pila esta vacia");
    }

    public ExcepcionPilaVacia(String mensaje) {
        super(mensaje);
    }
}