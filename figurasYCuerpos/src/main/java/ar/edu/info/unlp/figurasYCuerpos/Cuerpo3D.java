package ar.edu.info.unlp.figurasYCuerpos;
public class Cuerpo3D {
	private Double altura;
	private Figura caraBasal;
	public void setAltura(Double altura){
		this.altura = altura;
	}
	public Double getAltura() {
		return altura;
	}
	public void setCaraBasal(Figura caraBasal) {
		this.caraBasal = caraBasal;
	}
	public Double getVolumen() {
		return caraBasal.getArea() * altura;
	}
	public Double getSuperficieExterior() {
		return 2 * caraBasal.getArea() + caraBasal.getPerimetro() * this.getAltura();
 	}
	
}
