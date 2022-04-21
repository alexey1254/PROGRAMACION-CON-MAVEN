package es.alejandro.programacion.ejercicio05;

import java.util.ArrayList;

public class CartasAPP extends Carta {
    protected ArrayList<Carta> carta = new ArrayList<Carta>();
    protected int puntos;

    public CartasAPP() {
        cartasAleatorias();
        addPuntos();
    }

    /**
     * CartasAPP
     * Crea un arraylist con las cartas aleatorias
     */
    protected void cartasAleatorias() {
        Carta cartaAuxiliar = new Carta();
        carta.add(cartaAuxiliar);

        for (int i = 0; i < 4; i++) {
            do {
                cartaAuxiliar = new Carta();
            } while (this.carta.contains(cartaAuxiliar));

            carta.add(cartaAuxiliar);
        }
        int i = 1;
    }

    public ArrayList<Carta> verCartas() {
        return this.carta;
    }

    /**
     * CartasAPP
     * Inicializa los puntos de las cartas, siendo estos los correspondientes a cada
     * carta y los cuenta todos.
     */
    protected void addPuntos() {
        for (Carta cartaAleatoria : this.carta) {
            String cartaStr = "" + cartaAleatoria;

            if (cartaStr.contains("as")) {
                this.puntos += 11;
            } else if (cartaStr.contains("tres")) {
                this.puntos += 10;
            } else if (cartaStr.contains("sota")) {
                this.puntos += 2;
            } else if (cartaStr.contains("caballo")) {
                this.puntos += 3;
            } else if (cartaStr.contains("rey")) {
                this.puntos += 4;
            }
        }
    }

    /**
     * CartasAPP
     * 
     * @return Puntos totales de la partida
     */
    public int getPuntos() {
        return this.puntos;
    }
}
