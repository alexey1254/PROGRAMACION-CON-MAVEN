package es.alejandro.programacion.AgoritmosOrdenacion;

/**
 * Como su nombre indica, esta clase sirve para buscar un numero 
 * en arrays ordenados
 * @author aleco
 */
public class BusquedaArraysOrdenados {

    /**
     * Recibe un array ordenado y devuelve el indice del numero pasado en el array
     * @param ordenado Array ordenado
     * @param numeroABuscar Numero que se quiere buscar dentro del array
     * @return Indice del numero pasado en el array
     */
    public static int busquedaBin(int[] ordenado, int numeroABuscar) {
        int posInf = 0, posSup = ordenado.length - 1, centro;
        while (posInf <= posSup) {          // Se ejecuta mientras que la posInf sea menor o igual que la posSup
            centro = (posSup + posInf) / 2;
            if (numeroABuscar == ordenado[centro]) {
                return centro;
            } else if (numeroABuscar < ordenado[centro]) {
                posSup = centro - 1;
            } else {
                posInf = centro + 1;
            }
        }
        return -1; // No ha encontrado el numero
    }
    public static void main(String[] args) {
        int b[] = {1,2,3,4,5,6,7,8,9,100,200,250};
        int indice = busquedaBin(b, 9);
        System.out.println(indice);
    }
}
