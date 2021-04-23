package ejercicio2v2;

import java.util.ArrayList;

public class Casa {

	private String nombre;
	private int maximoEstudiantes;
	private ArrayList<Alumno> alumnos = new ArrayList<Alumno>();
	private ArrayList<String> cualidades = new ArrayList<String>();
	
	public Casa(String nombre, int maximoEstudiantes) {
		this.nombre = nombre;
		this.maximoEstudiantes = maximoEstudiantes;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getMaximoEstudiantes() {
		return maximoEstudiantes;
	}

	public void setMaximoEstudiantes(int maximoEstudiantes) {
		this.maximoEstudiantes = maximoEstudiantes;
	}
	
	public void agregarCualidad(String cualidad) {
		cualidades.add(cualidad);
	}
	
	public void eliminarCualidad(String cualidad) {
		cualidades.remove(cualidad);
	}
		
	public ArrayList<Alumno> getAlumnos() {
		return alumnos;
	}
	
	public boolean agregarAlumno(Alumno alumno) {
		if (permiteAlumno(alumno)) {
			alumnos.add(alumno);
			return true;
		}
		return false;
	}
	
	protected boolean permiteAlumno(Alumno alumno) {
		return (maximoEstudiantes < alumnos.size() && cualidades.containsAll(alumno.getCualidades()));
	}
	
}
