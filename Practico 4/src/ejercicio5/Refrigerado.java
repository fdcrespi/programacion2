package ejercicio5;

import java.time.LocalDate;

public class Refrigerado extends Fresco {

	private String organismo;
	private double temperatura;

	public String getOrganismo() {
		return organismo;
	}

	public void setOrganismo(String organismo) {
		this.organismo = organismo;
	}

	public double getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(double temperatura) {
		this.temperatura = temperatura;
	}
	
	public Refrigerado(String nombre, LocalDate fechaVencimiento, int nroLote, LocalDate fechaEnvasado, String granja) {
		super(nombre, fechaVencimiento, nroLote, fechaEnvasado, granja);
	}

}
