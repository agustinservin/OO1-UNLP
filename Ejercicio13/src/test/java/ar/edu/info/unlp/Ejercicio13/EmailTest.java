package ar.edu.info.unlp.Ejercicio13;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class EmailTest {
	Email email;
	Archivo imagen;
	@BeforeEach
	void setup() {
		email = new Email("Aviso importante", "Invitacion a fiesta en calle avenida siempre viva");
		imagen = new Archivo("Imagen.jpg");
	}
	@Test
	public void testGetTitulo() {
		assertEquals("Aviso importante", email.getTitulo());
	}
	@Test
	public void testGetCuerpo() {
		assertEquals("Invitacion a fiesta en calle avenida siempre viva", email.getCuerpo());
	}
	@Test
	public void testAgregarArchivo() {
		assertEquals(0, email.adjuntos().size());
		email.agregarArchivo(imagen);
		assertEquals(1, email.adjuntos().size());
	}
	@Test
	public void testGetTamanio() {
		assertEquals(65, email.getTamanio());
		email.agregarArchivo(imagen);
		assertEquals(75, email.getTamanio());
	}
}
