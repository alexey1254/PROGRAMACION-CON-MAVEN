package es.alejandro.programacion.ejercicio05;



public class Carta {
    private static String[] numeros = { "as", "dos", "tres", "cuatro", "cinco", "seis", "siete", "sota", "caballo",
            "rey" };
    private static String[] palos = { "bastos", "copas", "espadas", "oros" };
    protected String numeroCarta;
    protected String paloCarta;

    /**
     * Carta
     * Constructor
     */
    public Carta() {
        this.numeroCarta = numeros[(int) (Math.random() * 10)];
        this.paloCarta = palos[(int) (Math.random() * 4)];
    }

    /**
     * Carta
     * 
     * @return numero de la carta
     */
    public String getNumero() {
        return numeroCarta;
    }

    /**
     * Carta
     * 
     * @return palo de la carta
     */
    public String getPalo() {
        return paloCarta;
    }

    @Override
    public boolean equals(Object obj) {
        Carta c = (Carta)obj;
        return this.numeroCarta == c.numeroCarta && this.paloCarta == c.paloCarta;
    }
    /**
     * Carta
     * ToString
     */
    @Override
    public String toString() {
        return String.format("%s de %s.", this.numeroCarta, this.paloCarta);
    }
}
