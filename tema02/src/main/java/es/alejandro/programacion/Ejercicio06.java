package es.alejandro.programacion;

/**
 * Programa que reciba un número e imprima todos los números primos comprendidos
 * entre 1 y ese número (un número es primo si y sólo si es divisible por 1 y él
 * mismo)
 *
 * @author aleco
 */
public class Ejercicio06 {

    public static boolean esPrimo(int numero1) {
        for (int i = 2; i <= Math.sqrt(numero1); i++) {
            if (numero1 % i == 0) {
                return false; // no es primo
            }
        }
        return true; // Es primo
    }

    public static boolean numValido(int numero) {
        return numero <= 0 || numero == 1;
    }

    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("Introduce un número: ");
        int inputUser = 0;
        do {
            inputUser = sc.nextInt();
            if (!numValido(inputUser)) {
                System.out.println("El numero es erroneo\n"
                        + "introduce uno diferente: ");
            }
        } while (!numValido(inputUser));
        for (int i = 2; i <= inputUser; i++) {
            if (!esPrimo(i)) {
                // No hacer nada si no es primo
            } else {
                System.out.println("Numero primo: " + i);
            }
        }
        sc.close();
    }
}
