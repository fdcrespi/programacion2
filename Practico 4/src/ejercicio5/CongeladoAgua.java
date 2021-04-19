package ejercicio5;

import java.time.LocalDate;

public class CongeladoAgua extends Producto {
	private double salinidad;

	public double getSalinidad() {
		return salinidad;
	}

	public void setSalinidad(double salinidad) {
		this.salinidad = salinidad;
	}

	public CongeladoAgua(String nombre, LocalDate vencimiento, int nroLote, double salinidad) {
		super(nombre, vencimiento, nroLote);
		// TODO Auto-generated constructor stub
		this.salinidad = salinidad;
	}
	
	
}
