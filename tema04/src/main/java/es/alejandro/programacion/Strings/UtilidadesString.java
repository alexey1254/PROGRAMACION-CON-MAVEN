package es.alejandro.programacion.Strings;
import java.lang.StringBuilder;
/**
 *
 * @author aleco
 */
public class UtilidadesString {

    private UtilidadesString() {

    }

    /**
     * Cuenta las repeticiones de un caracter
     *
     * @param caracter Letra que quieres saber las repeticiones
     * @param cadena Cadena de texto donde quieres que se sepan las repeticiones
     * @return El numero de veces que aparece un caracter en una cadena de texto
     */
    public static int cuentaRepeticiones(char caracter, String cadena) {
        int repeticiones = 0;
        for (int i = 0; i < cadena.length(); i++) {
            if (caracter == cadena.charAt(i)) {
                repeticiones++;
            }
        }
        return repeticiones;
    }

    /**
     * Se le pasa un String y se devuelve sin espacios
     *
     * @param cadena Cadena a la que quieras quitarle los espacios
     * @return cadena sin espacios
     */
    public static String quitaEspacios(String cadena) {
        return cadena.replace(" ", "");
    }

    /**
     * Se le pasa una cadena y la devuelve al revés
     *
     * @param cadena
     * @return Cadena al revés
     */
    public static String invertir(String cadena) {
        StringBuilder strb = new StringBuilder(cadena);
        String invertida = strb.reverse().toString();
        return invertida;
    }

    /**
     * Verifica si una palabra es palindromo
     * 
     * @param cadena
     * @return True si es una palabra palindroma
     */
    public static boolean palindromo(String cadena) {
        String invertido = UtilidadesString.invertir(cadena);
        return cadena.equals(invertido);

    }

    /**
     * Recibe un string y devuelve ese string en mayusculas
     *
     * @param cadena
     * @return el string pasado en mayusculas
     */
    public static String toUpper(String cadena) {
        return cadena.toUpperCase();
    }

    /**
     * Recibe un string y lo convierte a minusculas todo
     *
     * @param cadena
     * @return Lo que has pasado en minusculas
     */
    public static String toLower(String cadena) {
        return cadena.toLowerCase();
    }

    /**
     *
     * @return La tabla ascii de la 0-9 a-z A-Z
     */
    public static String ascii() {
        // Numeros
        int numeros = 48;
        String tablaAscii = "+----------+\n";
        for (int i = numeros; i <= 57; i++) {
            String charConvertido = Character.toString(i);
            tablaAscii += "| " + i + " => " + charConvertido + "  |\n";
        }
        tablaAscii += "+----------+\n";
        // a - z
        int minusculas = 97;
        for (int i = minusculas; i <= 122; i++) {
            String charConvertido = Character.toString(i);
            if (i >= 100) {
                tablaAscii += "| " + i + " => " + charConvertido + " |\n";
                continue;
            }
            tablaAscii += "| " + i + " => " + charConvertido + "  |\n";
        }
        tablaAscii += "+----------+\n";
        // Mayusculas 
        int mayusculas = 65;
        for (int i = mayusculas; i <= 90; i++) {
            String charConvertido = Character.toString(i);
            tablaAscii += "| " + i + " => " + charConvertido + "  |\n";
        }
        tablaAscii += "+----------+\n";
        return tablaAscii;
    }

    public static void main(String[] args) {
        String p = "reconocer";
        System.out.println(palindromo(p));
    }
}
