package es.alejandro.programacion.EjerciciosClase.Ejercicio05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Obligamos a que la clase parametizada implemente Comparable
 */
public class MetodoGenerico<T extends Comparable> {
    /**
     * Elimina las repeticiones de una lista
     * @param lista
     * @return List<T> Con las repeticiones eliminadas
     */
    public List<T> eliminarRepeticiones(List<T>lista) {
        int aux = 1;
        for(int i=0;i<lista.size();i++) {
            for(int j = aux; j<lista.size();j++) {
                if(lista.get(i).compareTo(lista.get(j))==0) {
                    lista.remove(j);
                    j--;
                }
            }
            aux++;
        }
        return lista;
    }

    public List<T> mezcla(List<T>l1, List<T>l2) {
        int i, j;
        List<T>res=new ArrayList<>();
        for(i=j=0;i<l1.size()&& j< l2.size();) {
            if(l1.get(i).compareTo(l2.get(j))<0) {
                
            }
        }
        return res;
    }

    public static void main(String[] args) {
        MetodoGenerico<String> e=new MetodoGenerico<>();
        List<String> l=new ArrayList<>(Arrays.asList("Hola","Mundo", "Hola"));
        e.eliminarRepeticiones(l);
        System.out.println(l);
    }

}
