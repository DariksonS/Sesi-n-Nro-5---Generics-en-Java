package Actividad_2;

import java.util.Objects;

public class Pila< E > 
{
	private int superior;
	private	E[] elementos;
	private final int tamanio;
	
	//Constructor
	public Pila() 
	{
		this.tamanio= 10;
	}
	
	public Pila(int s) 
	{
		tamanio= s > 0 ? s : 10;
		superior= -1;
		elementos= (E[]) new Object[tamanio];
	}
	
	public void push (E valorAMeter) 
	{
		if (superior == tamanio - 1) 
		{
			throw new ExcepcionPilaLlena(String.format("La pila esta llega, no se puede meter %s", valorAMeter));
		}
		
		elementos[++superior]= valorAMeter;
	}
	
	public E pop() 
	{
		if (superior == -1) 
		{
			throw new ExcepcionPilaVacia( "Pila vacia, no se puede sacar");
		}
	
		return elementos[ superior-- ];
	}
	
	//Metodo nuevo de (E elemento)
	public boolean contains(E elemento) 
	{
		for (int i = superior; i >= 0; i--) 
		{
			if (Objects.equals(elementos[i], elemento)) 
			{
				return true;
			}
		}
		return false;
	}
}
