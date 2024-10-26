package ar.edu.info.unlp.Ejercicio12;

public class PrismaRectangular extends Pieza{
	private Integer ladoMayor;
	private Integer ladoMenor;
	private Integer altura;
	public PrismaRectangular(String material, String color, Integer ladoMayor, Integer ladoMenor, Integer altura) {
		super(material, color);
		this.ladoMayor = ladoMayor;
		this.ladoMenor = ladoMenor;
		this.altura = altura;
	}
    //Volumen del prisma: ladoMayor * ladoMenor * altura
	//Superficie del prisma: 2 * (ladoMayor * ladoMenor + ladoMayor * altura + ladoMenor * altura)

	@Override
	public Double getVolumen() {
		// TODO Auto-generated method stub
		return this.ladoMayor * this.ladoMenor * this.altura + 0.0;
	}

	@Override
	public Double getSuperficie() {
		// TODO Auto-generated method stub
		return 2.0 * (ladoMayor * ladoMenor + ladoMayor * altura + ladoMenor * altura);
	}
	
}
