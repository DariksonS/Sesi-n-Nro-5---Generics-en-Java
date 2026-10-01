package Actividad_4;

public class Pila<E>
{

    private final int tamanio;
    private int superior;
    private E[] elementos;

    public Pila()
    {
        this(10);
    }

    @SuppressWarnings("unchecked")
    public Pila(int s)
    {
        tamanio = s > 0 ? s : 10;
        superior = -1;
        elementos = (E[]) new Object[tamanio];
    }

    public void push(E valorAMeter)
    {
        if (superior == tamanio - 1)
        {
            throw new ExcepcionPilaLlena(String.format("La Pila esta llena, no se puede meter %s", valorAMeter));
        }
        
        elementos[++superior] = valorAMeter;
    }

    public E pop()
    {
        if (superior == -1)
        {
            throw new ExcepcionPilaVacia("Pila vacia, no se puede sacar");
        }
        
        return elementos[superior--];
    }

    public boolean esIgual(Pila<E> otraPila)
    {
        if (otraPila == null)
        {
            return false;
        }
        
        if (this == otraPila)
        {
            return true;
        }
        
        if (this.superior != otraPila.superior)
        {
            return false;
        }

        for (int i = superior; i >= 0; i--)
        {
            E actual = this.elementos[i];
            E otro = otraPila.elementos[i];
            
            if (actual == null)
            {
                if (otro != null)
                {
                    return false;
                }
                
            } else if (!actual.equals(otro))
            
            {
                return false;
            }
        }
        return true;
    }

    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i <= superior; i++)
        {
            sb.append(elementos[i]);
            
            if (i < superior)
            {
                sb.append(", ");
            }
            
        }
        return sb.append("]").toString();
    }
}