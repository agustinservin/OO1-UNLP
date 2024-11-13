package ar.edu.info.unlp.Cinefiloos;

import java.util.ArrayList;
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
		iniciarGeneros();
	}
	private void iniciarGeneros() {
		perfil.setPuntAccion(4.5);
		perfil.setPuntHorror(4.5);
		perfil.setPuntRomance(4.5);
		perfil.setPuntSciFi(4.5);
		perfil.setPuntComedy(4.5);
		perfil.setPuntSuspenso(4.5);
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
		Integer size = peliculasVistas.size() < 2 ? 2 : peliculasVistas.size();
			for (Pelicula pelicula : peliculasVistas)
			{
				PerfilDeGenero perfilActual = pelicula.getPerfilDeGenero();
				actualizarPerfil(perfilActual, size);
			}
		}
	//a cada pelicula entra, podria hacerse una sola vez juntando todos los puntajes de cada pelicula
	private void actualizarPerfil(PerfilDeGenero perfil, Integer size) 
	{
		this.perfil.setPuntAccion(Math.abs((perfil.getPuntAccion() + this.perfil.getPuntAccion()) / size));
		this.perfil.setPuntRomance(Math.abs((perfil.getPuntRomance() + this.perfil.getPuntRomance()) / size));
		this.perfil.setPuntHorror(Math.abs((perfil.getPuntHorror() + this.perfil.getPuntHorror()) / size));
		this.perfil.setPuntSciFi(Math.abs((perfil.getPuntSciFi() + this.perfil.getPuntSciFi()) / size));
		this.perfil.setPuntSuspenso(Math.abs((perfil.getPuntSuspenso() + this.perfil.getPuntSuspenso()) / size));
		this.perfil.setPuntComedy(Math.abs((perfil.getPuntComedy() + this.perfil.getPuntComedy()) / size));
	}
}
