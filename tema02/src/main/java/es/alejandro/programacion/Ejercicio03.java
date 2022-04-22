package es.alejandro.programacion;

/**
 * @author Alejandro
 * Programa que reciba un número, n, y nos dé la suma de los números
 * comprendidos entre [1,n] (Aquí también está el ej 4)
 */
import java.util.Scanner;

public class Ejercicio03 {

    public static void main(String[] args) {
        Scanner sc = new java.util.Scanner(System.in);
        int numero = sc.nextInt();
        long calculo = 0;
        long producto = 1;
        sc.close();
        for (int i = 1; i <= numero; i++) {
            calculo += i;
            producto *= i;
        }
        System.out.println("La suma de los numeros ha dado: " + calculo);
        System.out.println("El producto de los numeros es: " + producto);
    }
}
