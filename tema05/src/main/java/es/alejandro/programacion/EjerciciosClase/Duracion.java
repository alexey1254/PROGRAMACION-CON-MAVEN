package es.alejandro.programacion.EjerciciosClase;

/**
 * Clase duracion
 * @author Alejandro Marrero
 */
public class Duracion {
    private int horas, minutos, segundos;



    /**
     * Constructor con parametros
     * @param horas del dia
     * @param minutos del dia
     * @param segundos del dia
     */
    public Duracion(int horas, int minutos, int segundos) {
        this.horas = horas;
        this.minutos = minutos;
        this.segundos = segundos;
    }

    /**
     * Constructor sin parametros 
     */
    public Duracion() {
    }

    /**
     * Metodo de horas y minutos a segundos
     * @return Segundos
     */
    public int seg() {
        return this.horas *3600 + this.minutos * 60 + this.segundos;
    }

    /**
     * Pasar de segundos a horas
     * @param segundos Segundos
     * @return Horas que serian los segundos pasados
     */
    public static Duracion horasMin(int segundos) {
        int hor = segundos / 3600;
        int min = (segundos - hor * 3600) / 60;
        int seg = (segundos - hor * 3600 - min * 60); 
        return new Duracion (hor, min, seg);
    }

    /**
     * Resta (Sobrecargado)
     * @param d Objeto de la clase Duracion
     * @return Objeto Duracion con la resta de los tiempos
     * @throws Exception
     */
    public Duracion resta(Duracion d) throws Exception {
        if(this.seg() < d.seg()) {
            throw new Exception("El tiempo es negativo");
        }
        return Duracion.horasMin(this.seg()-d.seg());
    }

    /**
     * Resta (Sobrecargado)
     * @param s Segundos
     * @return Objeto Duracion con la resta quitandole segundos
     * @throws Exception
     */
    public Duracion resta(int s) throws Exception {
        return this.resta(Duracion.horasMin(s));
    }

    /**
     * Se suman dos objetos de esta clase
     * @param d Objeto 
     * @return
     * @throws Exception
     * ! Hay que corregir el metodo!!
     */
    /*public Duracion suma(Duracion d) throws Exception {
    return 
    }*/

    /**
     * Se suma con los segundos pasados
     * @param seg Segundos
     * @return La suma del objeto sumandole los segundos
     * @throws Exception
     */
    /*public Duracion suma(int seg) throws Exception {
    return this.suma(Duracion.horasMin(segundos));
    }*/

    /**
     * ToString
     */
    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d", this.horas, this.minutos, this.segundos);
    }

    @Override
    public boolean equals(Object obj) {
        return this.horas == ((Duracion) obj).seg();
    }
}