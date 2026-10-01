package Actividad_2;

public class PruebaContains {
	public static void main(String[] args) {

	     //Prueba con Integer
	     Pila<Integer> pilaInteger = new Pila<>(5);
	     pilaInteger.push(10);
	     pilaInteger.push(20);
	     pilaInteger.push(30);
	
	     System.out.println("contains(20)? " + pilaInteger.contains(20));   // true
	     System.out.println("contains(99)? " + pilaInteger.contains(99));   // false
	
	     //Demostramos que contains NO modificó la pila:
	     //el tope debe seguir siendo 30
	     System.out.println("pop() despues de buscar: " + pilaInteger.pop()); // 30
	
	     //Prueba con String
	     Pila<String> pilaString = new Pila<>(5);
	     pilaString.push("Java");
	     pilaString.push("Python");
	     pilaString.push("C++");
	
	     System.out.println("contains(\"Java\")? " + pilaString.contains("Java")); // true
	     System.out.println("contains(\"Ruby\")? " + pilaString.contains("Ruby")); // false
	
	     //Prueba con pila vacía
	     Pila<Double> pilaVacia = new Pila<>(3);
	     System.out.println("contains(1.5)? " + pilaVacia.contains(1.5));   // false
	}
}
