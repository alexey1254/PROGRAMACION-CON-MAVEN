package es.alejandro.programacion;

/**
 * Programa que nos diga cuántos dígitos tiene un número introducido por teclado
 *
 * @author aleco
 */
public class Ejercicio09 {

    static int getDigitos(long num) {
        long operacion = 1;
        int contador = 0;
        do {
            operacion = num /= 10;
            contador++;
        } while (operacion > 0);
        return contador;
    }

    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("Programa que nos dice cuántos dígitos tiene un número introducido por teclado");
        System.out.println("-----------------------------------------------------------------------------");
        int vcontrol = 1;
        do {
            System.out.println("Introduce un número: ");
            long numero = sc.nextLong();
            System.out.println("El número tiene " + getDigitos(numero) + " dígito(s).");
            System.out.println("----------------------------------------------------");
            System.out.println(
                    "¿Quieres seguir en el programa?\n0. --> Seguir en el programa.\n1. --> Dejar el programa.");
            vcontrol = sc.nextInt();

        } while (vcontrol == 0);
        sc.close();
    }
}