package es.alejandro.programacion.EjerciciosClase;

import java.util.Set;
import java.util.TreeSet;

public class Loteria {
    private Set <Integer>numerosPrimitiva;

    /**
     * Constructor
     */
    public Loteria() {
        numerosPrimitiva = new TreeSet<>();
    }
    /**
     * Añade los numeros a numerosPrimitiva
     */
    protected void addNumeros() {
        while(numerosPrimitiva.size() < 6) {
            numerosPrimitiva.add((int)(49*Math.random()+1));
        }
    }

    /**
     * Elimina todos los numeros
     */
    protected void deleteNumeros() {
        numerosPrimitiva.clear();
    }

    @Override
    public String toString() {
        return numerosPrimitiva.toString();
    }
    public static void main(String[] args) {
        Loteria l = new Loteria();
        l.addNumeros();
        System.out.println(l);
    }
}
