package ejercicio4;

import java.time.LocalDate;

public class Futbolista extends Integrante {

	private String posicion;
	private boolean esZurdo;
	private int cantidadGoles;

	public String getPosicion() {
		return posicion;
	}

	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}

	public boolean isEsZurdo() {
		return esZurdo;
	}

	public void setEsZurdo(boolean esZurdo) {
		this.esZurdo = esZurdo;
	}

	public int getCantidadGoles() {
		return cantidadGoles;
	}

	public void setCantidadGoles(int cantidadGoles) {
		this.cantidadGoles = cantidadGoles;
	}
	
	public Futbolista(String nombre, String apellido, LocalDate fechaNac) {
		super(nombre,apellido,fechaNac);
		this.cantidadGoles = 0;
		this.esZurdo = false;
		this.posicion = "";
	}
	
	public Futbolista(String nombre, String apellido, LocalDate fechaNac, String posicion) {
		super(nombre,apellido,fechaNac);
		this.cantidadGoles = 0;
		this.esZurdo = false;
		this.posicion = posicion;
	}

}
