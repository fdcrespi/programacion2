package ejercicio2v2;

import java.util.ArrayList;

public class Alumno {

	private String nombre;
	private Casa house;
	private ArrayList<Alumno> familia = new ArrayList<Alumno>();
	private ArrayList<String> cualidades = new ArrayList<String>();

	public Alumno(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Casa getHouse() {
		return house;
	}

	public void setHouse(Casa house) {
		this.house = house;
	}

	public void agregarCualidad(String cualidad) {
		cualidades.add(cualidad);
	}

	public void eliminarCualidad(String cualidad) {
		cualidades.remove(cualidad);
	}

	public void agregarFamiliar(Alumno alumno) {
		familia.add(alumno);
	}

	public void eliminarFamiliar(Alumno alumno) {
		familia.remove(alumno);
	}

	public boolean contieneCualidades(ArrayList<String> cualidadesNecesarias) {
		return cualidades.containsAll(cualidadesNecesarias);
	}

	public boolean familiarEnCasa(Casa casaFamiliar) {
		for (int i = 0; i < familia.size(); i++) {
			if (familia.get(i).tieneCasa() && familia.get(i).getHouse().equals(casaFamiliar)) {
				return true;
			}
		}
		return false;
	}

	public boolean tieneCasa() {
		return house != null;
	}
}
