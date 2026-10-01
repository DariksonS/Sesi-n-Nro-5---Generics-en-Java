package Ejercicio2;

public class PruebaPar {

	public static <F, S> void compararPares(Par<F, S> par1, Par<F, S> par2) 
	{
		System.out.println(par1 + " esIgual " + par2 + " -> " + par1.esIgual(par2));
	}

	public static void main(String[] args)
	{
		Par<String, Integer> par1 = new Par<>("Amira Garcia", 20);
		Par<String, Integer> par2 = new Par<>("Amira Garcia", 20);
		Par<String, Integer> par3 = new Par<>("Maria Lopez", 20);
		Par<String, Integer> par4 = new Par<>("Amira Garcia", 22);

		compararPares(par1, par2);
		compararPares(par1, par3);
		compararPares(par1, par4);
		compararPares(par1, par1);

		Par<Double, Boolean> par5 = new Par<>(45.50, true);
		Par<Double, Boolean> par6 = new Par<>(45.50, true);
		Par<Double, Boolean> par7 = new Par<>(45.50, false);

		compararPares(par5, par6);
		compararPares(par5, par7);

		Par<String, Integer> par8 = new Par<>(null, 5);
		Par<String, Integer> par9 = new Par<>(null, 5);

		compararPares(par8, par9);

		System.out.println(par1 + " esIgual null -> " + par1.esIgual(null));
	}
}