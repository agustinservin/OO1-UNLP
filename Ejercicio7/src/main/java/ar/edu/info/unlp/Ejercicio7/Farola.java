package ar.edu.info.unlp.Ejercicio7;

import java.util.ArrayList;
import java.util.List;

public class Farola {
	private Boolean encendida;
	private Boolean apagada;
	private List<Farola> neighbors = new ArrayList<Farola>();
	public Farola() {
		encendida = false;
		apagada = true;
	}
	/*
	* Crea la relación de vecinos entre las farolas. La relación de vecinos entre las farolas es recíproca, es decir el receptor del mensaje será vecino de otraFarola, al igual que otraFarola también se convertirá en vecina del receptor del mensaje
	*/
	public void pairWithNeighbor( Farola otraFarola ) {
		if(!neighbors.contains(otraFarola)) {
			neighbors.add(otraFarola);
			otraFarola.pairWithNeighbor(this);
		}
	}
	/*
	* Retorna sus farolas vecinas
	*/
	public List<Farola> getNeighbors(){
		return neighbors;
	}


	/*
	* Si la farola no está encendida, la enciende y propaga la acción.
	*/
	public void turnOn() {
		if(apagada == true) {
			apagada = false;
			encendida = true;
			//neighbors.stream().filter(f -> f.isOff() == true).forEach(f -> f.turnOn());
			neighbors.forEach(f->f.turnOn());
		}
	}

	/*
	* Si la farola no está apagada, la apaga y propaga la acción.
	*/
	public void turnOff() {
		if(apagada == false) {
			encendida = false;
			apagada = true;
			//solucion menos eficiente porque conlleva crear un stream y hacer el filtro
			//neighbors.stream().filter(f -> f.isOff() == false).forEach(f -> f.turnOff());
			//solucion mas eficiente 
			neighbors.forEach(f->f.turnOff());
		}
	}
	/*
	* Retorna true si la farola está encendida.
	*/
	public boolean isOn() {
		return encendida;
	}
	public Boolean isOff() {
		return apagada;
	}

}
