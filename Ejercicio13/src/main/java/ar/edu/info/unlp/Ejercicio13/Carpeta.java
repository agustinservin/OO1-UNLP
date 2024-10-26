package ar.edu.info.unlp.Ejercicio13;
import java.util.ArrayList;
public class Carpeta {
	private String nombre;
	private ArrayList<Email> emails;
	public Carpeta(String nombre) {
		this.nombre = nombre;
		emails = new ArrayList<Email>();
	}
	public String getNombre() {
		return this.nombre;
	}
	public ArrayList<Email> getEmails() {
		return this.emails;
	}
	public void agregarEmail(Email email) {
		this.emails.add(email);
	}
	public void mover(Email email, Carpeta destino ){
		destino.agregarEmail(email);
		this.emails.remove(email);
	}
}
