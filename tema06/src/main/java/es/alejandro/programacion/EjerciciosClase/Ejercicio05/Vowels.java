package es.alejandro.programacion.EjerciciosClase.Ejercicio05;

public class Vowels {

    public static int getCount(String str) {
        return str.replaceAll("(?i)[^aeiou]", "").length();
    }

    public static void main(String[] args) {
        System.out.println(getCount("Pepe"));
    }
}
