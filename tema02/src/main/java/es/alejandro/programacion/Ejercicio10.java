package es.alejandro.programacion;

/**
 * Programa que reciba tres números a, b y c, coeficientes de una ecuación de
 * segundo grado y dé sus soluciones (usar try catch)
 *
 * @author aleco
 */
public class Ejercicio10 {

    public static double getEcuacionPositiva(double a, double b, double c) {
        double dentroRaiz = (b * b) - 4 * (a * c);
        double raizHecha = Math.sqrt(dentroRaiz);
        return (-b + raizHecha) / (2 * a);
    }

    public static double getEcuacionNegativa(double a, double b, double c) {
        double dentroRaiz = (b * b) - 4 * (a * c);
        double raizHecha = Math.sqrt(dentroRaiz);
        return (-b - raizHecha) / (2 * a);
    }

    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int vcontrol = 0;
        do {
            System.out.println("Introduce el numero que corresponde a A: ");
            double numA = sc.nextDouble();
            System.out.println("Introduce el numero que corresponde a B: ");
            double numB = sc.nextDouble();
            System.out.println("Introduce el numero que corresponde a C: ");
            double numC = sc.nextDouble();
            System.out.println("Resultado 1. --> " + getEcuacionPositiva(numA, numB, numC));
            System.out.println("Resultado 2. --> " + getEcuacionNegativa(numA, numB, numC));
            System.out.println("----------------------------------------------------");
            // Fin del programa
            System.out.println("¿Desea salir?\n0. --> Seguir en el programa.\n1. --> Salir.");
            vcontrol = sc.nextInt();
        } while (vcontrol == 0);
        sc.close();
        System.out.println("Hasta pronto!!");
        System.exit(0);
    }
}
