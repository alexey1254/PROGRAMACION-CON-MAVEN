package es.alejandro.programacion.Extras;

// Programa que reciba un número y lo descomponga en el producto de sus factores
// primos
import java.util.Scanner;

public class Extra06 {
    public static boolean esPrimo(int numero1) {
        for (int i = 2; i <= Math.sqrt(numero1); i++) {
            if (numero1 % i == 0) {
                return false; // no es primo
            }
        }
        return true; // Es primo
    }

    public static int siguientePrimo(int num) {
        do {
            num++;
        } while (!esPrimo(num));
        return num;
    }

    public static void descomponerFactores(int num) {
        int factorPrimo = 2;
        boolean primerFactor = true;
        do {
            if (num % factorPrimo == 0) {
                if (primerFactor) {
                    System.out.print(factorPrimo);
                    primerFactor = false;
                } else {
                    System.out.print(" x " + factorPrimo);
                    num /= factorPrimo;
                }
            } else {
                factorPrimo = siguientePrimo(factorPrimo);
            }
        } while (num > 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        int salir = 0;
        do {
            do {
                System.out.println("Introduce un numero >1: ");
                numero = sc.nextInt();
            } while (numero <= 1); // Verificamos que el numero sea valido.
            System.out.println("Los factores de " + numero + " son: ");
            descomponerFactores(+numero);
            System.out.println("\n----------------------------");
            System.out.println("Deseas salir del programa?");
            System.out.println("1. --> Seguir en el programa.\n2. --> Salir.");
            salir = sc.nextInt();
        } while (salir == 1);
        sc.close();
        System.out.println("Saliendo...");
        System.exit(0);
    }
}
