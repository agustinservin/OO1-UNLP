package ar.edu.info.unlp.El_Inversor;

public class InversionEnAcciones implements IInversion {
	private String nombre;
	private int cantidad;
	private double valorUnitario;
	public InversionEnAcciones(String nombre, double valorUnitario, int cantidad){
		this.nombre = nombre;
		this.valorUnitario = valorUnitario;
		this.cantidad = cantidad;
	}
	public double valorActual() {
		return this.cantidad * this.valorUnitario;
	}
	
}
