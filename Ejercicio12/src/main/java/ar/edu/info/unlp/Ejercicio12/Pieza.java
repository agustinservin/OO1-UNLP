package ar.edu.info.unlp.Ejercicio12;

public abstract class Pieza {
	private String material;
	private String color;
	public String getMaterial() {
		return this.material;
	}
	public String getColor() {
		return this.color;
	}
	public abstract Integer getVolumen();
	public abstract Integer getSuperficie();
}
