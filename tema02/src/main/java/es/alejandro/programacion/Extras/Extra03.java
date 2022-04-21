package es.alejandro.programacion.Extras;

/**
 * Programa que pida números al usuario hasta que el usuario introduzca 0 y dé
 * la suma de todos los números introducidos
 */
import java.util.Scanner;

public class Extra03 {
    public static boolean esCero(int num) {
        return num == 0;
    }

    public static void main(String[] args) { //
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero para ir sumando: ");
        int inputUsuario = 0;
        int suma = 0;
        do {
            System.out.println("Introduce un numero: ");
            inputUsuario = sc.nextInt();
            suma += inputUsuario;
            if (!esCero(inputUsuario)) {
                System.out.println("La suma es: " + suma);
            }
        } while (!esCero(inputUsuario));
        System.out.println("La suma total es: " + suma);
        sc.close();
        System.exit(0);
    }
}