package ar.edu.info.unlp.Ejercicio13;
import java.util.ArrayList;
public class Email {
	private String titulo;
	private String cuerpo;
	private Integer tamanio;
	private ArrayList<Archivo> archivos;
	public Email(String titulo, String cuerpo){
		this.tamanio = 0;
		this.titulo = titulo;
		this.cuerpo = cuerpo;
		this.tamanio += titulo.length();
		this.tamanio += cuerpo.length();
	}
	public String getTitulo() {
		return this.titulo;
	}
	public String getCuerpo() {
		return this.cuerpo;
	}
	//agrego archivo y sumo su tamanio
	public void agregarArchivo(Archivo arch) {
		this.archivos.add(arch);
		this.tamanio += arch.tamanio();
	}
	public Integer getTamanio() {
		return this.tamanio;
	}
	public ArrayList<Archivo> adjuntos(){
		return this.archivos;
	}
}
