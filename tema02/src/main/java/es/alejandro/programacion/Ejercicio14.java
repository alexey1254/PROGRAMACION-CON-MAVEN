package es.alejandro.programacion;

public class Ejercicio14 {

    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int vcontrol = 1;
        do {
            System.out.println("Introduce cuantos numeros quieres que aparezcan\n"
                    + "en la serie de fibonacci: ");

            int numeroMax = sc.nextInt();
            int numeroAnterior = 0;
            int siguienteNumero = 1;

            System.out.print("Se van a imprimir  " + numeroMax + " numeros: ");

            for (int i = 1; i <= numeroMax; ++i) {
                System.out.print(numeroAnterior + " ");

                int sum = numeroAnterior + siguienteNumero;
                numeroAnterior = siguienteNumero;
                siguienteNumero = sum;

                /*
                 * En cada iteracion estamos asignando el segundo numero al primer
                 * numero y asignando la suma de los ultimos dos al segundo numero
                 */
            }
            System.out.println("");
            // Cambiar vcontrol para salir del búcle
            System.out.println("\nQuieres seguir en el programa?\n"
                    + "1. --> Si.\n"
                    + "2. --> No.");
            vcontrol = sc.nextInt();
        } while (vcontrol == 1);
        sc.close();
        System.out.println("Nos vemos!");
        System.exit(0);
    }
}
