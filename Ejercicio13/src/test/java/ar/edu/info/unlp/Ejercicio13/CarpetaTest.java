package ar.edu.info.unlp.Ejercicio13;

import org.junit.jupiter.api.BeforeEach;
public class CarpetaTest {
	Carpeta spam,inbox;
	Email email;
	@BeforeEach
	void setup() {
		spam = new Carpeta("spam");
		inbox = new Carpeta("inbox");
		email = new Email("No pasaras!", "cuerpo del email");
		inbox.agregarEmail(email);
	}
	@Test
	public void testGetNombre() {
		assertEquals("spam", spam.getNombre());
	}
	@Test
	public void testGetEmails() {
		assertEquals(1,inbox.getEmails().size());
	}
	@Test
	public void testMover() {
		assertEquals(1,inbox.getEmails().size());
		assertEquals(0, spam.getEmails().size());
		inbox.mover(email, spam);
		assertEquals(1, spam.getEmails().size());
		assertEquals(0, inbox.getEmails().size());
	}
	@Test
	public void testAgregarEmail() {
		assertEquals(0, spam.getEmails().size());
		spam.agregarEmail(email);
		assertEquals(1, spam.getEmails().size());
>>>>>>> 5d3415518c5d248dbade36d0b186d6309f518065
	}
}
