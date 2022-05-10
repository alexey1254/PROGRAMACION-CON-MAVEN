package es.alejandro.programacion.EjerciciosClase.Ejercicio03;

import java.util.ArrayList;
import java.util.List;

public class UneCadenas {

    public List<Character> uneCadenas(ArrayList<Character> cadena1, ArrayList<Character> cadena2) throws Exception {

        if (cadena1.size() == 0) {
            throw new Exception("La cadena 1 esta vacia");
        } else if (cadena2.size() == 0) {
            throw new Exception("La cadena 2 esta vacia");
        }

        ArrayList concatenacion = new ArrayList<>();
        concatenacion.addAll(cadena1);
        concatenacion.addAll(cadena2);
        return concatenacion;
    }
}
