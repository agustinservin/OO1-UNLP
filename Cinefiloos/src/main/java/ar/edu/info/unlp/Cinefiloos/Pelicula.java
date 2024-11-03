package ar.edu.info.unlp.Cinefiloos;
// extends ObjetoConPerfil
public class Pelicula{
	private String titulo;
	private String infoUrl;
	private PerfilDeGenero perfil;
	public Pelicula() {
		perfil = new PerfilDeGenero();
		iniciarGeneros();
	}
	private void iniciarGeneros() {
		perfil.setPuntAccion(0.0);
		perfil.setPuntHorror(0.0);
		perfil.setPuntRomance(0.0);
		perfil.setPuntSciFi(0.0);
		perfil.setPuntComedy(0.0);
		perfil.setPuntSuspenso(0.0);
	}
	public void setPuntajeHorror(Double punt) {
		perfil.setPuntHorror(punt);
	}
	public void setPuntajeRomance(Double punt) {
		perfil.setPuntRomance(punt);
	}
	public void setPuntajeSciFi(Double punt) {
		perfil.setPuntSciFi(punt);
	}
	public void setPuntajeComedy(Double punt) {
		perfil.setPuntComedy(punt);
	}
	public void setPuntajeSuspenso(Double punt) {
		perfil.setPuntSuspenso(punt);
	}
	public void setPuntajeAccion(Double punt) {
		perfil.setPuntAccion(punt);
	}
	
	public Pelicula(String titulo, String url) {
		perfil = new PerfilDeGenero();
		this.titulo = titulo;
		this.infoUrl = url;
		iniciarGeneros();
	}
	public String getTitulo() {
		return this.titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo= titulo;
	}
	public String getInfoUrl() {
		return infoUrl;
	}
	public void setInfoUrl(String url) {
		 this.infoUrl = url;
	}
	public PerfilDeGenero getPerfilDeGenero() {
		return perfil;
	}
	public boolean esMatch(PerfilDeGenero perfilAComparar) {
		return this.perfil.comparar(perfilAComparar);
	}
}
