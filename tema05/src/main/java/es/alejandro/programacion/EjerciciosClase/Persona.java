package es.alejandro.programacion.EjerciciosClase;

public class Persona implements Cloneable {
	private String nombre, apellidos;
	private int edad;
	/**
	* Constructor de copia
	*/
	public Persona(Persona p) {
	this.nombre=p.nombre;
	this.apellidos=p.apellidos;
	this.edad=p.edad;
	}
	
	public Persona(String nombre, String apellidos, int edad) {
	this.nombre=nombre;
	this.apellidos=apellidos;
	this.edad=edad;
	}

	public void setEdad(int edad) {
		this.edad=edad;
	}

	public void setNombre(String nom) {
		nombre=nom; 
	}

        /*@Override
        public boolean equals(Object p) {
        return ((Persona)p).edad == this.edad && this.nombre.equals( ((Persona) p).nombre)));
        }*/
	
	
	@Override
	public String toString() {
		return String.format("Nombre: %s, Apellidos: %s, Edad: %d, IdObjeto: %s.", this.nombre, this.apellidos, this.edad, super.toString());	
	}
	
	@Override
	public Persona clone() throws CloneNotSupportedException {
	return (Persona)super.clone();	
	}
}

