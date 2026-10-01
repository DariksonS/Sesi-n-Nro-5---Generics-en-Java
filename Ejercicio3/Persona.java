package Ejercicio3;

public class Persona {
	private String nombre;
	private int edad;
	
	public Persona(String nombre, int edad) {
		this.setNombre(nombre);
		this.setEdad(edad);
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	@Override
	public String toString() {
		return nombre +" ("+edad+" años)";
	}	
}
