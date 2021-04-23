package ejercicio2v2;

import java.util.ArrayList;

public class Alumno {
	
	private String nombre;
	private ArrayList<Alumno> familia = new ArrayList<Alumno>();
	private ArrayList<String> cualidades = new ArrayList<String>();
	
	public Alumno (String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public ArrayList<String> getCualidades() {
		return cualidades;
	}

	public void agregarCualidad(String cualidad) {
		cualidades.add(cualidad);
	}
	
	public void eliminarCualidad(String cualidad) {
		cualidades.remove(cualidad);
	}
	
	public ArrayList<Alumno> getFamilia() {
		return familia;
	}

	public void agregarFamiliar(Alumno alumno) {
		familia.add(alumno);
	}
	
	public void eliminarFamiliar(Alumno alumno) {
		familia.remove(alumno);
	}
}
