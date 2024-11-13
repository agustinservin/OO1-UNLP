package ar.edu.info.unlp.Cinefiloos;

public class PerfilDeGenero {
	private Double puntHorror;
	private Double puntAccion;
	private Double puntRomance;
	private Double puntSuspenso;
	private Double puntComedy;
	private Double puntSciFi;
	
	public PerfilDeGenero() {
		this.puntAccion = 0.0;
		this.puntHorror = 0.0;
		this.puntRomance = 0.0;
		this.puntSuspenso = 0.0;
		this.puntComedy = 0.0;
		this.puntSciFi = 0.0;
	}
	
	public Boolean comparar(PerfilDeGenero perfil) {
		double suma = Math.abs(puntHorror - perfil.getPuntHorror()) + Math.abs(puntAccion- perfil.getPuntAccion())
						+ Math.abs(puntRomance- perfil.getPuntRomance()) + Math.abs(puntSuspenso- perfil.getPuntSuspenso())
						+ Math.abs(puntComedy - perfil.getPuntComedy()) + Math.abs(puntSciFi - perfil.getPuntSciFi());
		return suma < 6;
						
	}
	
	public Double getPuntHorror() {
		return puntHorror;
	}
	public void setPuntHorror(Double puntHorror) {
		this.puntHorror = puntHorror;
	}
	public Double getPuntAccion() {
		return puntAccion;
	}
	public void setPuntAccion(Double puntAccion) {
		this.puntAccion = puntAccion;
	}
	public Double getPuntRomance() {
		return puntRomance;
	}
	public void setPuntRomance(Double puntRomance) {
		this.puntRomance = puntRomance;
	}
	public Double getPuntSuspenso() {
		return puntSuspenso;
	}
	public void setPuntSuspenso(Double puntSuspenso) {
		this.puntSuspenso = puntSuspenso;
	}
	public Double getPuntComedy() {
		return puntComedy;
	}
	public void setPuntComedy(Double puntComedy) {
		this.puntComedy = puntComedy;
	}
	public Double getPuntSciFi() {
		return puntSciFi;
	}
	public void setPuntSciFi(Double puntSciFi) {
		this.puntSciFi = puntSciFi;
	}
	
	
}
