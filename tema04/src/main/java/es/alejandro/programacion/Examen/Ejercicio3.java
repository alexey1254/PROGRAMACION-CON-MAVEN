package es.alejandro.programacion.Examen;

import java.io.*;
import java.util.*;

/**
 * @author Alejandro Marrero
 */
public class Ejercicio3 {
    private String ruta;
    private String medidas[][] = new String [20][];
    private String pais[] = new String [20];
    private String medidasMejorado[][];
    private String paisMejorado[];
    private int numPaises = 0;

    /**
     * Constructor que inicializa la variable ruta
     * @param ruta del archivo a pasar
     */
    public Ejercicio3(String ruta) {
        this.ruta=ruta;
    }

    /**
     * Paso 1:
     * Medidas de 0 es españa, medidas de 1 es el siguiente pais, etc...
     * @throws FileNotFoundException
     */
    public void leerDatos() throws FileNotFoundException {
        File archivo = new File(this.ruta);
        Scanner scanner = new Scanner(archivo);
        String PaisesEInformacionToString[];

        
        while (scanner.hasNextLine()) {
            String linea = scanner.nextLine();
            PaisesEInformacionToString = linea.split(": ");
            this.medidas[numPaises] = PaisesEInformacionToString[1].split(" ");
            this.pais[numPaises] = PaisesEInformacionToString[0];
            numPaises++;
        }
        scanner.close();
    }
    /**
     * Paso 2:
     */
    private void crearBienLosArrays() {
        /**
         * Hacemos que nuestros arrays ocupen menos memoria
         * En este bucle iremos a por el pais
         */
        this.paisMejorado = new String [this.numPaises];
        for (int i = 0; i < this.paisMejorado.length; i++) {
            this.paisMejorado[i] = pais[i];
        }

        /**
         * En este otro bucle iremos a por las medidas
         */
        this.medidasMejorado = new String [this.paisMejorado.length][this.medidas[0].length];
        for (int i = 0; i < medidasMejorado.length; i++) {
            for (int j = 0; j < medidasMejorado[i].length; j++) {
                this.medidasMejorado[i][j] = this.medidas[i][j];
            }
        }
    }
    /**
     * Se imprimen los resultados
     */
    public void imprimirResultados() {
        /**
         * Primero imprimimos el encabezado:
         */
        System.out.print("Pais      ");
        for (int i = 0; i < medidasMejorado[0].length; i++) {
            System.out.printf("%d   ", i+1 );
        }
        System.out.println("");
        System.out.print("----     ");
        for (int i = 0; i < medidasMejorado[0].length; i++) {
            System.out.print(" ---");
        }

        /**
         * Imprimir pais:
         */
        System.out.println();
        for (int i = 0; i < paisMejorado.length; i++) {
            System.out.printf("%*s", paisMejorado[i]);
            for (int j = 0; j < medidasMejorado[i].length; j++) {
                System.out.printf(" %s", medidasMejorado[i][j]);
            }
            System.out.print(" |");
            System.out.println("");
        }


    }

    public static void main(String[] args) throws FileNotFoundException {
        Ejercicio3 p = new Ejercicio3("/home/daw/Escritorio/GitHub/PROGRAMACION/Tema04/src/tema04/Examen/DatosEjercicio3Examen2Eval.txt");
        p.leerDatos();
        p.crearBienLosArrays();
        p.imprimirResultados();
    }
}
