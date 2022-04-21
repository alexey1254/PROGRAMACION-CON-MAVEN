package es.alejandro.programacion;

/**
 * Programa que reciba un número comprendido entre [1,3999] y lo muestre en
 * números Romanos (https://es.wikipedia.org/wiki/Numeración_romana)
 */
public class Ejercicio11 {

    public static String toNumRomanos(int numRomano) {
        String[] decenas = { "", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC" };
        String[] unidades = { "", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX" };
        String[] centenas = { "", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM" };
        String[] millar = { "", "M", "MM", "MMM" };
        return millar[numRomano / 1000] + centenas[(numRomano / 100) % 10] + decenas[(numRomano / 10) % 10]
                + unidades[numRomano % 10];
    }

    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int vcontrol = 1;
        System.out.println("Programa que recibe un número comprendido entre 1, 3999 y lo muestra en\n"
                + "números romanos");
        do {
            System.out.println("Introduce tu número: ");
            int numUsuario = sc.nextInt();
            // Input usuario ^
            // Verificar input usuario
            if (numUsuario < 1 || numUsuario > 3999) {
                do {
                    System.out.println("El numero introducido no es correcto.\n"
                            + "prueba a introducilo de nuevo.\n"
                            + "Debe de estar comprendido entre 1 y 3999.");
                    numUsuario = sc.nextInt();
                } while (numUsuario < 1 || numUsuario > 3999);
                // Fin de verificacion del input del usuario.
            }
            System.out.println("El " + numUsuario + " en romano es: " + toNumRomanos(numUsuario));
            System.out.println("Probar otro número?\n"
                    + "1. --> Seguir probando.\n"
                    + "2. --> Salir.");
            vcontrol = sc.nextInt();
            // Variable que hace que el bucle siga o se pare y cierre el programa.
        } while (vcontrol == 1);
        sc.close();
        System.out.println("Saliendo...\nNos vemos!");
        System.exit(0);
    }
}
