package es.alejandro.programacion.Arrays;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;

/**
 * @author Alex
 * 
 */

public class FabricaCoches {
    
    private static final int numModelos = 4;
    private static final int numPtosVenta = 4;
    private static int[][] ventas = new int[numModelos][numPtosVenta];
    private static double[] preciosModelo = {1.5,1.75,2.42, 2.6};

    /**
     * Lee los datos del fichero txt Datos ventas coches
     * @throws FileNotFoundException
     */
    public static void leerDatos() throws FileNotFoundException {
        
        String rutaLinux = "/media/daw/Vbox&others/Proyectos/PRO/ProgramacionANT/src/Tema04/DatosEjercicios/Tema04-ExtraArrays.E01.DatosVentasCoches.txt"; // Ruta del fichero
        File fichero = new File(rutaLinux); // Leer el fichero
        Scanner fDatos = new Scanner(fichero); // Pasar el fichero a Scanner
        String linea="";
        int modelo, centro;
        String datos[];
        /**
         * ATENCION: Linea esta puesto antes de empezar el bucle y al final porque
         * al principio, al leer la linea va a comparar el while y comprobar que la comparacion
         * no es cierta y al final para que el while pueda compararlo con una nueva linea.
         */
        linea = fDatos.nextLine(); // Una vez pasado el fichero a Scanner, lo leemos por lineas con .nextLine()
        while(!linea.equals("-1")) { // Bucle para leer las lineas del fichero
            datos = linea.split(" ");
            modelo = Integer.parseInt(datos[0]);
            centro = Integer.parseInt(datos[1]);
            ventas[modelo][centro]++;
            linea = fDatos.nextLine(); // Leer la siguiente linea del fichero
        }
        fDatos.close();
    }
    
    /**
     * Sumar lo que se ha vendido de un modelo
     * @param modelo
     * @return La suma de lo que se ha vendido de un modelo
     */
    public static int SumaModelo(int modelo) {
        int suma = 0;
        for (int pVenta = 0; pVenta < ventas[modelo].length; pVenta++) {
            suma += ventas[modelo][pVenta];
        }
        return suma;
    }
    
    /**
     * Calcula el volumen total de ventas
     */
    public static void volumenVentasTotal() {
        int unidades = 0;
        double precioTotal = 0;
        for (int modelo = 0; modelo < ventas.length; modelo++) {
            unidades += SumaModelo(modelo);
            precioTotal += SumaModelo(modelo) + preciosModelo[modelo];
        }
        System.out.printf("Total vehiculos vendidos: %d \n",unidades);
        System.out.printf("Total pesetas: %.2f\n",precioTotal);
    }
    
    /**
     * Calcula el volumen de ventas por centro
     */
    public static void volumenVentasPorCentro(boolean calculaPrecio) {
        for (int pVenta = 0; pVenta < ventas[0].length; pVenta++) {
            double volumenCentro = 0;
            for (int modelo = 0; modelo < ventas.length; modelo++) {
                if(calculaPrecio) {
                    volumenCentro += preciosModelo[modelo] * ventas[modelo][pVenta];
                } else {
                    volumenCentro += ventas[modelo][pVenta];
                }
            }
            if (calculaPrecio) {
                System.out.printf("Volumen de ventas del punto de venta %d: %.2f."
                    + "\n",pVenta,volumenCentro);
            } else {
                System.out.printf("Porcentaje unidades por centro %d: %.2f\n",pVenta,volumenCentro);
            }
            
        }
    }
    
    public static void porcentajeUnidadesCentro() {
        
        
        
    }
    
    public static void main(String[] args) throws FileNotFoundException {
        leerDatos();
        //volumenVentasTotal();
        volumenVentasPorCentro(false);
        //porcentajeUnidadesCentro();
        //porcentajeUnidadesModeloCentro();
        
    }
}
