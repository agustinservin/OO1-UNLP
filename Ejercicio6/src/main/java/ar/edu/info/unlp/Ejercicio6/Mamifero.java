package ar.edu.info.unlp.Ejercicio6;

import java.sql.Date;

public class Mamifero {
	private String id;
	private String especie;
	private Date fechaNac;
	private Mamifero padre;
	private Mamifero madre;
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
			return madre.getPadre();
		}
		return null;
		
	}
	public Mamifero getAbuelaMaterna() {
		if(madre!=null) {
			return madre.getMadre();
		}
		return null;
	}
	public Mamifero getAbueloPaterno() {
		if(padre != null) {
			return padre.getPadre();
		}
		return null;
	}
	public Mamifero getAbuelaPaterna() {
		if(padre!= null) {
			return padre.getMadre();
		}
		return null;
	}
	
	public Boolean tieneComoAncestroA(Mamifero ancestroBuscado) {
		Boolean encontrado = false;
		if(padre!= null){
			
			if(padre == ancestroBuscado){
				return true;
			}
			else{
				encontrado = padre.tieneComoAncestroA(ancestroBuscado);
			}
		}
		if(madre != null && encontrado == false) {
			
			if(madre == ancestroBuscado) {
				return true;
			}else{
				encontrado = madre.tieneComoAncestroA(ancestroBuscado);
			}
		}
		return encontrado;
	}
	
}
