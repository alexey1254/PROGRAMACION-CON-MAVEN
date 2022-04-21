package es.alejandro.programacion.Examen;

import java.util.Arrays;

/**
 * @author Alejandro Marrero
 */
public class Ejercicio2 {
    
    /**
     * Multiplica todos los valores del array por un numero pasado
     * @param numero el cual quieres que se multipliquen los valores del array
     * @param array el cual quieres que se multiplique
     * @return
     */
    public static double[] multiplicarArray(double numero, double[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] * numero;
        }
        return array;
    }
    /**
     * Metodo main
     * @param args
     */
    public static void main(String[] args) {
        double array[] = {1,2,3,4,5};
        System.out.println(Arrays.toString(multiplicarArray(2,array)));
    }
}
