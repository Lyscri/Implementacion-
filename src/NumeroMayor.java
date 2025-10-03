import java.util.List;

public class NumeroMayor {

    // Esta función recibe una lista de enteros y devuelve el número mayor
    public static int encontrarMayor(List<Integer> numeros) {
        // Supongamos que el primer número es el más grande
        int mayor = numeros.get(0);

        // Ahora recorro todos los demás números de la lista
        for (int i = 1; i < numeros.size(); i++) {
            int actual = numeros.get(i);

            // Cada vez me pregunto: ¿este número es más grande que el que tengo guardado?
            if (actual > mayor) {

                mayor = actual;
            }
        }
        return mayor;
    }

    // Para probarlo rápido con un ejemplo
    public static void main(String[] args) {
        List<Integer> lista = List.of(4, 2, 9, 1, 7);
        System.out.println("El número mayor es: " + encontrarMayor(lista));
}
}