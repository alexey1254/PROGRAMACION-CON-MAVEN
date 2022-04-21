package es.alejandro.programacion.Arrays;



import java.util.Scanner;
import java.io.*;

public class Temperaturas {
    private int[][] datos = new int [12][];
    String[] meses={"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"};
    private String path = "D:\\Proyectos\\PRO\\Tema04\\src\\tema04\\DatosEjercicios\\Tema04-ExtraArrays.E05.DatosTemperaturas.txt";
    public Temperaturas(String ruta) {
        this.path=ruta;
    }
    /**
     * 
     * @throws FileNotFoundException 
     */
    public void leerDatos() throws FileNotFoundException {
        Scanner fDatos = new Scanner(new File(path));
        String linea;
        String[] datosMesStr;
        int mes = 0;
        while(fDatos.hasNextLine()) {
            linea =  fDatos.nextLine();
            datosMesStr = linea.split(" ");
            datos[mes] = new int[datosMesStr.length];
            for (int dia = 0; dia < datos[mes].length; dia++) {
                datos[mes][dia] = Integer.parseInt(datosMesStr[dia]);
            }
            mes++;
        }
    }
    
    /**
         * Recibe el numero del mes y devuelve la media temperaturas de ese mes
         * @param numMes
         * @return La media de temperatura del mes pasado
         */
        public double temperaturaMedia(int numMes) {
            double suma = 0;
            for (int dia = 0; dia < datos[numMes].length; dia++) {
                suma += datos[numMes][dia];
            }
            return suma/datos[numMes].length;
        }
        
        /**
         * Imprime la temperatura media de cada mes
         */
        public void imprimeMedias() {
            
            for (int mes = 0; mes < datos.length; mes++) {
                System.out.printf("La media del mes de %s es %.2f\n",meses[mes],this.temperaturaMedia(mes));
            }
        }
        /**
         * Devuelve el numero Maximo de un array pasandole un mes
         * @param array
         * @param mes
         * @return 
         */
        public static int numMaximoV2(int[][] array, int mes) {
        int numMaximo = array[mes][0];
            for (int j = 0; j < array[mes].length; j++) {
                if (array[mes][j] > numMaximo) {
                    numMaximo = array[mes][j];
                }
        }
        return numMaximo;
    }
        /**
         * Devuelve el numero Minimo de un array pasandole un mes
         * @param array
         * @param mes
         * @return 
         */
        public static int numMinimoV2(int[][] array, int mes) {
        int numMinimo = array[mes][0];
            for (int j = 0; j < array[mes].length; j++) {
                if (array[mes][j] < numMinimo) {
                    numMinimo = array[mes][j];
                }
        }
        return numMinimo;
    }
        
        /**
         * Imprime el dia mas caluroso y frio de cada mes
         */
        public void diaCalurosoYFrio() {
            int diaCaluroso = 0, diaFrio = 0;
            int mes = 0;
            for (; mes < datos.length; mes++) {
                diaCaluroso = numMaximoV2(datos, mes);
                diaFrio = numMinimoV2(datos, mes);
                System.out.println("-------------------------------------------------");
                System.out.println("El dia mas caluroso del mes " + meses[mes] + " es: " + diaCaluroso);
                System.out.println("El dia mas frio del mes " +meses[mes] + " es: " + diaFrio);
            }
            System.out.println("-------------------------------------------------");
            
            
            
        }
        
    public static void main(String[] args) throws FileNotFoundException {
        Temperaturas a2019=new Temperaturas("/media/daw/Vbox&others/Proyectos/PRO/Tema04/src/tema04/DatosEjercicios/Tema04-ExtraArrays.E05.DatosTemperaturas.txt");
        a2019.leerDatos();
        //a2019.imprimeMedias();
        a2019.diaCalurosoYFrio();
    }
}

