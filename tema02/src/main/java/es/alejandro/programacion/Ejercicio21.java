package es.alejandro.programacion;

// Programa que reciba un día, mes y año y diga si la fecha es correcta (hay que tener en cuenta si el
// año es bisiesto)
import java.util.Scanner;

public class Ejercicio21 {
    public static boolean esBisiesto(int year) {
        return year % 4 == 0;
    }

    public static boolean anioCorrecto(int year) {
        return year >= 1800 && year <= 2022;
    }

    public static boolean mesCorrecto(int mes) {
        return mes >= 1 && mes <= 12;
    }

    public static boolean tiene31Dias(int mes) {
        return mes == 1 && mes == 3 && mes == 5 && mes == 7 && mes == 8 && mes == 10 && mes == 12;
    }

    public static boolean diaCorrecto(int dia) {
        return dia >= 1 && dia <= 31;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dia = 0;
        int mes = 0;
        int anio = 0;
        boolean diaYMesCorrecto = false;
        boolean anioBisiesto = false;
        /**
         * Verificar Dia
         */
        do {
            System.out.println("Introduce el dia: ");
            dia = sc.nextInt();
            if (!diaCorrecto(dia)) {
                System.err.println("El dia no es correcto. Introduce uno nuevo: ");
            }
        } while (!diaCorrecto(dia));
        /**
         * Verificar Mes
         */
        do {
            System.out.println("Introduce el mes: ");
            mes = sc.nextInt();
            if (!mesCorrecto(mes)) {
                System.err.println("El mes no es correcto, prueba a introducir otro numero: ");
            }
        } while ((!mesCorrecto(mes)));
        /**
         * Verificar año
         */
        do {
            System.out.println("Introduce el año: ");
            anio = sc.nextInt();
            if (!anioCorrecto(anio)) {
                System.err.println("El año es incorrecto, introduce uno nuevo: ");
            }
        } while (!anioCorrecto(anio));
        /**
         * Comprobaciones:
         */
        if (esBisiesto(anio) && mes == 2 && dia <= 29) {
            anioBisiesto = true;
        } else if (esBisiesto(anio) && mes == 2 && dia >= 28) {
            anioBisiesto = false;
        } else if (tiene31Dias(mes) && dia <= 31) {
            diaYMesCorrecto = true;
        } else if (!tiene31Dias(mes) && dia <= 30) {
            diaYMesCorrecto = true;
        }
        /**
         * Output
         */
        if (anioBisiesto) {
            System.out.println("La fecha es correcta, es un año bisiesto.");
            System.exit(0);
        } else if (diaYMesCorrecto) {
            System.out.println("La fecha es correcta.");
            System.exit(0);
        } else if (!anioBisiesto || !diaYMesCorrecto) {
            System.err.println("La fecha es incorrecta.");
            System.exit(1);
        }
        System.out.println("El programa ha terminado.");
        sc.close();
        System.exit(0);
    }
}