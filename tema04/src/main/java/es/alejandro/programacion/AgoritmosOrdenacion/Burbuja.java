package es.alejandro.programacion.AgoritmosOrdenacion;

import java.util.Arrays;

/**
 * Algoritmo de ordenacion burbuja, poco eficiente pero util en arrays pequeños
 * @author aleco
 */
public class Burbuja {
    
    /**
     * 
     * @param v Vector
     * @param i Indice
     * @param j Indice + 1
     */
    public static void swap(int[] v, int i, int j) {
        int aux = v[i];
        v[i] = v[j];
        v[j] = aux;
    }

    /**
     * Metodo que ordena de menor a mayor
     * @param vector
     */
    public static void burbuja(int[] vector) {
        int i, j, aux;
        for (i = 0; i < vector.length - 1; i++) {
        for (j = 0; j < vector.length - i - 1; j++) {
        if (vector[j] > vector[j + 1]) {
        swap(vector,j,j+1);
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] a = {567,2,55,4};
        burbuja(a);
        System.out.println(Arrays.toString(a));
    }
}
