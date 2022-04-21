package es.alejandro.programacion.Extras;

/**
 * Método (función) que reciba un número entero positivo n y diga si es capicúa
 * (que coincida el número del derecho y del revés). Por ejemplo 34543
 */
import java.util.Scanner;

public class Extra02 {
    public static boolean esValido(int n) {
        return n >= 0;
    }

    public static boolean isCapicua(int numero) {
        int numAux = numero;
        int numInverso = 0;
        int cifra;
        while (numAux != 0) {
            cifra = numAux % 10;
            numInverso = numInverso * 10 + cifra;
            numAux = numAux / 10;
        }
        return numero == numInverso;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int userInput = 0;
        /**
         * Verificamos que el numero sea correcto
         */
        do {
            System.out.println("Introduce un número: ");
            userInput = sc.nextInt();
            if (!esValido(userInput)) {
                System.out.println("El numero no es válido. |");
            }
        } while (!esValido(userInput));
        /**
         * Resolución del problema / output
         */
        if (isCapicua(userInput)) {
            System.out.println("------------------- |\nEl número es capicúa. |");
        } else {
            System.out.println("------------------- |\nEl numero no es capicúa.");
        }
        /**
         * Cerramos el Scanner y salimos.
         */
        sc.close();
        System.exit(0);
    }
}
