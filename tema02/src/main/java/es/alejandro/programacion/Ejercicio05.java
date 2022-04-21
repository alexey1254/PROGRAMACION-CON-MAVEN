package es.alejandro.programacion;

/**
 * Programa que reciba un número, n, y muestre las tablas de multiplicar del 2 hasta n
 */
import java.util.Scanner;

public class Ejercicio05 {
    public static void main(String[] args) {
        Scanner sc = new java.util.Scanner(System.in);
        System.out.println("Introduce hasta donde quieres que lleguen las tablas: ");
        int inputUser = sc.nextInt();
        sc.close();
        for (int i = 2; i <= inputUser; i++) {
            System.out.println("--------------------------------");
            System.out.println("Tabla del " + i + ": ");
            for (int j = 0; j <= 10; j++) {
                System.out.println(i + " * " + j + " = " + (i * j));

            }
        }
    }
}
