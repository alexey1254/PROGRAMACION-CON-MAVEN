<<<<<<<< HEAD:tema06/src/main/java/es/alejandro/programacion/EjerciciosClase/Ejercicio01/Estadisticas.java
package es.alejandro.programacion.EjerciciosClase.Ejercicio01;
========
package es.alejandro.programacion.EjerciciosClase.Loteria;
>>>>>>>> dfd8a4d0b45d3c9ed592159de534ed5b5f4b52fb:tema06/src/main/java/es/alejandro/programacion/EjerciciosClase/Loteria/Estadisticas.java

import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 * @author Alejandro
 */
public class Estadisticas {
    // ! Hacer metodo para coger la moda, otro para los seis numeros que mas salen

    /**
     * Calcula la Media de los numeros dentro de un TreeSet
     * 
     * @param numerosParaCalcular ArrayList<Integer>
     * @return int
     */
    public static int calculoMedia(ArrayList<Integer> numerosParaCalcular) {
        int numerosQueHay = 0;
        int suma = 0;
        for (Integer numero : numerosParaCalcular) {
            suma += numero;
            numerosQueHay++;
        }
        return suma / numerosQueHay;
    }

    /**
     * Devuelve el numero que mas se repite
     * 
     * @param numerosParaCalcular
     * @return int
     */
    // public static int calculoModa(ArrayList<Integer> numerosParaCalcular) {

    // }
}
