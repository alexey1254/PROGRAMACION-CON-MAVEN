package es.alejandro.programacion.EjerciciosClase;

/**
 *
 * @author daw
 */
public class Fraccion {
    private int numerador, denominador;
    
    /**
     * Constructor de la clase
     * @param numerador Es el numerador de la fraccion
     * @param denominador Es el denominador de la fraccion
     */
    public Fraccion(int numerador, int denominador) {
        this.numerador=numerador;
        this.denominador=denominador;
    }
    
    /**
     * Constructor para hacer copias
     * @param q Objeto de la clase Fraccion a copiar
     */
    public Fraccion(Fraccion q) {
        this.numerador=q.numerador;
        this.denominador=q.denominador;
    }
    
    /**
     * Divide dos fracciones
     * @param q Fraccion pasada
     * @return Un nuevo objeto de Fraccion
     */
    public Fraccion division(Fraccion q) {
        return new Fraccion(this.numerador * q.denominador, this.denominador * q.numerador);
    }
    
    /**
     * Metodo que devuelve un numero que es el valor real de la fraccion
     * @return El valor real de la fraccion
     */
    public double getValorReal() {
        return (double) this.numerador / this.denominador;
    }
    
    /**
     * Metodo que devuelve una fraccion a la inversa
     * @return Un nuevo objeto Fraccion a la inversa
     */
    public Fraccion inverso() {
        return new Fraccion(this.denominador, this.numerador);
    }
    
    /**
     * Metodo que cambia el signo de la fraccion por ejemplo de + a -
     * @return El opuesto de la fraccion
     */
    public Fraccion opuesto() {
        return new Fraccion(-this.numerador, -this.denominador);
    }
    
    /**
     * Multiplica dos fracciones
     * @param q Objeto de Fraccion a pasar
     * @return El producto de dos fracciones
     */
    public Fraccion producto(Fraccion q) {
        return new Fraccion(this.numerador * q.numerador, this.denominador * q.denominador);
    }
    
    /**
     * Reduce la fraccion con el m.c.m
     * @return Un objeto de Fraccion
     */
    public Fraccion reduce() {
        int m = UtilidadesTema05.mcd(this.numerador, this.denominador);
        return new Fraccion(this.numerador / m, this.denominador / m);
    }
    
    /**
     * Resta dos fracciones
     * @param q Objeto fraccion a pasar
     * @return Un nuevo objeto con la resta de la fraccion
     */
    public Fraccion resta(Fraccion q) {
        if(this.denominador == q.denominador) {
            return new Fraccion(this.numerador - q.numerador, this.denominador - q.denominador);
        }
        int m = UtilidadesTema05.mcm(this.denominador, q.denominador);
        return new Fraccion(this.numerador * m /this.denominador - q.numerador* m / this.denominador, m);
    }
    
    /**
     * Suma dos fracciones
     * @param q Objeto Fraccion a pasar
     * @return Un objeto con la suma de dos fracciones
     */
    public Fraccion suma(Fraccion q) {
        if(this.denominador == q.denominador) {
            return new Fraccion(this.numerador + q.numerador, this.denominador + q.denominador);
        }
        int m = UtilidadesTema05.mcm(this.denominador, q.denominador);
        return new Fraccion(this.numerador * m /this.denominador + q.numerador* m / this.denominador, m);
        
    }

    @Override
    public String toString() {        
        return String.format("%d/%d", this.numerador,this.denominador);
    }
    
}
