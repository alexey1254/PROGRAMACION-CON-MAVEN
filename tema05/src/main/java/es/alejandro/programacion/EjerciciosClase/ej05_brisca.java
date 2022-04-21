package es.alejandro.programacion.EjerciciosClase;

import es.alejandro.programacion.ejercicio05.*;

public class ej05_brisca extends Carta { // ! Añade un metodo para ver los puntos
    

    protected Carta[] valorCartas = new Carta[4];

    public void valorCartas() {
        for (int i = 0; i < 4; i++) {
            //valorCartas[i] = CartaAleatoria();
        }
        // Indice AS = 0, Valor 11
        // Indice Tres = 1, Valor 10
        // Indice Sota = 2, Valor 2
        // Indice Caballo = 3, Valor 3
        // Indice Rey 4, Valor 4

    }

    public void verPuntos() {

    }

    public static void main(String[] args) {
        Carta[] secuenciaCartas = new Carta[5];
        int contadorCartas = 0;
        Carta c;
        while (contadorCartas < 5) {
            //c = Carta.CartaAleatoria();
            /* if (!CartasAPP.CartaRepetida(secuenciaCartas, c, contadorCartas)) {
                secuenciaCartas[contadorCartas] = c;
                contadorCartas++;
            } */
        }

        //CartasAPP.ImprimeCartas(secuenciaCartas);
    }

}
