package es.alejandro.programacion;

/**
 * Programa que imprima el "lucky number" de una persona. Éste se consigue
 * reduciendo la fecha de nacimiento a un sólo dígito. P.Ej. si la fecha de
 * nacimiento es 11-02-1973, entonces el sería: 11+2+1973=1986 -> 1+9+8+6=24 ->
 * 2+4=6. Entonces 6 sería el resultado
 *
 * @author aleco
 */
public class Ejercicio16 {

    public static int numeroSuerte(int x) {
        int n1 = x / 1000;
        int n2 = x / 100 % 10;
        int n3 = x / 10 % 10;
        int n4 = x % 10;
        return n1 + n2 + n3 + n4;
    }

    public static int reducirUnDigito(int x) {
        int n1 = x / 10 % 10;
        int n2 = x % 10;
        return n1 + n2;
    }

    public static void main(String[] args) {
        java.util.Scanner teclado = new java.util.Scanner(System.in);
        int dia;
        int mes;
        int year;
        int suma;
        String incorrecto = "Introduce el día de nacimiento: ";
        System.out.println();
        dia = teclado.nextInt();
        if (dia > 31 || dia < 1) {
            System.out.println(incorrecto);
            dia = teclado.nextInt();
        }
        System.out.println("Introduce el mes: ");
        mes = teclado.nextInt();
        if (mes > 12 || mes < 1) {
            System.out.println(incorrecto);
            mes = teclado.nextInt();
        }
        System.out.println("Introduce el año: ");
        year = teclado.nextInt();
        if (year < 1900 || year > 2021) {
            System.out.println(incorrecto);
            year = teclado.nextInt();
        }
        suma = dia + mes + year;
        int sumaTotal = numeroSuerte(suma);
        if (sumaTotal < 10) {
            System.out.println("Tu número de la suerte es: " + sumaTotal);
        } else {
            sumaTotal = reducirUnDigito(sumaTotal);
            System.out.println("Tu número de la suerte es: " + sumaTotal);
        }
        teclado.close();
        System.exit(0);
    }
}
