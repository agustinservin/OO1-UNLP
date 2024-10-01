package ar.edu.info.unlp.Ejercicio6;

import java.sql.Date;

public class Mamifero {
	private String id;
	private String especie;
	private Date fechaNac;
	private Mamifero padre;
	private Mamifero madre;
	private Mamifero abueloMaterno;
	private Mamifero abuelaMaterna;
	private Mamifero abueloPaterno;
	private Mamifero abuelaPaterna;
	public Mamifero(String id) {
		this.id = id;
	}
	public Mamifero() {}
	public String getIdentificador() {
		return this.id;
	}
	public void setIdentificador(String id) {
		this.id = id;
	}
	public String getEspecie() {
		return especie;
	}
	public void setEspecie(String especie) {
		this.especie = especie;
	}
	public Date getFechaNac() {
		return fechaNac;
	}
	public void setFechaNac(Date fechaNac) {
		this.fechaNac = fechaNac;
	}
	public Mamifero getPadre() {
		return padre;
	}
	public void setPadre(Mamifero padre) {
		this.padre = padre;
	}
	public Mamifero getMadre() {
		return madre;
	}
	public void setMadre(Mamifero madre) {
		this.madre = madre;
	}
	public Mamifero getAbueloMaterno() {
		abueloMaterno = madre.getPadre();
		return abueloMaterno;
	}
	public Mamifero getAbuelaMaterna() {
		this.abuelaMaterna = madre.getMadre();
		return this.abuelaMaterna;
	}
	public Mamifero getAbueloPaterno() {
		abueloPaterno = padre.getPadre();
		return abueloPaterno;
	}
	public Mamifero getAbuelaPaterna() {
		abuelaMaterna = padre.getMadre();
		return abuelaMaterna;
	}
	
	public Boolean tieneComoAncestroA(Mamifero ancestro) {
		return this.abuelaMaterna == ancestro || this.abueloMaterno == ancestro || this.abueloPaterno == ancestro || this.abuelaPaterna == ancestro;
	}
	
}
