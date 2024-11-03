package ar.edu.info.unlp.Cinefiloos;
//podria ahorrarme codigo en las clases pelicula y cinefilo
public class ObjetoConPerfil {
	protected PerfilDeGenero perfil;
	public Boolean comparar(PerfilDeGenero perfilAComparar) {
		return this.perfil.comparar(perfilAComparar);
	}
	public PerfilDeGenero getPerfilDeGenero() {
		return this.perfil;
	}
}
