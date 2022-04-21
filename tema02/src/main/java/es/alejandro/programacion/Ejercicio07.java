package es.alejandro.programacion;

/**
 * Programa que reciba dos números y calcule la potencia del primero elevado al
 * segundo
 */
public class Ejercicio07 {

    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("Programa que reciba dos números y calcule\nla potencia del primero elevado al segundo");
        int variable = 0;
        do {
            System.out.println("Introduce el primer número: ");
            int num1 = sc.nextInt();
            System.out.println("Introduce el segundo número: ");
            int num2 = sc.nextInt();

            // Vamos a calcular la potencia del num1 elevado al segundo:
            int operacion = num1;
            for (int i = 1; i < num2; i++) {
                operacion *= num1;
            }
            System.out.println("La potencia de " + num1 + " elevado a " + num2 + " = " + operacion);
            System.out.println("------------------------------------------------------------------");
            System.out
                    .println("¿Deseas seguir en el programa?\n0 --> Seguir en el programa.\n1 --> Dejar el programa.");
            variable = sc.nextInt();
            System.out.println("------------------------------------------------------------------");
        } while (variable != 1);
        sc.close();
    }
}