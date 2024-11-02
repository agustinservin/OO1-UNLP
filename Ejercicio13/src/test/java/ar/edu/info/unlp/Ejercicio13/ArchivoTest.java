package ar.edu.info.unlp.Ejercicio13;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ArchivoTest {
	Archivo archivo;
	@BeforeEach
	void setup() {
		archivo = new Archivo("imagen");
	}
	@Test
	public void testGetTamanio() {
		assertEquals(6, archivo.tamanio());
	}
}
