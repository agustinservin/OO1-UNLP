package ar.edu.info.unlp.Ejercicio13;

public class Archivo {
	private String nombre;
	private Integer tamanio;
	public Archivo(String nombre) {
		this.nombre = nombre;
		this.tamanio = nombre.length();
	}
	public Integer tamanio() {
		return this.tamanio;
	}
}
