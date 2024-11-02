package ar.edu.info.unlp.Ejercicio13;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ClienteDeCorreoTest {
	//validar que busque tambien cuando tenga carpetas
	ClienteDeCorreo clienteConCorreos, clienteSinCorreos;
	Email em1, em2, em3;
	Carpeta c1;
	@BeforeEach
	void setup() {
		clienteConCorreos = new ClienteDeCorreo();
		c1 = new Carpeta("Carpeta1");
		em1 = new Email("Titulo1", "Cuerpo1");
		em2 = new Email("Titulo2", "Cuerpo2");
		em3 = new Email("Titulo3", "Cuerpo3");
		clienteConCorreos.recibir(em1);
		clienteConCorreos.recibir(em2);
		clienteConCorreos.recibir(em3);
		clienteConCorreos.agregarCarpeta(c1);
		clienteConCorreos.moverDelInbox(em2, c1);
		clienteSinCorreos = new ClienteDeCorreo();
	}
	@Test
	public void buscarTest() {
		assertEquals(em2, clienteConCorreos.buscar("Cuerpo2"));
		assertNull(clienteSinCorreos.buscar("Cuerpo1"));
	}
	@Test
	public void espacioOcupadoTest(){
		assertEquals(42, clienteConCorreos.espacioOcupado());
		assertEquals(0, clienteSinCorreos.espacioOcupado());
	}
	
}
