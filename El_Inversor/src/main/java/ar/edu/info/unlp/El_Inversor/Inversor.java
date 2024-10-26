package ar.edu.info.unlp.El_Inversor;
import java.util.ArrayList;
public class Inversor {
	String nombre;
	ArrayList<IInversion> inversiones;
	public Inversor(String nombre) {
		this.nombre=nombre;
		inversiones = new ArrayList<IInversion>();
	}
	public void Invertir(IInversion inversion) {
		this.inversiones.add(inversion);
	}
	public double valorActual() {
		return inversiones.stream().mapToDouble(i->i.valorActual()).sum();
	}
}
