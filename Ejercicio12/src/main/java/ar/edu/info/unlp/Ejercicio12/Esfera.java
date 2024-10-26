package ar.edu.info.unlp.Ejercicio12;

public class Esfera extends Pieza {
	private Integer radio;
	public Esfera(String material, String color, Integer radio) {
		super(material, color);
		this.radio = radio;
	}

	@Override
	public Double getVolumen() {
		// ⁴⁄₃ * π * radio ³
		return 4 / 3 * Math.PI * Math.pow(radio, 3);
	}

	@Override
	public Double getSuperficie() {
		// TODO Auto-generated method stub
		return 4 * Math.PI * Math.pow(radio, 2);
	}
	
}
