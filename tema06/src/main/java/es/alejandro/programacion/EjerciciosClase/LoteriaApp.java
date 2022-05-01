package es.alejandro.programacion.EjerciciosClase;

import java.util.Set;
import java.util.TreeSet;

public class LoteriaApp {
    private static int[] todosLosNumerosPrimitiva;// esto tiene que ser otra cosa que no sea un array

    /**
     * Añade los numeros de la primitiva
     */
    private static void addTodosLosNumeros(Set<Integer> numeros) {
        int i = 0;
        for (Integer numero : numeros) {
            todosLosNumerosPrimitiva[i] = numero;
            i++;
        }

    }

    /**
     * 
     * @return
     */
    protected static int[] getTodosLosNumerosPrimitiva() {
        return todosLosNumerosPrimitiva;
    }

    public static void main(String[] args) {
        Set<Integer> numerosPrimitiva = new TreeSet<>();
        Loteria l = new Loteria();
        int numeroVeces = 45;
        todosLosNumerosPrimitiva = new int[numeroVeces];
        // Bucle
        for (int i = 0; i <= numeroVeces; i++) {
            l.generarNumerosPrimitiva();
            numerosPrimitiva = l.getNumerosPrimitiva();
            addTodosLosNumeros(numerosPrimitiva);
            l.eliminarNumerosPrimitiva();
        }
        System.out.println(todosLosNumerosPrimitiva);
        System.exit(0);
    }
}
