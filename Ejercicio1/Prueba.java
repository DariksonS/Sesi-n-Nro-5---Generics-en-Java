package Ejercicio1;

public class Prueba {

	public static void main(String[] args) {
		Par<String, Integer> estudiante = new Par<>("Amira Garcia", 20);
        System.out.println("Estudiante: " + estudiante.toString());

        Par<Double, Boolean> producto = new Par<>(45.50, true);
        System.out.println("Producto: " + producto);

        estudiante.setPrimero("Maria Lopez");
        estudiante.setSegundo(22);
        System.out.println("Estudiante modificado: " + estudiante);
	}

}
