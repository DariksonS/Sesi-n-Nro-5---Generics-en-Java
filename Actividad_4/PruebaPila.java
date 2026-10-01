package Actividad_4;

public class PruebaPila
{

    public static <T> void llenarPila(Pila<T> pila, T[] elementos)
    {
        for (T elemento : elementos)
            pila.push(elemento);
    }

    public static <T> void compararPilas(String nombre1, Pila<T> pila1,
                                         String nombre2, Pila<T> pila2)
    {
        System.out.printf("%s = %s%n", nombre1, pila1);
        System.out.printf("%s = %s%n", nombre2, pila2);
        System.out.printf("%s.esIgual(%s) -> %b%n%n", nombre1, nombre2, pila1.esIgual(pila2));
    }

    public static void main(String[] args)
    {
        Pila<Integer> pila1 = new Pila<>(5);
        Pila<Integer> pila2 = new Pila<>(5);
        Pila<Integer> pila3 = new Pila<>(5);
        Pila<Integer> pila4 = new Pila<>(5);

        llenarPila(pila1, new Integer[]{1, 2, 3});
        llenarPila(pila2, new Integer[]{1, 2, 3});
        llenarPila(pila3, new Integer[]{3, 2, 1});
        llenarPila(pila4, new Integer[]{1, 2});

        compararPilas("pila1", pila1, "pila2", pila2);
        compararPilas("pila1", pila1, "pila3", pila3);
        compararPilas("pila1", pila1, "pila4", pila4);

        Pila<String> pilaA = new Pila<>();
        Pila<String> pilaB = new Pila<>();
        llenarPila(pilaA, new String[]{"Java", "Generics", "Pila"});
        llenarPila(pilaB, new String[]{"Java", "Generics", "Pila"});

        compararPilas("pilaA", pilaA, "pilaB", pilaB);

        System.out.println("Estado de pila1 despues de comparar: " + pila1);
        System.out.println("Estado de pila2 despues de comparar: " + pila2);
    }
}