package Actividad_4;

public class ExcepcionPilaVacia extends RuntimeException
{
    public ExcepcionPilaVacia(String mensaje)
    {
        super(mensaje);
    }
}