package es.alejandro.programacion;
// Programa que reciba un número entero y lo imprima al revés. P.ej.: si recibe el número 1759 debería

// imprimir 9571.
import java.util.Scanner;

public class Ejercicio22 {
    public static int anchoNum(int num) {
        if (num > 9 && num < 100) {
            return 2;
        } else if (num > 99 && num < 1000) {
            return 3;
        } else if (num > 999 && num < 10000) {
            return 4;
        } else if (num > 9999 && num < 100000) {
            return 5;
        } else if (num > 99999 && num < 1000000) {
            return 6;
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número y se imprimirá al revés.\nSe permiten del 10 al 999.999");
        int numeroUsuario = 0;
        do {
            numeroUsuario = sc.nextInt();
            if (numeroUsuario < 9) {
                System.out.println("El numero introducido no es correcto, vuelve a introducirlo: ");
            }
        } while (numeroUsuario <= 9);
        int char1;
        int char2;
        String numReves = "Tu numero al revés es: ";
        sc.close();
        // Ver el ancho del numero.
        if (anchoNum(numeroUsuario) == 0) {
            System.err.println("El numero introducido no está soportado");
            System.exit(1);
        } else if (anchoNum(numeroUsuario) == 2) {
            char1 = numeroUsuario / 10;
            char2 = numeroUsuario % 10;
            System.out.println(numReves + char2 + "" + char1);
        } else if (anchoNum(numeroUsuario) == 3) {
            char1 = numeroUsuario % 10;
            char2 = numeroUsuario / 10 % 10;
            int char3 = numeroUsuario / 100 % 10;
            System.out.println(numReves + char1 + "" + char2 + "" + char3);
        } else if (anchoNum(numeroUsuario) == 4) {
            char1 = numeroUsuario % 10;
            char2 = numeroUsuario / 10 % 10;
            int char3 = numeroUsuario / 100 % 10;
            int char4 = numeroUsuario / 1000 % 10;
            System.out.println(numReves + char1 + "" + char2 + "" + char3 + "" + char4);
        } else if (anchoNum(numeroUsuario) == 5) {
            char1 = numeroUsuario % 10;
            char2 = numeroUsuario / 10 % 10;
            int char3 = numeroUsuario / 100 % 10;
            int char4 = numeroUsuario / 1000 % 10;
            int char5 = numeroUsuario / 10000 % 10;
            System.out.println(numReves + char1 + "" + char2 + "" + char3 + "" + char4 + "" + char5);
        } else if (anchoNum(numeroUsuario) == 6) {
            char1 = numeroUsuario % 10;
            char2 = numeroUsuario / 10 % 10;
            int char3 = numeroUsuario / 100 % 10;
            int char4 = numeroUsuario / 1000 % 10;
            int char5 = numeroUsuario / 10000 % 10;
            int char6 = numeroUsuario / 100000 % 10;
            System.out.println(numReves + char1 + "" + char2 + "" + char3 + "" + char4 + "" + char5 + "" + char6);
        }
        System.exit(0);
    }
}
