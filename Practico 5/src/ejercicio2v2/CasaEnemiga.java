package ejercicio2v2;

import java.util.ArrayList;

public class CasaEnemiga extends Casa{

	private ArrayList<Casa> enemigas = new ArrayList<Casa>();
	
	public CasaEnemiga(String nombre, int maximoEstudiantes) {
		super(nombre, maximoEstudiantes);
	}
	
	public void agregarCasaEnemiga(Casa casa) {
		enemigas.add(casa);
	}
	
	public boolean agregarAlumno(Alumno alumno) {
		return (esAdmitido(alumno) && super.agregarAlumno(alumno));
	}
	
	private boolean esAdmitido(Alumno alumno) {
		boolean esAdmitido = true;
		int i = 0;
		while (esAdmitido && i < enemigas.size()) {
			if (enemigas.get(i).permiteAlumno(alumno)) {
				esAdmitido = false;
			}
			i++;
		}
		return esAdmitido;
	}
}
