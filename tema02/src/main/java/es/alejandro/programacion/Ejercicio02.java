package es.alejandro.programacion;

/**
 * @author Alejandro
 *         Programa que genere un número aleatorio entre [100,200] e imprima el
 *         número y
 *         diga si es par o impar
 */

public class Ejercicio02 {
    /**
     * 
     * @param numero
     * @return True si es par
     */
    private static boolean esPar(int numero) {
        return numero % 2 == 0;
    }

    /**
     * Genera un numero aleatorio entre minimo y maximo ambos inclusive
     * 
     * @param min
     * @param max
     * @return numero Aleatorio
     */
    private static long generarAleatorio(long min, long max) {
        long resto = min + 1 - max;
        long numAleatorio = (long) (resto * Math.random() + max);
        return numAleatorio;
    }

    private static void imprimirResultado(int numeroAleatorioGenerado) {
        if (esPar(numeroAleatorioGenerado)) {
            System.out.printf("El numero %d es par", numeroAleatorioGenerado);
        } else {
            System.out.printf("El numero %d es impar", numeroAleatorioGenerado);
        }
    }

    public static void main(String[] args) {
        int numeroAleatorioGenerado = (int) generarAleatorio(100, 200);
        imprimirResultado(numeroAleatorioGenerado);
    }
}
