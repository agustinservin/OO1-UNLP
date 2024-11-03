package ar.edu.info.unlp.Cinefiloos;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PeliculaTest {
	Pelicula saw,lala,sawII;
	PerfilDeGenero perfil;
	@BeforeEach
	void setup() {
		saw = new Pelicula("saw","saw.com");
		lala = new Pelicula("lalaland", "aPuroRomance.com/lalaland");
		sawII = new Pelicula("saw II","saw.com");
		saw.setPuntajeHorror(9.0);
		saw.setPuntajeSuspenso(7.5);
		saw.setPuntajeAccion(1.5);
		saw.setPuntajeSciFi(0.9);
		lala.setPuntajeRomance(9.0);
		lala.setPuntajeComedy(4.5);
		lala.setPuntajeSciFi(1.5);
		sawII.setPuntajeHorror(8.2);
		sawII.setPuntajeAccion(4.5);
		sawII.setPuntajeSuspenso(8.0);
	}
	@Test
	public void testGetPerfilDeGenero(){
		perfil = saw.getPerfilDeGenero();
		assertEquals(9.0, perfil.getPuntHorror());
		assertEquals(7.5, perfil.getPuntSuspenso());
		assertEquals(1.5, perfil.getPuntAccion());
		assertEquals(0.9, perfil.getPuntSciFi());
		assertEquals(0.0, perfil.getPuntRomance());
	}
	@Test 
	public void testEsMatch() {
		assertFalse(saw.esMatch(lala.getPerfilDeGenero()));
		assertTrue(saw.esMatch(sawII.getPerfilDeGenero()));
	}
}
