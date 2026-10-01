package Ejercicio4;

public class Par<F, S>
{
	private F primero;
	private S segundo;

	public Par() {}

	public Par(F primero, S segundo)
	{
		this.setPrimero(primero);
		this.setSegundo(segundo);
	}

	public S getSegundo()
	{
		return segundo;
	}

	public void setSegundo(S segundo)
	{
		this.segundo = segundo;
	}

	public F getPrimero()
	{
		return primero;
	}

	public void setPrimero(F primero)
	{
		this.primero = primero;
	}

	public boolean esIgual(Par<F, S> otroPar)
	{
		if (otroPar == null)
		{
			return false;
		}
		
		if (this == otroPar)
		{
			return true;
		}
		
		return sonIguales(primero, otroPar.primero) && sonIguales(segundo, otroPar.segundo);
	}

	private boolean sonIguales(Object a, Object b)
	
	{
		if (a == null)
		{
			return b == null;
		}
		
		return a.equals(b);
	}

	@Override
	public String toString()
	{
		return "(Primero: " + primero + ", Segundo: " + segundo + ")";
	}
}