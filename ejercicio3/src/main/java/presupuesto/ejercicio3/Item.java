package presupuesto.ejercicio3;

public class Item {
	private String detalle;
	private int cantidad;
	private int costoUnitario;
	public Item(String detalle, int cantidad, int costoUnitario) {
		this.detalle = detalle;
		this.cantidad = cantidad;
		this.costoUnitario = costoUnitario;
	}
	
	public int getCostoUnitario()
	{
		return this.costoUnitario;
	}
	public int getCantidad() {
		return cantidad;
	}
}
