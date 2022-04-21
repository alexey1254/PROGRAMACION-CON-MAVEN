package es.alejandro.programacion.Arrays;



import java.util.ArrayList;
import java.util.Arrays;

/**
 * 
 * @author aleco
 */

public class UtilidadesMatrices {
    /**
     * El constructor vacío privado porque no quiero que en esta clase se
     * instancien objetos.
     */
    private UtilidadesMatrices() { //

    }

    /**
     * Este metodo suma dos arrays Bidimensionales.
     * 
     * @param a
     * @param b
     * @return Un array bidimensional con la suma
     * @throws java.lang.Exception
     */
    public static int[][] arrayBidSuma(int a[][], int b[][]) throws Exception {
        if (a[0].length != b[0].length || a.length != b.length) {
            throw new Exception("No coinciden las dimensiones");
        }
        int[][] res = new int[a.length][a[0].length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                res[i][j] = a[i][j] + b[i][j];
            }
        }
        return res;
    }

    /**
     * Este metodo resta dos arrays Bidimensionales.
     * 
     * @param a
     * @param b
     * @return Un array bidimensional con la resta
     * @throws java.lang.Exception
     */
    public static int[][] restaBid(int a[][], int b[][]) throws Exception {
        if (a[0].length != b[0].length || a.length != b.length) {
            throw new Exception("No coinciden las dimensiones");
        }
        int res[][] = new int[a.length][a[0].length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                res[i][j] = a[i][j] - b[i][j];
            }
        }
        return res;
    }

    /**
     * Este metodo da el producto de dos arrays Bidimensionales.
     * 
     * @param a
     * @param b
     * @return Un array bidimensional con el producto
     * @throws java.lang.Exception
     */
    public static int[][] productoBid(int a[][], int b[][]) throws Exception {
        if (a.length != b.length || a[0].length != b[0].length) {
            throw new Exception("No coinciden las dimensiones.");
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                a[i][j] *= b[i][j];
            }
        }
        return a;
    }

    /**
     * Ejercicio numero 6.
     * 
     * @param numero
     * @return Un array de numeros enteros con sus elementos inicializados
     *         a la posicion de cada elemento (indice minimo 1)
     */
    public static int[] construyeArray(int numero) {
        int[] array = new int[numero];
        for (int i = 0; i < numero; i++) {
            array[i] = i + 1;
        }
        return array;
    }

    /**
     * Ejercicio numero 7.
     * 
     * @param array
     * @return Un array de una dimension con la tabla de multiplicar del numero
     *         que se le pase por parámetro.
     */
    public static int[] tablaMultiplicar(int array) {
        int[] tabla = new int[10];
        for (int i = 0; i < tabla.length; i++) {
            tabla[i] = array * (i + 1);
        }
        return tabla;
    }

    /**
     * Ejercicio numero 8.
     * 
     * @param array
     * @return El numero mayor del array
     */
    public static int numMaximo(int[] array) {
        int numGuardado = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > numGuardado) {
                numGuardado = array[i];
            }
        }
        return numGuardado;
    }
    

    /**
     * Ejercicio numero 9.
     * 
     * @param array
     * @return El numero menor del array
     */
    public static int numMinimo(int[] array) {
        int numGuardado = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < numGuardado) {
                numGuardado = array[i];
            }
        }
        return numGuardado;
    }

    /**
     * Ejercicio numero 10.
     * 
     * @param numero
     * @return Un array bidimensional donde el primero es el minimo y el segundo
     *         es el máximo.
     */
    public static int[][] numMinYMax(int[] numero) {
        int numMinimo = numMinimo(numero);
        int numMaximo = numMaximo(numero);
        int[][] minYMax = { { numMinimo }, { numMaximo } };
        return minYMax;
    }

    /**
     * Ejercicio numero 11.
     * 
     * @param numero
     * @param array
     * @return Devuelve la posicion del numero dentro del array
     *         en caso de que no exista devuelve -1.
     */
    public static int posicionNumEnArray(int numero, int[] array) {
        int posicion = 0;
        for (int i = 0; i < array.length; i++) {
            if (numero != (array[i])) {
                posicion = -1;
            } else {
                posicion = i;
                break;
            }
        }
        return posicion;
    }

    /**
     * Ejercicio numero 11.2.
     * 
     * @param numero
     * @param array
     * @return Todas las posiciones del numero introducido en un array
     */

    public static int[] posicionesArray(int numero, int[] array) {
        int[] posiciones;
        int contador = 0;
        int numeros = 0;
        for (int i = 0; i < array.length; i++) {
            if (numero == array[i]) {
                contador++;
            }
        }
        posiciones = new int[contador];
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            if (numero == array[i]) {
                posiciones[count] = i;
                count++;
            }
        }
        return posiciones;
    }

    /**
     * Ejercicio numero 12.
     * 
     * @param array
     * @return Devuelve la media de un array de enteros
     */
    public static int mediaArray(int[] array) {
        int totalValores = array.length;
        int suma = 0;
        for (int i = 0; i < totalValores; i++) {
            suma += array[i];
        }
        return suma / totalValores;
    }

    /**
     * Ejercicio numero 13.
     * 
     * @param array
     * @return Array que se le pasa pero invertido
     */
    public static int[] invierteArray(int array[]) {
        int[] nuevoArray = new int[array.length];
        int countNewArray = 0;
        for (int i = array.length - 1; i >= 0; i--) {
            nuevoArray[countNewArray] = array[i];
            countNewArray++;
        }
        return nuevoArray;
    }

    /**
     * Ejercicio numero 14.
     * 
     * @param indicesArray
     * @param numMin
     * @param numMax
     * @return Array de n numeros enteros aleatorios comprendidos entre numMin y
     *         numMax
     * @throws java.lang.Exception
     */

    public static int[] arrayAleatorio(int indicesArray, int numMin, int numMax) throws Exception {
        if (numMin > numMax) {
            throw new Exception("El numero menor debe de ser menor");
        } else if (indicesArray < 1) {
            throw new Exception("Los indices deben de ser mayores a 0");
        } else if (indicesArray > numMax) {
            throw new Exception("Los numeros van a salir repetidos");
        }
        int[] array = new int[indicesArray];
        int numAleatorio;
        int resto = numMax + 1 - numMin;
        for (int i = 0; i < array.length; i++) {
            numAleatorio = (int) (resto * Math.random() + numMin);
            for (int j = 0; j < 10; j++) {
                if (posicionNumEnArray(numAleatorio, array) == -1) {
                    array[i] = numAleatorio;
                }
            }
            // Comprobar ceros:

            int[] ceros = posicionesArray(0, array);
            if (ceros.length > 1) {
                for (int j = 1; j < ceros.length; j++) {
                    array[ceros[j]] = numAleatorio = (int) (resto * Math.random() + numMin);
                }
            }
        }
        return array;
    }

    /**
     * Criba erastotenes
     */
    public static boolean[] cribaErastotenes(int numero) throws Exception {
        if (numero < 3) {
            throw new Exception("El numero debe de ser mayor a 3");
        }
        int limite = (int) Math.ceil(Math.sqrt(numero));
        boolean[] res = new boolean[numero + 1];
        for (int i = 3; i < res.length; i += 2) {
            res[i] = true;

        }
        res[2] = true;

        for (int i = 3; i < limite; i += 2) {
            if (res[i]) { // si es primo
                for (int j = i + i; j < numero; j++) {
                    res[j] = false;
                }
            }
        }
        return res;
    }
    
    /**
     * Elimina repetidos
     * @param array
     * @return 
     */
    
    /* public static int[] eliminaRepetidos(int array[]) */
    
    /**
     * 
     * @param a
     * @return 
     */
    
    public static int[] eliminarRepetidos2(int[]a) {
        ArrayList<Integer> lista = new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
            if(!lista.contains(a[i])) {
                lista.add(a[i]);
            }
        }
        int res[] = new int[lista.size()];
        for (int i = 0; i < res.length; i++) {
            res[i]=lista.get(i);
        }
        return res;
    }
    
    /**
     * 
     * @param array
     * @return Array de 1 dimension 
     */
    public String toString(int[] array) {
        String res = "{";
        int i;
        for (i = 0; i < array.length; i++) {
            if(i<array.length-1) {
                res+=array[i]+", ";
            } else {
                res+=array[i];
            }
        }
        res+="}";
        return res;
    }
    
    /*public String toString(int[][] a) {
    
    }*/
    
    

    public static void main(String[] args) throws Exception {
        int[] x = { 1, 200, 3240, 400, 531, 3, 3 };

        System.out.println(Arrays.toString(x));

        // Metodo Arrays.deepToString para leer Array doble.
        // Arrays.toString para leer array normal
        // System.out.println(Arrays.toString(a));

    }
}
