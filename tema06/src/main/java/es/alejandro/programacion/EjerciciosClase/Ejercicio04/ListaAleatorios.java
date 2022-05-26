package es.alejandro.programacion.EjerciciosClase.Ejercicio04;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class ListaAleatorios {

    public static void main(String[] args) {
        Set<Integer> numeros = new TreeSet<>(Collections.reverseOrder());
        while (numeros.size() < 6) {
            // numeros.add((int)48*Math.random() +1);
        }
    }
}
