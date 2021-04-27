package ejercicio2v2;

import java.util.ArrayList;

public class Casa {

	private String nombre;
	private int maximoEstudiantes;
	private ArrayList<Alumno> alumnos = new ArrayList<Alumno>();
	private ArrayList<String> cualidadesNecesarias = new ArrayList<String>();
	
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
		cualidadesNecesarias.add(cualidad);
	}
	
	public void eliminarCualidad(String cualidad) {
		cualidadesNecesarias.remove(cualidad);
	}
		
	public boolean agregarAlumno(Alumno alumno) {
		if (permiteAlumno(alumno)) {
			alumnos.add(alumno);
			alumno.setHouse(this);
			return true;
		}
		return false;
	}
	
	protected boolean permiteAlumno(Alumno alumno) {
		return (maximoEstudiantes < alumnos.size() && alumno.contieneCualidades(cualidadesNecesarias) && !alumno.tieneCasa());
	}
	
	public boolean equals(Casa casa) {
		return this.getNombre() == casa.getNombre();
	}
	
}
