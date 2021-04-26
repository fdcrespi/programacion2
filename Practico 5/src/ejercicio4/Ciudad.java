package ejercicio4;

import java.util.ArrayList;

public class Ciudad {

	private String nombre;
	private ArrayList<Contribuyente> contribuyentes;

	public Ciudad(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void addContribuyente(Contribuyente contribuyente) {
		contribuyentes.add(contribuyente);
	}
	
	public boolean removeContribuyente(Contribuyente contribuyente) {
		return contribuyentes.remove(contribuyente);
	}
}
