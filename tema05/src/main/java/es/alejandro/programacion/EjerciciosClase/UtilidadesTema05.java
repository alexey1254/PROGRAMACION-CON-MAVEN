
package es.alejandro.programacion.EjerciciosClase;

/**
 *
 * @author daw
 */
public class UtilidadesTema05 {
    
    private UtilidadesTema05() {
        
    }
    /**
     * Minimo comun multiplo
     * @param a
     * @param b
     * @return 
     */
    public static int mcd(int a, int b) {
        int resto;
        while(b > 0) {
            resto = a % b;
            a = b;
            b = resto;
        }
        return a;
    }
    
    /**
     * 
     * @param a
     * @param b
     * @return 
     */
    public static int mcm(int a, int b) {
        return a * b / mcd(a,b);
    }
    
    
}
