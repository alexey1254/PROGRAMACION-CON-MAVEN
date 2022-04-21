package es.alejandro.programacion;

/**
 * Programa que genere un número aleatorio entre [100,200] e imprima el número y
 * diga si es par o impar
 */

public class Ejercicio02 {
    public static boolean esPar(int n) {
        return n % 2 == 0;
    }

    public static void main(String[] args) {
        int numero = (int) (100 + Math.random() * 101);
        System.out.println(numero);
        if (esPar(numero)) {
            System.out.println("Es par");
        } else {
            System.out.println("Es impar");

        }
    }
}
