package ejercicio2v2;

public class CasaFamiliar extends Casa{

	public CasaFamiliar(String nombre, int maximoEstudiantes) {
		super(nombre, maximoEstudiantes);
	}
	
	public boolean agregarAlumno(Alumno alumno) {
		return (tieneFamiliar(alumno) && super.agregarAlumno(alumno));
	}
	
	private boolean tieneFamiliar(Alumno alumno) {
		return alumno.familiarEnCasa(this);
	}
	
}
