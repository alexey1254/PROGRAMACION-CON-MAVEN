
package es.alejandro.programacion.Arrays;
import java.util.*;

/**
 * Clase banco del ejercicio de Digitos de control (Extra Arrays).
 * @author aleco
 */
public class Banco {
    private static final int[] valoresPrimerDigito = {4,8,5,10,9,7,3,6};
    private static final int[] valoresSegundoDigito = {1,2,4,8,5,10,9,7,3,6};
    
    
    /**
     * Comprueba si la longitud de banco y oficina es 4 y de numCuenta es 10
     * @param banco
     * @param oficina
     * @param numCuenta
     * @return True o False
     */
    private static boolean todoBien(int banco[], int oficina[], int numCuenta[]) {
        return banco.length == 4 && oficina.length == 4 && numCuenta.length == 10;
    }
    
    /**
     * Metodo que calcula los digitos de control de un IBAN
     * La longitud de banco y oficina debe ser de cuatro y el numCuenta de 10
     * @param banco
     * @param oficina
     * @param numCuenta
     * @return Un array con los digitos de control
     */
    
    public static int[] digitosControl(int banco[], int oficina[], int numCuenta[]) throws Exception {
        int digitosControl[] = new int [2];
        int i = 1;
        // Comprobar que los length de los arrays es correcto (Error 01).
        if (!todoBien(banco,oficina,numCuenta)) {
            throw new Exception("Error en los parametros pasados. No son compatibles Error 01");
        }
        // Primer digito control
        int primeraSuma = 0;
        for (int j = 0; j < banco.length; i++,j++) { // Bucle del banco
            primeraSuma += valoresPrimerDigito[i-1] * banco[j];
        }
        for (int j = 0; j < oficina.length; j++,i++) {
            primeraSuma += valoresPrimerDigito[i-1] * oficina[j];
        }
        // Comprobar cual es el primer digito de control.
        switch (11 - (primeraSuma % 11)) {
            case 10:
                digitosControl[0] = 1;
                break;
            case 11:
                digitosControl[0] = 0;
                break;
            default:
                digitosControl[0] = 11 - (primeraSuma % 11);
                break;
        }
        
        // Segundo digito control
        int segundaSuma = 0;
        i = 1;
        for (int j = 0; j < numCuenta.length; j++, i++) {
            segundaSuma += valoresSegundoDigito[i-1] * numCuenta[j];
        }
        // Comprobar cual es el segundo digito de control.
        switch (11 - (segundaSuma % 11)) {
            case 10:
                digitosControl[1] = 1;
                break;
            case 11:
                digitosControl[1] = 0;
                break;
            default:
                digitosControl[1] = 11 - (segundaSuma % 11);
                break;
        }
        return digitosControl;
    }
    /**
     * Metodo main para pruebas
     * @param args 
     */
    public static void main(String[] args) throws Exception {
        int[] banco = {1,4,3,2};
        int[] oficina = {0,1,5,4};
        int[] numCuenta = {7,4,2,2,5,0,4,5,5,1};
        int a[] = digitosControl(banco, oficina, numCuenta);
        System.out.println(Arrays.toString(a));
        
    }
}
