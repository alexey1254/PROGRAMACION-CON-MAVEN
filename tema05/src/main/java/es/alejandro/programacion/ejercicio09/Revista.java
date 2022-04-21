package es.alejandro.programacion.ejercicio09;

public class Revista {
    private String issn;
    private int numero;
    private int anioPublicacion;
    private String nombre;

    public Revista(String issn, String nombre, int anioPublicacion, int numero) {
        this.issn = issn;
        this.nombre = nombre;
        this.anioPublicacion = anioPublicacion;
        this.numero = numero;
    }

    @Override
    public String toString() {
        return String.format("ISSN: %s, titulo: %s, año de publicacion: %s", this.issn, this.nombre,
                this.anioPublicacion);
    }
}
