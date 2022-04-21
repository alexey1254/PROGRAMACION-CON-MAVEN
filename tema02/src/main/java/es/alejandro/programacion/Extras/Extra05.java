package es.alejandro.programacion.Extras;

import java.util.Scanner;

public class Extra05 {
    public static int maxmimoComunDivisor(int a, int b) {
        int mayor = Math.max(a, b);
        int menor = Math.min(a, b);
        int resultado = 0;
        do {
            resultado = menor;
            menor = mayor % menor;
            mayor = resultado;
        } while (menor != 0);
        return resultado;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bucle = 1;
        do {
            System.out.println("Introduce el primer número: ");
            int num1 = sc.nextInt();
            System.out.println("Introduce el segundo número: ");
            int num2 = sc.nextInt();
            System.out.println(
                    "El maximo común divisor de " + num1 + " y " + num2 + " es: " + maxmimoComunDivisor(num1, num2));
            System.out.println("Deseas salir del programa?\n1. --> Seguir.\n2. --> Salir.");
        } while (bucle == 1);
        sc.close();
    }
}
