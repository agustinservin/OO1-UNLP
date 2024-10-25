package ar.edu.info.unlp.El_Inversor;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class InversionEnAccionesTest {
	InversionEnAcciones mercadoLibre;
	@BeforeEach
	void setup() {
		mercadoLibre = new InversionEnAcciones("Mercado Libre", 5000, 2);
	}
	@Test
	public void testValorActual() {
		assertEquals(10000, mercadoLibre.valorActual());
	}
}
