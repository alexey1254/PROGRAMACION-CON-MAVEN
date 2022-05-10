<<<<<<<< HEAD:tema06/src/main/java/es/alejandro/programacion/EjerciciosClase/Ejercicio01/Loteria.java
package es.alejandro.programacion.EjerciciosClase.Ejercicio01;
========
package es.alejandro.programacion.EjerciciosClase.Loteria;
>>>>>>>> dfd8a4d0b45d3c9ed592159de534ed5b5f4b52fb:tema06/src/main/java/es/alejandro/programacion/EjerciciosClase/Loteria/Loteria.java

import java.util.Set;
import java.util.TreeSet;

public class Loteria {
    private Set<Integer> numerosPrimitiva;

    /**
     * Constructor
     */
    public Loteria() {
        numerosPrimitiva = new TreeSet<>();
    }

    /**
     * Genera un numero aleatorio
     * 
     * @return int
     */
    private int generarNumeroAleatorio() {
        return (int) (49 * Math.random() + 1);
    }

    /**
     * Genera seis numeros aleatorios
     * 
     * @return int[]
     */
    private int[] generarNumerosAleatorios() {
        int[] numerosAleatorios = new int[6];

        for (int i = 0; i < numerosAleatorios.length; i++) {
            numerosAleatorios[i] = generarNumeroAleatorio();
        }
        for (int i = 0; i < numerosAleatorios.length; i++) {
            for (int j = 0; j < numerosAleatorios.length - 1; j++) {
                if (numerosAleatorios[i] == numerosAleatorios[j + 1] && j + 1 != i) {
                    numerosAleatorios[j + 1] = generarNumeroAleatorio();
                }
            }
        }
        return numerosAleatorios;
    }

    /**
     * Añade los numeros a numerosPrimitiva
     */
    protected void generarNumerosPrimitiva() {
        int[] numeros = generarNumerosAleatorios();
        int i = 0;
        while (numerosPrimitiva.size() < 6) {
            numerosPrimitiva.add(numeros[i]);
            i++;
        }
    }

    /**
     * Elimina todos los numeros de la variable numerosPrimitiva
     */
    protected void eliminarNumerosPrimitiva() {
        numerosPrimitiva.clear();
    }

    @Override
    public String toString() {
        return numerosPrimitiva.toString();
    }

    protected Set<Integer> getNumerosPrimitiva() {
        return numerosPrimitiva;
    }

}
