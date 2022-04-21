package es.alejandro.programacion.Extras;

/**
 * Programa que reciba una cadena de 9 caracteres representado los permisos de
 * Linux y devuelve el número en decimal de 3 dígitos representado a dichos
 * permisos. Ejemplo: rwxr-xr-x debe devolver 755.
 */

import java.util.Scanner;

public class Extra09 {
    static String getGrupo(String permiso, int grupo) {
        if (grupo == 1) {
            return permiso.substring(0, 3);
        } else if (grupo == 2) {
            return permiso.substring(3, 6);
        } else {
            return permiso.substring(6, 9);
        }
    }

    static String getPermiso(String permiso) {
        switch (permiso) {
            case "---":
                return "0";

            case "--x":
                return "1";

            case "-w-":
                return "2";

            case "-wx":
                return "3";

            case "r--":
                return "4";

            case "r-x":
                return "5";

            case "rw-":
                return "6";

            case "rwx":
                return "7";

            default:
                return "0";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce los permisos: ");
        String permisos = sc.next();
        String grupo1 = getGrupo(permisos, 1);
        String grupo2 = getGrupo(permisos, 2);
        String grupo3 = getGrupo(permisos, 3);
        String imprimirPermisos = getPermiso(grupo1) + getPermiso(grupo2) + getPermiso(grupo3);
        System.out.println("Los permisos son: " + imprimirPermisos);
        sc.close();
        System.exit(0);
    }
}
