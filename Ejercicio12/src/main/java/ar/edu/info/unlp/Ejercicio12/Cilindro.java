package ar.edu.info.unlp.Ejercicio12;

public class Cilindro extends Pieza {
	private Integer radio;
	private Integer altura;
	public Cilindro(String material, String color, Integer radio, Integer altura) {
		super(material, color);
		this.radio = radio;
		this.altura = altura;
	}
	@Override
	public Double getVolumen() {
		// TODO Auto-generated method stub
		return Math.PI * Math.pow(radio, 2);
	}

	@Override
	public Double getSuperficie() {
		// TODO Auto-generated method stub
		// 2 * π * radio  * h + 2 * π * radio 2 
		return 2 * Math.PI * this.radio * this.altura + 2 * Math.PI * Math.pow(radio, 2);
	}
	
}
