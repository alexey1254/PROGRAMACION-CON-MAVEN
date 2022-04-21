package es.alejandro.programacion;

/**
 * Programa que genere un num aleatorio entre 1 - 100 y le de al usuario la
 * oportunidad de adivinarlo en 7 intentos.
 */
public class Ejercicio15 {

    public static boolean esMenor(int numUsuario, int numAleatorio) {
        return numUsuario < numAleatorio;
    }

    public static boolean esMayor(int numUsuario, int numAleatorio) {
        return numUsuario > numAleatorio;
    }

    public static boolean esIgual(int numUsuario, int numAleatorio) {
        return numUsuario == numAleatorio;
    }

    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int numAleatorio = (int) (1 + Math.random() * 101);
        System.out.println("Programa que genera un numero aleatorio\n"
                + "entre 1 y 100.\n"
                + "Tienes 7 oportunidades para adivinarlo");
        int contador = 1;
        int userInput;
        do {
            System.out.println("Introduce un número: ");
            userInput = sc.nextInt();
            if (esIgual(userInput, numAleatorio)) {
                System.out.println("Has ganado! El número era --> " + numAleatorio);
                System.exit(0);
            } else if (esMenor(userInput, numAleatorio)) {
                System.out.println("Tu numero es menor.");
            } else if (esMayor(userInput, numAleatorio)) {
                System.out.println("Tu numero es mayor.");
            }
            if (contador <= 7) {
                System.out.println("Te quedan: " + (7 - contador) + " oportunidad(es).\n"
                        + "---------------------------------");
            } else {
                break;
            }
            contador++;
        } while (contador <= 7);
        sc.close();
        System.out.println("Has perdido, el número era: " + numAleatorio);
        System.exit(0);
    }
}
