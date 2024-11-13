package ar.edu.info.unlp.Cinefiloos;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CinefiloTest {
	Cinefilo carlos;
	Pelicula saw, sawII, lala;
	@BeforeEach
	void setup(){
		carlos = new Cinefilo("Carlos", "roman","carlosroman@gmail.com");
		saw = new Pelicula("saw","saw.com");
		lala = new Pelicula("lalaland", "aPuroRomance.com/lalaland");
		sawII = new Pelicula("saw II","saw.com/2");
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
	public void testEsMatchSinPeliculasVistas(){
		assertTrue(carlos.esMatch(saw.getPerfilDeGenero()));
	}
	
}	
