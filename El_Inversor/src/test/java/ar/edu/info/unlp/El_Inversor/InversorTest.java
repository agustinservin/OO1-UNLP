package ar.edu.info.unlp.El_Inversor;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class InversorTest {
	Inversor carlos;
	InversionEnAcciones mercadoLibre;
	PlazoFijo pf;
	@BeforeEach
	void setup(){
		carlos = new Inversor("Carlos");
		mercadoLibre = new InversionEnAcciones("Mercado Libre", 5000, 2);
		pf = new PlazoFijo(300, 0.1, LocalDate.now().minusDays(7));
		carlos.Invertir(mercadoLibre);
		carlos.Invertir(pf);
	}
	@Test
	public void testValorActual() {
		assertEquals(10302.1, carlos.valorActual());
	}
}
