package ejercicio5;

import java.time.LocalDate;

public class Producto {

	private String nombre;
	private LocalDate fechaVencimiento;
	private int nroLote;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public LocalDate getFechaVencimiento() {
		return fechaVencimiento;
	}

	public void setFechaVencimiento(LocalDate fechaVencimiento) {
		this.fechaVencimiento = fechaVencimiento;
	}

	public int getNroLote() {
		return nroLote;
	}

	public void setNroLote(int nroLote) {
		this.nroLote = nroLote;
	}
	
	public Producto (String nombre, LocalDate vencimiento, int nroLote) {
		this.nombre = nombre;
		this.fechaVencimiento = vencimiento;
		this.nroLote = nroLote;
	}

}
