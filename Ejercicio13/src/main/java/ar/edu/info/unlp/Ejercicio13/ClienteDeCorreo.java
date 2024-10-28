package ar.edu.info.unlp.Ejercicio13;
import java.util.ArrayList;
public class ClienteDeCorreo {
	private ArrayList<Carpeta> carpetas;
	private Carpeta inbox;
	public ClienteDeCorreo(){
		carpetas = new ArrayList<Carpeta>();
		this.inbox = new Carpeta("inbox");
	}
	public void agregarCarpeta(Carpeta carpeta) {
		this.carpetas.add(carpeta);
	}
	public Integer espacioOcupado() {
		Integer espacio = inbox.getEmails().stream().mapToInt(e->e.getTamanio()).sum();
		for (Carpeta carpeta : carpetas) {
			espacio+= carpeta.getEmails().stream().mapToInt(e->e.getTamanio()).sum();
		}
		return espacio;
	}
	public Email buscar(String texto){
		//el filter deberia ser un metodo de Email
		Email email = inbox.getEmails().stream().filter(e->e.getCuerpo().contains(texto) || e.getTitulo().contains(texto)).findFirst().orElse(null);
		if(email != null) {
			return email;
		}
		for (Carpeta carpeta : carpetas) {
			email = carpeta.getEmails().stream().filter(e->e.getCuerpo().contains(texto) || e.getTitulo().contains(texto)).findFirst().orElse(null);
			if(email!=null) {
				return email;
			}
		}
		return email;
	}
	public void recibir(Email email){
		this.inbox.agregarEmail(email);
	}
	
	public void moverDelInbox(Email e, Carpeta destino) {
		this.inbox.mover(e, destino);
	}
	
}
