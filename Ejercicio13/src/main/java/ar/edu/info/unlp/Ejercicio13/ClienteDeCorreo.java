package ar.edu.info.unlp.Ejercicio13;
import java.util.ArrayList;
public class ClienteDeCorreo {
	private ArrayList<Carpeta> carpetas;
	public ClienteDeCorreo(){
		carpetas = new ArrayList<Carpeta>();
		carpetas.add(new Carpeta("inbox"));
	}
	public void agregarCarpeta(Carpeta carpeta) {
		this.carpetas.add(carpeta);
	}
	public Email buscar(String texto) {
		//como busco?
	}
	public void recibir(Email email){
		
	}
}
