package es.alejandro.programacion.Extras;

/**
 * Método que reciba dos números enteros y devuelva el mínimo común múltiplo
 */
import java.util.Scanner;

public class Extra04 {
    public static int getMayor(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    public static int getMenor(int a, int b) {
        if (a < b) {
            return a;
        } else {
            return b;
        }
    }

    public static int minimoComunMultiplo(int a, int b) {
        int numMayor = getMayor(a, b);
        int numMenor = getMenor(a, b);
        int mcm = 1;
        int i = 2;
        while (i <= numMayor || i <= numMenor) {
            if (numMayor % i == 0 || numMenor % i == 0) {
                mcm = mcm * i;
                if (numMayor % i == 0) {
                    numMayor = numMayor / i;
                }
                if (numMenor % i == 0) {
                    numMenor = numMenor / i;
                }
            } else {
                i++;
            }
        }
        return mcm;
    }

    public static void main(String[] args) { //
        Scanner sc = new Scanner(System.in);
        int bucle = 1;
        do {
            System.out.println("Introduce el primer número: ");
            int num1 = sc.nextInt();
            System.out.println("Introduce el segundo número: ");
            int num2 = sc.nextInt();
            System.out.println(
                    "El minimo común multiplo es: " + minimoComunMultiplo(num1, num2) + "\n----------------------");
            System.out.println("Seguir en el programa?\n1. --> Seguir.\n2. --> Salir.");
            bucle = sc.nextInt();
        } while (bucle == 1);
        sc.close();
        System.exit(0);
    }
}
