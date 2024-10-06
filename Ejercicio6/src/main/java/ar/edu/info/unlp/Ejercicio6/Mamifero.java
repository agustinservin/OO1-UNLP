package ar.edu.info.unlp.Ejercicio6;

import java.sql.Date;

public class Mamifero {
	private String id;
	private String especie;
	private Date fechaNac;
	private Mamifero padre=null;
	private Mamifero madre=null;
	private Mamifero abueloMaterno=null;
	private Mamifero abuelaMaterna=null;
	private Mamifero abueloPaterno=null;
	private Mamifero abuelaPaterna=null;
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
	//errores notorios, en cada metodo validar que la madre o el padre no sean null.
	public Mamifero getAbueloMaterno() {
		if(madre != null) {
			abueloMaterno = madre.getPadre();
		}
		return abueloMaterno;
	}
	public Mamifero getAbuelaMaterna() {
		if(madre!=null) {
			this.abuelaMaterna = madre.getMadre();
		}
		return this.abuelaMaterna;
	}
	public Mamifero getAbueloPaterno() {
		if(padre != null) {
			abueloPaterno = padre.getPadre();
		}
		return abueloPaterno;
	}
	public Mamifero getAbuelaPaterna() {
		if(padre!= null) {
			abuelaPaterna = padre.getMadre();
		}
		return abuelaPaterna;
	}
	//demasiados OR, 0 escalable, esteticamente feo. Podria ser una lista de ancestros? donde llenaria esa lista? em que momento?
	public Boolean tieneComoAncestroA(Mamifero ancestro) {
		Boolean partePadre = false;
		Boolean parteMadre = false;
		if(padre!= null) {
			partePadre = padre.tieneComoAncestroA(ancestro);
		}else if(madre != null) {
			parteMadre = madre.tieneComoAncestroA(ancestro);
		}
		return parteMadre || partePadre;
	}
	
}
