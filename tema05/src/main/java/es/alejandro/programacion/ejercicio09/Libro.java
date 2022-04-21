package es.alejandro.programacion.ejercicio09;

public class Libro {
    protected String titulo;
    protected int anioPublicacion;
    private String isbn;
    private boolean prestado;

    public Libro(String isbn, String titulo, int anioPublicacion) {
        this.titulo = titulo;
        this.anioPublicacion = anioPublicacion;
        this.isbn = isbn;
        this.prestado = false;
    }

    /**
     * Presta el libro
     */
    public void presta() {
        this.prestado = true;
    }

    /**
     * Devuelve el libro
     */
    public void devuelve() {
        this.prestado = false;
    }

    /**
     * Devuelve si esta prestado el libro
     * 
     * @return true si esta prestado
     */
    public boolean estaPrestado() {
        return this.prestado;
    }

    @Override
    public String toString() {
        String libroPrestado = "No";
        if (prestado) {
            libroPrestado = "Si";
        }
        return String.format("ISBN: %s, titulo: %s, año de publicacion: %s, prestado: %s ", this.isbn, this.titulo,
                this.anioPublicacion, libroPrestado);
    }
}
