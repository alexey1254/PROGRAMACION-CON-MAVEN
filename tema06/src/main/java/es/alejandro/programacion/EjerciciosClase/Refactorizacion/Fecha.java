package es.alejandro.programacion.EjerciciosClase.Refactorizacion;

public class Fecha {

    private static int diasMeses[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
    private int dia;
    private int mes;
    private int anio;

    /**
     * Constructor
     * 
     * @param dia
     * @param mes
     * @param anio
     */
    public Fecha(int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }

    @Override
    public String toString() {
        return String.format("Dia: %s, Mes: %s, Año: %s", this.dia, this.mes, this.anio);
    }

    /**
     * 
     * @return Los dias que trae el mes
     */
    private int diasMes() {
        return Fecha.diasMeses[mes - 1];
    }

    /**
     * Comprueba cuantos dias trae el mes de febrero en caso de que sea bisiesto en
     * el array se pone que trae 29 dias
     * 
     */
    private void diasBisiesto() {
        if ((this.anio % 400 == 0) || ((this.anio % 4 == 0) && (this.anio % 100 != 0))) {
            Fecha.diasMeses[1] = 29;
        }
    }

    /**
     * Comprueba que el rango de fecha sea correcto, en caso contrario los
     * inicializa a 0
     * 
     * @return True si son validos
     */
    public boolean valida() {
        if (this.mes < 1 || this.mes > 12) {
            this.mes = 0;
            return false;
        }
        if (this.mes == 2) {
            diasBisiesto();
        }
        if (this.dia < 1 || this.dia > diasMes()) {
            this.dia = 0;
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Fecha f = new Fecha(29, 2, 2007);
        f.valida();

    }
}
