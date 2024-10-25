package ar.edu.info.unlp.Ejercicio12;

public class Cilindro extends Pieza {
	Integer radio;
	Integer altura;
	public Cilindro(String material, String color) {
		super(material, color);
	}
	@Override
	public Double getVolumen() {
		// TODO Auto-generated method stub
		return Math.PI * radio * radio 	;
	}

	@Override
	public Double getSuperficie() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
