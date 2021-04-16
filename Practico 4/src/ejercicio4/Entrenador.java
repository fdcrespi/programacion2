package ejercicio4;

import java.time.LocalDate;

public class Entrenador extends Integrante {
	private String federacion;

	public String getFederacion() {
		return federacion;
	}

	public void setFederacion(String federacion) {
		this.federacion = federacion;
	}
	
	public Entrenador(String nombre, String apellido, LocalDate fechaNac) {
		super(nombre,apellido,fechaNac);
		this.federacion = "";
	}
	
	public Entrenador(String nombre, String apellido, LocalDate fechaNac, String federacion) {
		super(nombre,apellido,fechaNac);
		this.federacion = federacion;
	}
}
