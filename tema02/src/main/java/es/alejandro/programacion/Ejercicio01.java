package es.alejandro.programacion;

import java.util.Scanner;

/*
1.- Programa que reciba tres números y diga cuál es el menor y el mayor
 */
public class Ejercicio01 {

    /**
     * 
     * @param n1 numero a comparar
     * @param n2 numero a comparar
     * @param n3 numero a comparar
     * @return El numero mayor
     */
    public static int comprobarMayor(int n1, int n2, int n3) {
        if (n1 > n2 && n1 > n3) {
            return n1;
        } else if (n2 > n3 && n2 > n1) {
            return n2;
        } else {
            return n3;
        }
    }

    /**
     * 
     * @param n1 numero a comparar
     * @param n2 numero a comparar
     * @param n3 numero a comparar
     * @return El menor de los numeros pasados
     */
    public static int comprobarMenor(int n1, int n2, int n3) {
        if (n1 < n2 && n1 < n3) {
            return n1;
        } else if (n2 < n1 && n2 < n3) {
            return n2;
        } else {
            return n3;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new java.util.Scanner(System.in);
        int vcontrol = 1;
        System.out.println("Programa que recibe tres números y dice cuál es el menor y el mayor");
        do {
            System.out.println("------------\nIntroduce el num1: ");
            int n1 = sc.nextInt();

            System.out.println("------------\nIntroduce el num2: ");
            int n2 = sc.nextInt();

            System.out.println("------------\nIntroduce el num3: ");
            int n3 = sc.nextInt();

            // El num mayor:
            System.out.println("------------------------\nEl numero mayor es: " + comprobarMayor(n1, n2, n3));
            // El num menor:
            System.out.println(
                    "------------------------\nEl numero menor es: " + comprobarMenor(n1, n2, n3)
                            + "\n------------------------");
            System.out.println("¿Quieres comprobar más números?\n1. --> Salir.\n2. --> Comprobar más números.");
            vcontrol = sc.nextInt();
        } while (vcontrol == 2);
        sc.close();
    }
}
