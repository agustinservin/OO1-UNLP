package ar.edu.info.unlp.Cinefiloos;

import java.util.ArrayList;
//podrian extender de objetoconperfil?
public class Cinefilo{
	private String nombre;
	private String apellido;
	private String email;
	private PerfilDeGenero perfil;
	private ArrayList<Pelicula> peliculasVistas;
	public Cinefilo(String nombre, String apellido, String email) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
		this.perfil = new PerfilDeGenero();
		this.peliculasVistas = new ArrayList<Pelicula>();
	}
	public String getNombreCompleto() {
		return nombre + " " + apellido;
	}
	public boolean esMatch(PerfilDeGenero perfilAComparar) {
		return this.perfil.comparar(perfilAComparar);
	}
	public ArrayList<Pelicula> getPeliculas(){
		return peliculasVistas;
	}
	public Boolean sawIt(Pelicula p) {
		return peliculasVistas.contains(p);
	}
	public void mirarPelicula(Pelicula p) {
		peliculasVistas.add(p);
		promediarPerfil();
	}
	private void promediarPerfil(){
		if(peliculasVistas.size() < 2) {
			for (Pelicula pelicula : peliculasVistas) {
				PerfilDeGenero perfilActual = pelicula.getPerfilDeGenero();
				this.perfil.setPuntAccion(Math.abs((perfilActual.getPuntAccion() + this.perfil.getPuntAccion()) / 2));
				this.perfil.setPuntRomance(Math.abs((perfilActual.getPuntRomance() + this.perfil.getPuntRomance()) / 2));
				this.perfil.setPuntHorror(Math.abs((perfilActual.getPuntHorror() + this.perfil.getPuntHorror()) / 2));
				this.perfil.setPuntSciFi(Math.abs((perfilActual.getPuntSciFi() + this.perfil.getPuntSciFi()) / 2));
				this.perfil.setPuntSuspenso(Math.abs((perfilActual.getPuntSuspenso() + this.perfil.getPuntSuspenso()) / 2));
				this.perfil.setPuntComedy(Math.abs((perfilActual.getPuntComedy() + this.perfil.getPuntComedy()) / 2));
			}
		}
		else{
			int size = peliculasVistas.size();
			for (Pelicula pelicula : peliculasVistas) {
				PerfilDeGenero perfilActual = pelicula.getPerfilDeGenero();
				this.perfil.setPuntAccion(Math.abs((perfilActual.getPuntAccion() + this.perfil.getPuntAccion()) / size));
				this.perfil.setPuntRomance(Math.abs((perfilActual.getPuntRomance() + this.perfil.getPuntRomance()) / size));
				this.perfil.setPuntHorror(Math.abs((perfilActual.getPuntHorror() + this.perfil.getPuntHorror()) / size));
				this.perfil.setPuntSciFi(Math.abs((perfilActual.getPuntSciFi() + this.perfil.getPuntSciFi()) / size));
				this.perfil.setPuntSuspenso(Math.abs((perfilActual.getPuntSuspenso() + this.perfil.getPuntSuspenso()) / size));
				this.perfil.setPuntComedy(Math.abs((perfilActual.getPuntComedy() + this.perfil.getPuntComedy()) / size));
				}
			}
		}
	}
