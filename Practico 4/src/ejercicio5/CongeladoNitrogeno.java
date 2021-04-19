package ejercicio5;

import java.time.LocalDate;
import java.time.LocalTime;

public class CongeladoNitrogeno extends Producto {
	private String metodo;
	private LocalTime tiempo;
	
	

	public CongeladoNitrogeno(String nombre, LocalDate vencimiento, int nroLote, String metodo, LocalTime tiempo) {
		super(nombre, vencimiento, nroLote);
		// TODO Auto-generated constructor stub
		this.metodo = metodo;
		this.tiempo = tiempo;
	}

	public String getMetodo() {
		return metodo;
	}

	public void setMetodo(String metodo) {
		this.metodo = metodo;
	}

	public LocalTime getTiempo() {
		return tiempo;
	}

	public void setTiempo(LocalTime tiempo) {
		this.tiempo = tiempo;
	}

}
