package ar.edu.info.unlp.figurasYCuerpos;

public class Circulo implements Figura{
	private Double diametro;
	private Double radio;
	private Double pi = Math.PI;
	public Circulo(Double radio) {
		setRadio(radio);
		setDiametro(radio * 2);
	}
	public Circulo() {}
	public Double getDiametro() {
		return this.diametro;
	}
	public Double getRadio(){
		return this.radio;
	}
	public void setRadio(Double radio) {
		this.radio = radio;
		this.setDiametro(this.radio * 2);
	}
	public void setDiametro(Double diametro) {
		this.diametro = diametro;
	}
	public Double getPerimetro() {
		return this.pi * this.diametro;
	}
	public Double getArea() {
		return this.pi * (radio * radio);
	}
	
}
