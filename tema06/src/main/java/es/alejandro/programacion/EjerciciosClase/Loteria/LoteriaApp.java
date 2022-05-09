package es.alejandro.programacion.EjerciciosClase.Loteria;

import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

public class LoteriaApp {
    private static ArrayList<Integer> todosLosNumerosPrimitiva = new ArrayList<>();

    /**
     * Añade los numeros de la primitiva
     */
    private static void addTodosLosNumeros(Set<Integer> numeros) {
        todosLosNumerosPrimitiva.addAll(numeros);
    }

    /**
     * 
     * @return
     */
    protected static ArrayList<Integer> getTodosLosNumerosPrimitiva() {
        return (ArrayList<Integer>) todosLosNumerosPrimitiva;
    }

    public static void main(String[] args) {
        Set<Integer> numerosPrimitiva = new TreeSet<>();
        Loteria numerosPremiados = new Loteria();
        int numeroVeces = 10;

        // Bucle
        for (int i = 0; i <= numeroVeces; i++) {
            numerosPremiados.generarNumerosPrimitiva();
            numerosPrimitiva = numerosPremiados.getNumerosPrimitiva();
            addTodosLosNumeros(numerosPrimitiva);
            numerosPremiados.eliminarNumerosPrimitiva();
        }

        // Primera salida
        System.out.println(todosLosNumerosPrimitiva + "\n");

        // Calcular las estadisticas:
        System.out.println("La media de numeros es -> " + Estadisticas.calculoMedia(todosLosNumerosPrimitiva) + "\n");

        System.exit(0);
    }
}
