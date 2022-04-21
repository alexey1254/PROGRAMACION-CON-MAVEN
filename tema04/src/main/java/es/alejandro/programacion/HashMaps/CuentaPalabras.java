package es.alejandro.programacion.HashMaps;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public class CuentaPalabras {
    private static final String RutaWindows ="D:\\Proyectos\\PRO\\Tema04\\src\\tema04\\DatosEjercicios\\Tema04-HashMap.E01.txt";
    private static final String RutaLinux ="/media/daw/Vbox&others/Proyectos/PRO/Tema04/src/tema04/DatosEjercicios/Tema04-HashMap.E01.txt";
    
    /**
     * Cuenta en un hashmap las palabras
     * @throws FileNotFoundException 
     * @return Un HashMap con las palabras contadas.
     */
    public static HashMap<String,Integer> Contar() throws FileNotFoundException {
        HashMap<String,Integer> palabras = new HashMap<>();
        File archivo = new File(RutaLinux);
        Scanner scanner = new Scanner(archivo);
        String linea = scanner.nextLine();
        while(!linea.equals("-1")) {    // Pasar por cada linea
            String[] palabrasLinea = linea.split("[ ,.;\t]");
            for (int i = 0; i < palabrasLinea.length; i++) {    // Poner cada palabra en un array y en el hashmap
                if(palabras.get(palabrasLinea[i]) == null) {    // Comprobamos que no esta en el hashmap
                    palabras.put(palabrasLinea[i],1);           // Poner la palabra en donde corresponda dentro del hashmap
                } else {                                        // Sabemos que está en el hashmap por el if de antes
                    palabras.put(palabrasLinea[i], palabras.get(palabrasLinea[i])+1);
                }
            }
            linea = scanner.nextLine();
        }
        palabras.remove("");
        return palabras;
    }
    
    /**
     * Main para pruebas
     * @param args
     * @throws FileNotFoundException 
     */
    public static void main(String[] args) throws FileNotFoundException { // Lo de ordenarlo dijo que no
        HashMap<String,Integer> a = Contar();
        System.out.println(a);


    }
}