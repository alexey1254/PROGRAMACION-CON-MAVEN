package es.alejandro.programacion.Extras;

import java.util.Scanner;

// Programa que reciba un número en base 10 y lo muestre en base 2
public class Extra07 {
    static int toBinary(int numero) {
        int digito;
        int exponente = 0;
        int binario = 0;
        while (numero != 0) {
            digito = numero % 2;
            binario = binario + digito * (int) Math.pow(10, exponente);
            exponente++;
            numero = numero / 2;
        }
        return binario;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int seguir = 0;
        do {
            System.out.println("Introduce un numero para mostrar en binario: ");
            int numUsuario = sc.nextInt();
            System.out.println("El numero " + numUsuario + " en binario es: " + toBinary(numUsuario));
            System.out.println("Deseas seguir en el programa?\n1. --> Seguir.\n2. --> Salir.");
            seguir = sc.nextInt();
        } while (seguir == 1);
        System.out.println("Saliendo");
        sc.close();
        System.exit(0);
    }
}
