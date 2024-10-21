package ar.edu.info.unlp.Ejercicio12;

import java.util.List;

public class ReporteDeConstruccion {
	private List<Pieza> listaDePiezas;
	public double volumenDeMaterial(String material) {
		return listaDePiezas.stream().filter(p -> p.getMaterial() == material).mapToDouble(p->p.getVolumen()).sum();
	}
	public double superficieDeColor(String color) {
		return listaDePiezas.stream().filter(p->p.getColor() == color).mapToDouble(p->p.getSuperficie()).sum();
	}
}
