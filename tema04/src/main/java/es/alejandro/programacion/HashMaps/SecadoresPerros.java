package es.alejandro.programacion.HashMaps;

import java.util.*;
import java.io.*;


/**
 *
 * @author aleco
 */
public class SecadoresPerros {
    private static final String rutaWindows = "D:\\Proyectos\\PRO\\Tema04\\src\\tema04\\DatosEjercicios\\Tema04-HashMap.E02.DatosEmpresaSecadores.txt";
    private static int[] numVend, monVend;
    private static String[] nomVend;
    
    /**
     * Comprueba cuantas lineas hay en el archivo
     * @return Numero de lineas del archivo
     * @throws FileNotFoundException 
     */
    public static int cuantasLineasHay() throws FileNotFoundException {
        File archivo = new File(rutaWindows);
        Scanner lectura = new Scanner(archivo);
        int contadorLineas = 1;
        String linea = lectura.nextLine();
        while(lectura.hasNextLine()) {
            
            contadorLineas++;
            linea = lectura.nextLine();
        }
        lectura.close();
        return contadorLineas;
    }
    
    public static void leerDatos() throws FileNotFoundException {
        File archivo = new File(rutaWindows);
        Scanner linea = new Scanner(archivo);
        int posicion = 0;
        linea.nextLine();
        while(!linea.equals("-1")) {
            
            
            
            posicion++;
            linea.nextLine();
        }
        linea.close();
    }
    public static void main(String[] args) throws FileNotFoundException {
        cuantasLineasHay();
    }
}
