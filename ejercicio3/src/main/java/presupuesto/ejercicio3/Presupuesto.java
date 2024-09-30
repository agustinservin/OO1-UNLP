package presupuesto.ejercicio3;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

public class Presupuesto {
	LocalDate fecha = LocalDate.now();
	String cliente;
	ArrayList<Item> items = new ArrayList<Item>();
	public Presupuesto(String cliente) {
		this.cliente = cliente;
	}
	public void agregarItem(Item item) {
		items.add(item);
	}
	public int calcularTotal() {
		int total = 0;
		for (Item item : items) {
			total += item.getCostoUnitario() * item.getCantidad();
		}
		return total;
	}
	public String getCliente() {return cliente;}
	public LocalDate getFecha() {return fecha;}
}
