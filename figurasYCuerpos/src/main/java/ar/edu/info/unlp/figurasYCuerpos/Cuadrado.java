package ar.edu.info.unlp.figurasYCuerpos;

public class Cuadrado implements Figura {
	private Double lado;
	public void setLado(Double lado) {
		this.lado = lado;
	}
	public Double getLado() {
		return this.lado;
	}
	public Double getPerimetro() {
		return lado * 4;
	}
	public Double getArea() {
		return lado * lado;
	}
}
