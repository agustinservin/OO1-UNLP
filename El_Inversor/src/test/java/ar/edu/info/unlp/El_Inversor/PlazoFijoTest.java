package ar.edu.info.unlp.El_Inversor;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.Console;
import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PlazoFijoTest {
	PlazoFijo pfSinDeposito, pfConDeposito;
	@BeforeEach
	void setup(){
		//resto 7 dias para poder hacer la cuenta, sino el metodo valorActual de una inversion va a restar hoy - hoy
		//partition 1 with U$D0
		pfSinDeposito = new PlazoFijo(0, 0.1, LocalDate.now().minusDays(7));
		//partition 2 with U$D300
		pfConDeposito = new PlazoFijo(300, 0.1, LocalDate.now().minusDays(7));
	}
	@Test
	public void testValorActual() {
		assertEquals(0, pfSinDeposito.valorActual());
		assertEquals(302.1, pfConDeposito.valorActual());
	}
}
