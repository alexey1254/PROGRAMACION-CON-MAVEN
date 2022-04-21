
package es.alejandro.programacion.Arrays;

import java.io.*;
import java.util.Scanner;
/**
 * 
 * @author daw
 */
public class Empresa {
    private String rutaCodTrabajador, rutaCatTrabajador;
    private int trabajadorYCategoria[][] = new int[100][1]; // El tamaño es 1 porque la categoria esta descrita dentro
    /*
    * Dentro de cada indice esta su categoria son 100 trabajadores. 
    * Al añadir un trabajador se le resta 1 a su id siendo en el array el trabajador 100 estando en la posicion 99
    */ 
    private double categoriasYPrecio[][] = new double[4][1]; //Cada categoria tiene su precio
    
    
    public Empresa() { //Constructor
        
    }
    
    /**
     * Inicializa el array categoriasYPrecio poniendole sus 
     * valores desde un archivo de texto.
     */
    public void preciosPorCategoria() throws FileNotFoundException {
        File ruta = new File("D:\\Proyectos\\PRO\\Tema04\\src\\tema04\\DatosEjercicios\\Tema04-ExtraArrays.E07.DatosEmpresaPrecioHorasExtraCategorias.txt");
        Scanner archivo = new Scanner (ruta);
        String linea = archivo.nextLine();
        while (!archivo.equals("-1")) {            
            String[] datosSueltos = linea.split(" ");
            linea = archivo.nextLine();
            for (int i = 0; i < categoriasYPrecio.length; i++) {
                for (int j = 0; j < datosSueltos.length; j++) {
                    
                }
            }
        }
        
    }
    /**
     * Hacer un array de 2 dimensiones donde cada posicion contiene 
     * el numero de horas extra trabajadas por cada uno cada 
     * dia del mes
     */
    public void numeroHorasExtra() {
        
    }
    
    
    
    
    public static void main(String args[]) throws FileNotFoundException {
        Empresa e = new Empresa();
        e.preciosPorCategoria();
    }
}
