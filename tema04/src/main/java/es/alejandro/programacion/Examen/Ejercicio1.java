package es.alejandro.programacion.Examen;
/**
 * @author Alejandro Marrero
 */

public class Ejercicio1 {
    /**
     * Se le pasa una cadena y la devuelve al revés COMO STRING
     * @param cadena
     * @return Cadena al revés
     */
private static String invertirCadena(String cadena) {
        StringBuilder strb = new StringBuilder(cadena);
        String invertida = strb.reverse().toString();
        return invertida;
    }


    /**
     * Devuelve la cadena invertida a un array de caracteres
     * @param cadena De tipo String 
     * @return la cadena pasada a un array de char
     */
    public static char[] cadenaInvertidaEnCaracteres(String cadena) {
        cadena = invertirCadena(cadena);
        char[] arrayChar = new char[cadena.length()];
        for (int i = 0; i < cadena.length(); i++) {
            arrayChar[i] = cadena.charAt(i);
        }
        return arrayChar;
    }
    /**
     * Metodo main
     * @param args Args por si se ejecuta en consola
     */
    public static void main(String[] args) {
        String cadena = "abc";
        System.out.println(cadenaInvertidaEnCaracteres(cadena));

    }
}
