package es.alejandro.programacion;

/**
 * Programa que reciba un número, n, y nos dé la suma de los números
 * comprendidos entre [1,n] (Aquí también está el 4)
 */
import java.util.Scanner;

public class Ejercicio03 {

    public static void main(String[] args) {
        Scanner sc = new java.util.Scanner(System.in);
        int n = sc.nextInt(), i, calculo = 0, producto = 0;
        sc.close();
        for (i = 1; i <= n; i++) {
            calculo += i;
            producto *= i;
        }
        System.out.println("La suma de los numeros ha dado: " + calculo);
        System.out.println("El producto de los numeros es: " + producto);
    }
}
