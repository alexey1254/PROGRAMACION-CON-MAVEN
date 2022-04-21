package es.alejandro.programacion;

/**
 * Programa que reciba un número impar, n, e imprima un rombo de caracteres '*'
 * de diagonal n
 *
 * @author aleco
 */
import java.util.Scanner;

public class Ejercicio17 {
    public static boolean numFilasCorrecto(int filas) {
        return filas % 3 == 0 && filas > 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numFilasRomboUsuario;
        char caracter = '*';
        int controlPrograma = 1;
        System.out.println("Programa que imprime un rombo de diagonal n\n"
                + "introducida por el usuario");
        /**
         * Pedir datos
         */
        do { // No va a salir del bucle hasta que introduzca un número válido.
            do { // Verificar si el numero introducido es correcto.
                System.out.println("Introduce el numero de filas (impar): ");
                numFilasRomboUsuario = sc.nextInt();
                if (!numFilasCorrecto(numFilasRomboUsuario)) { // Si es incorrecto se vuelve a hacer el búcle y pide
                                                               // otro número.
                    System.out.println("El numero de filas es incorrecto. Introduce otro número: ");
                }
            } while (!numFilasCorrecto(numFilasRomboUsuario));

            /**
             * Aqui empieza el rombito
             */
            System.out.println("");
            int numFilas = numFilasRomboUsuario / 2 + 1;
            for (int altura = 1; altura <= numFilas; altura++) {
                // Blancos
                for (int blancos = 1; blancos <= numFilas - altura; blancos++) {
                    System.out.print(" ");
                }
                // Asteriscos
                for (int asteriscos = 1; asteriscos <= (2 * altura) - 1; asteriscos++) {
                    System.out.print(caracter);
                }
                System.out.println("");
                /**
                 * En caso de querer hacerlo como en el examen, le pongo el
                 * valor por defecto 'a' e incremento el valor de 'caracter'
                 */
            }
            // Reducir el numero de filas
            numFilas--;

            for (int altura = 1; altura <= numFilas; altura++) {
                // Blancos
                for (int blancos = 1; blancos <= altura; blancos++) {
                    System.out.print(" ");
                }
                // Asteriscos
                for (int asteriscos = 1; asteriscos <= (numFilas - altura) * 2 + 1; asteriscos++) {
                    System.out.print(caracter);
                }
                System.out.println();
                /**
                 * En caso de querer hacerlo como en el examen, le pongo el
                 * valor por defecto 'a' e incremento el valor de 'caracter'
                 */
            }
            System.out.println("¿Deseas hacer otro rombito?\n"
                    + "1. --> Hacer otro rombito.\n"
                    + "2. --> Salir.");
            controlPrograma = sc.nextInt();
        } while (controlPrograma == 1);
        sc.close();
        System.exit(0);
    }
}
