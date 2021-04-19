package ejercicio5;

import java.time.LocalDate;

public class Fresco extends Producto {

	private LocalDate fechaEnvasado;
	private String granja;

	public LocalDate getFechaEnvasado() {
		return fechaEnvasado;
	}

	public void setFechaEnvasado(LocalDate fechaEnvasado) {
		this.fechaEnvasado = fechaEnvasado;
	}

	public String getGranja() {
		return granja;
	}

	public void setGranja(String granja) {
		this.granja = granja;
	}
	
	public Fresco(String nombre, LocalDate fechaVencimiento, int nroLote, LocalDate fechaEnvasado, String granja) {
		super(nombre, fechaVencimiento, nroLote);
		this.fechaEnvasado = fechaEnvasado;
		this.granja = granja;
	}

}
