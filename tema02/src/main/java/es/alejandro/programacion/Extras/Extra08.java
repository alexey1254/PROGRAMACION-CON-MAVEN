package es.alejandro.programacion.Extras;

import java.util.Scanner;

// Programa que reciba un número de 3 dígitos en decimal y diga los permisos de
// Linux correspondientes. Ejemplo 755 devolvería rwx r-x r-x
public class Extra08 {
    static int getCaracter(int numero, int posicion) {
        if (posicion == 1) {
            return numero / 100;
        } else if (posicion == 2) {
            return numero / 10 % 10;
        } else {
            return numero % 10;
        }
    }

    static String getPermiso(int permiso) {
        switch (permiso) {
            case 0:
                return "---";

            case 1:
                return "--x";

            case 2:
                return "-w-";

            case 3:
                return "-wx";

            case 4:
                return "r--";

            case 5:
                return "r-x";

            case 6:
                return "rw-";

            case 7:
                return "rwx";

            default:
                return "";
        }
    }

    public static void main(String[] args) { //
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce los permisos: ");
        int permisos = sc.nextInt();
        int grupo1 = getCaracter(permisos, 1);
        int grupo2 = getCaracter(permisos, 2);
        int grupo3 = getCaracter(permisos, 3);
        String imprimirPermisos = getPermiso(grupo1) + " " + getPermiso(grupo2) + " " + getPermiso(grupo3);

        System.out.println(imprimirPermisos);
        sc.close();
        System.exit(0);
    }
}
