package Ejercicio4;

import java.util.ArrayList;

public class Contenedor<F, S>
{
	private String nombre;
	private ArrayList<Par<F, S>> pares;

	public Contenedor(String nombre)
	{
		this.nombre = nombre;
		this.pares = new ArrayList<>();
	}

	public void agregarPar(F primero, S segundo)
	{
		pares.add(new Par<>(primero, segundo));
	}

	public Par<F, S> obtenerPar(int indice)
	{
		if (indice < 0 || indice >= pares.size())
		{
			throw new IndexOutOfBoundsException("Indice fuera de rango: " + indice);
		}
		return pares.get(indice);
	}

	public ArrayList<Par<F, S>> obtenerTodosLosPares()
	{
		return pares;
	}

	public void mostrarPares()
	{
		System.out.println("=== " + nombre + " (" + pares.size() + " elementos) ===");
		for (int i = 0; i < pares.size(); i++)
		{
			System.out.println(i + ". " + pares.get(i));
		}
		
		System.out.println();
	}
}