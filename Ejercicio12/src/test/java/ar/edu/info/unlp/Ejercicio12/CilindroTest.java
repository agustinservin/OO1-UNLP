package ar.edu.info.unlp.Ejercicio12;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CilindroTest {
	Cilindro cilindro;
	@BeforeEach
	void setup() {
		cilindro = new Cilindro("Hierro", "rojo", 5, 10);
	}
	@Test
	public void testGetVolumen() {
		assertEquals(78.53981633974483, cilindro.getVolumen());
	}
	@Test
	public void testGetSuperficie() {
		assertEquals(471.23889803846896, cilindro.getSuperficie());
	}
}