package ejercicio5;

import java.time.LocalDate;

public class Refrigerado extends Producto {

	private LocalDate fechaEnvasado;
	private String organismo;
	private String granja;
	private double temperatura;

	public LocalDate getFechaEnvasado() {
		return fechaEnvasado;
	}

	public void setFechaEnvasado(LocalDate fechaEnvasado) {
		this.fechaEnvasado = fechaEnvasado;
	}

	public String getOrganismo() {
		return organismo;
	}

	public void setOrganismo(String organismo) {
		this.organismo = organismo;
	}

	public String getGranja() {
		return granja;
	}

	public void setGranja(String granja) {
		this.granja = granja;
	}

	public double getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(double temperatura) {
		this.temperatura = temperatura;
	}

}
