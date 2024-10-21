package ar.edu.info.unlp.El_Inversor;
import java.time.LocalDate;
public class Main {

	public static void main(String[] args) {
		Inversor ramiro = new Inversor("Ramiro");
		InversionEnAcciones apple = new InversionEnAcciones("Apple",100.00,2);
		PlazoFijo plazoA30dias = new PlazoFijo(300.00, 1.5, LocalDate.of(2024,10,01));
		ramiro.Invertir(plazoA30dias);
		ramiro.Invertir(apple);
		System.out.println(ramiro.valorActual());
	}

}
