package es.alejandro.programacion.Extras;

/**
 * Método (función) que calcule la hipotenusa de un triángulo rectángulo
 */
import java.util.Scanner;

public class Extra01 {
    public static double getHipotenusa(double a, double b) {
        double raiz = a * a + b * b;
        return Math.sqrt(raiz);
    }

    public static void main(String[] args) {
        int bucle = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println(
                "Este programa está hecho con un método que devuelve la hipotenusa de un triángulo rectángulo.");
        /**
         * Bucle que haga que el usuario decida cuando parar el programa
         */
        do {
            System.out.println("Introduce el primer número: ");
            double numUsuario1 = sc.nextDouble();
            System.out.println("Introduce el segundo número: ");
            double numUsuario2 = sc.nextDouble();
            System.out.println("El resultado es: " + getHipotenusa(numUsuario1, numUsuario2));
            /**
             * Preguntar si quiere seguir en el programa:
             */
            System.out.println("Deseas seguir en el programa?\n1. --> Si.\n2. --> Salir.");
            bucle = sc.nextInt();
        } while (bucle == 1);
        System.out.println("Nos vemos!");
        sc.close();
        System.exit(0);
    }
}
