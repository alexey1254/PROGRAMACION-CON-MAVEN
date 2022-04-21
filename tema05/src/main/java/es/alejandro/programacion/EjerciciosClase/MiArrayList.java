package es.alejandro.programacion.EjerciciosClase;

import java.util.Arrays;

public class MiArrayList {
    private int items[];
    private int maxCapacity;
    private int numElementos;

    /**
     * Constructor donde se le pasan parametros
     * 
     * @param max Capacidad maxima del array
     */
    public MiArrayList(int max) {
        this.maxCapacity = max;
        items = new int[maxCapacity];
        this.numElementos = 0;
    }

    /**
     * @param item que se quiere añadir al array
     * @return True si se ha añadido, false si no
     */
    public boolean add(int item) {
        if (numElementos < maxCapacity) {
            items[numElementos] = item;
            this.numElementos++;
            return true;
        } else {
            return false;
        }
    }

    /**
     * Elimina todos los elementos de la lista.
     */
    public void clear() {
        this.numElementos = 0;
    }

    public int get(int pos) throws Exception {
        if (posValida(pos)) {
            return this.items[pos];
        } else {
            throw new Exception("MiArrayList.get posicion no valida");
        }
    }

    /**
     * Metodo que comprueba la posicion
     * 
     * @param p Posicion
     * @return Si la posicion es valida
     */
    private boolean posValida(int p) {
        return p >= 0 && p < this.numElementos;
    }

    /**
     * Devuelve la primera ocurrencia de un elemento en la lista o -1 si no se
     * encuentra
     * 
     * @param item de la lista a buscar
     * @return Indice de la lista
     */
    public int indexOf(int item) {
        for (int i = 0; i < numElementos; i++) {
            if (item == items[i]) {
                return i;
            }
        }
        return -1;
    }

    public boolean isEmpty() {
        return this.numElementos == 0;
    }

    /**
     * ! Hacer que se pasen una posicion a la izquierda los elementos a la
     * ! derecha dentro del array item
     * Si se borra el parametro se devuelve true
     * 
     * @param pos Posicion del elemento a borrar
     * @return True si se borra, false si no se borra
     */
    public boolean remove(int pos) {
        for (int i = 0; i < numElementos; i++) {
            // ! Hay que rellenar
        }

        return false;
    }

    /**
     * Cambia el valor de la posicion que se le indique solo si el numero de
     * elementos es menor o igual a la posicion que se le pasa
     * 
     * @param pos Posicion
     * @param val Valor
     * @return True si ha funcionado, false si no
     */
    public boolean set(int pos, int val) {
        if (numElementos <= pos) {
            items[pos] = val;
            return true;
        } else {
            return false;
        }
    }

    /**
     * Devuelve el numero de elementos almacenados
     * 
     * @return El numero de elementos almacenados
     */
    public int size() {
        return this.numElementos;
    }

    /**
     * Metodo helper del metodo burbuja
     * 
     * @param v Vector
     * @param i Indice
     * @param j Indice + 1
     */
    private static void swap(int[] v, int i, int j) {
        int aux = v[i];
        v[i] = v[j];
        v[j] = aux;
    }

    /**
     * Metodo helper que ordena de menor a mayor
     * 
     * @param vector Array de enteros
     */
    private static void burbuja(int[] vector) {
        int i, j;
        for (i = 0; i < vector.length - 1; i++) {
            for (j = 0; j < vector.length - i - 1; j++) {
                if (vector[j] > vector[j + 1]) {
                    swap(vector, j, j + 1);
                }
            }
        }
    }

    /**
     * Ordena el array
     * 
     * @return Un objeto de MiArrayList ordenado de menor a mayor
     */

    public MiArrayList sort() {
        MiArrayList ordenado = new MiArrayList(this.maxCapacity);
        for (int i = 0; i < this.numElementos; i++) {

        }

        return ordenado;
    }

    /**
     * Un array de numeros enteros con los atributos que estan almacenados en el
     * array items de un length de numElementos
     * 
     * @return Convierte lo que tenemos a un array de enteros
     */
    public int[] toArray() {
        int[] array = new int[numElementos];
        for (int i = 0; i < array.length; i++) {
            array[i] = items[i];
        }
        return array;
    }

    /**
     * 
     * @return Elimina el ultimo elemento y lo imprime
     * @throws Exception Si no hay elementos
     */
    public int pop() throws Exception {
        int aux = 0;
        if (!this.isEmpty()) {
            aux = this.items[this.numElementos - 1];
            this.items[this.numElementos - 1] = 0;
            this.numElementos--;
            return aux;
        } else {
            throw new Exception("MiArrayList.pop No hay un ultimo elemento.");
        }
    }

    @Override
    public String toString() {
        return Arrays.toString(items);
    }

    public static void main(String[] args) throws Exception {
        MiArrayList p = new MiArrayList(5);
        p.add(5);
        p.add(3);
        p.add(4);
        p.add(1);
        p.add(40);
        p.sort();
    }
}