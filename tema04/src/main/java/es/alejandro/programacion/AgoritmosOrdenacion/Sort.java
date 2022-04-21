package es.alejandro.programacion.AgoritmosOrdenacion;

import java.util.Arrays;

/**
 * Algoritmo de ordenacion sort
 * @author Alex
 */
public class Sort {
    
    /**
     * 
     * @param v
     * @param i
     * @param j 
     */
    public static void swap(int[] v, int i, int j) {
        int aux = v[i];
        v[i] = v[j];
        v[j] = aux;
    }

    public static void seleccion(int[] vector) {
        for (int i = 0; i < vector.length - 1; i++) {
            for (int j = i + 1; j < vector.length; j++) {
                if (vector[i] < vector[j]) {
                    swap(vector, i, j);
                }
            }
        }
        System.out.println(Arrays.toString(vector));
    }

    public static void main(String args[]) {
        int a[] = {15, 252, 324, 412, 33, 4, 2, 4, 2, 4, 2, 4, 2, 3, 1223, 0, 1};
        seleccion(a);
        
    }
}
