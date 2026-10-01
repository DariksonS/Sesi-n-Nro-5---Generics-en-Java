package Ejercicio4;

public class Prueba {

	public static void main(String[] args)
	{
		Contenedor<String, Integer> stock = new Contenedor<>("Stock de la tienda de videojuegos");
		stock.agregarPar("Minecraft", 15);
		stock.agregarPar("FIFA 26", 8);
		stock.agregarPar("GTA VI", 3);
		stock.agregarPar("Zelda", 10);
		stock.mostrarPares();

		Contenedor<String, Double> precios = new Contenedor<>("Precios de la tienda de videojuegos (S/)");
		precios.agregarPar("Minecraft", 89.90);
		precios.agregarPar("FIFA 26", 249.00);
		precios.agregarPar("GTA VI", 329.50);
		precios.agregarPar("Zelda", 279.00);
		precios.mostrarPares();

		System.out.println("obtenerPar(2): " + stock.obtenerPar(2));
		Par<String, Integer> juego = stock.obtenerPar(1);
		System.out.println("Juego: " + juego.getPrimero() + ", unidades: " + juego.getSegundo());

		try
		{
			stock.obtenerPar(10);
		} catch (IndexOutOfBoundsException e)
		{
			System.out.println("Error: " + e.getMessage());
		}
		System.out.println();

		System.out.println("Juegos con poco stock (menos de 10 unidades):");
		for (Par<String, Integer> par : stock.obtenerTodosLosPares())
		{
			if (par.getSegundo() < 10)
			{
				System.out.println("- " + par.getPrimero() + ": " + par.getSegundo());
			}
		}
		System.out.println();

		double valorInventario = 0;
		for (int i = 0; i < stock.obtenerTodosLosPares().size(); i++)
		{
			int unidades = stock.obtenerPar(i).getSegundo();
			double precio = precios.obtenerPar(i).getSegundo();
			valorInventario += unidades * precio;
		}
		System.out.printf("Valor total del inventario: S/ %.2f%n%n", valorInventario);

		stock.obtenerPar(2).setSegundo(20);
		System.out.println("Despues de reponer GTA VI:");
		stock.mostrarPares();
	}
}