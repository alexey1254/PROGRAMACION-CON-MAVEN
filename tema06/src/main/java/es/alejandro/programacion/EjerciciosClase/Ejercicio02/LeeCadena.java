package es.alejandro.programacion.EjerciciosClase.Ejercicio02;

import java.util.ArrayList;
import java.util.List;

public class LeeCadena {
    public static List<Character> leeCadena(String cadena) throws Exception {

        if (cadena.equals("")) {
            throw new Exception("La cadena esta vacia.");
        }

        List<Character> lista = new ArrayList<>();
        for (int i = 0; i < cadena.length(); i++) {
            lista.add(cadena.charAt(i));
        }
        return lista;
    }

}
