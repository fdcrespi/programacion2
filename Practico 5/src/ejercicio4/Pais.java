package ejercicio4;

import java.util.ArrayList;

public class Pais {

	private String nombre;
	private ArrayList<Ciudad> ciudades;

	public Pais(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void addCiudad(Ciudad ciudad) {
		ciudades.add(ciudad);
	}
	
	public boolean remove(Ciudad ciudad) {
		return ciudades.remove(ciudad);
	}
}
