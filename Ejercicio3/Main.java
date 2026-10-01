package Ejercicio3;

public class Main {
	public static <F, S> void imprimirPar(Par<F, S> par) {
        System.out.println(par);
    }
	public static void main(String[] args) {
		Par<String, Integer> par1 = new Par<>("Estudiante", 100);

        Par<Double, Boolean> par2 = new Par<>(99.9, true);

        Persona persona = new Persona("Carlos Perez", 25);
        Par<Persona, Integer> par3 = new Par<>(persona, 12345);
  
        imprimirPar(par1);
        imprimirPar(par2);
        imprimirPar(par3);
	}

}
