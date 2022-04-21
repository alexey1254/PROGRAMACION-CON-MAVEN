package es.alejandro.programacion.ejercicio07;

public class FichaDomino {
    private int ficha[] = new int[2];

    /**
     * Inicializa una ficha de dominó
     * 
     * @param izqda Numero que va a la izquierda
     * @param dcha  Numero que va a la derecha
     */
    public FichaDomino(int izqda, int dcha) {
        this.ficha[0] = izqda;
        this.ficha[1] = dcha;
    }

    /**
     * Voltea la ficha de domino
     * 
     */
    public FichaDomino voltea() {
        return new FichaDomino(this.ficha[1], this.ficha[0]);
    }

    /**
     * Revisa si las fichas encajan
     * 
     * @param objeto FichaDomino
     * @return True si encaja
     */
    public boolean encaja(FichaDomino objeto) {
        return this.ficha[0] == objeto.ficha[0] || this.ficha[0] == objeto.ficha[1] || this.ficha[1] == objeto.ficha[0]
                || this.ficha[1] == objeto.ficha[1];
    }

    @Override
    public String toString() {
        return String.format("[ %d | %d ]", this.ficha[0],this.ficha[1]).replace("0"," ");
    }

    public static void main(String[] args) {
        FichaDomino f1 = new FichaDomino(6, 1);
        FichaDomino f2 = new FichaDomino(0, 4);
        FichaDomino f3 = new FichaDomino(3, 3);
        FichaDomino f4 = new FichaDomino(0, 1);
        System.out.println(f1);
        System.out.println(f2);
        System.out.println(f3);
        System.out.println(f4);
        System.out.println(f2.voltea());
        System.out.println(f2.encaja(f4));
        System.out.println(f1.encaja(f4));
        System.out.println(f1.encaja(f3));
        System.out.println(f1.encaja(f2));
    }
}
