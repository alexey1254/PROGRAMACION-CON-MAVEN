
package es.alejandro.programacion;

/**
 * Programa que reciba un número y diga si es primo
 */
public class Ejercicio12 {
    public static boolean esPrimo(int num) {
        if (num == 0 || num == 1 || num == 4) {
            return false;
        }
        for (int i = 2; i < num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int userInput;
        int vcontrol = 1;
        System.out.println("Programa que recibe un\nnumero y dice si es primo");
        do {
            System.out.println("Introduce un número: ");
            userInput = sc.nextInt();
            if (esPrimo(userInput)) {
                System.out.println("El número " + userInput + " es primo\n"
                        + "----------------------------------");
            } else {
                System.out.println("El número " + userInput + " no es primo");
            }
            System.out.println("Quieres seguir en el programa?\n1. --> Seguir.\n2. --> Salir.");
            vcontrol = sc.nextInt();
        } while (vcontrol == 1);
        sc.close();
        System.out.println("Un saludo!");
        System.exit(0);
    }
}
