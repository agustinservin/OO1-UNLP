package ar.edu.info.unlp.Ejercicio14;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
public class Prueba {

	public static void main(String[] args) {
		//crear nueva fecha
		LocalDate fechaNueva = LocalDate.of(2024, 10, 25);
		LocalDate fechaAntigua = LocalDate.of(1972, 12, 15);
		LocalDate fechaFutura = LocalDate.of(2032, 12, 15);
		System.out.println(fechaAntigua.isBefore(LocalDate.now()) && fechaFutura.isAfter(LocalDate.now()));
		//dias que pasaron hasta hoy
		System.out.println(ChronoUnit.DAYS.between(LocalDate.now(),fechaNueva));
	}

}
