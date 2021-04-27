package ejercicio2v2;

public class CasaFamiliar extends Casa{

	public CasaFamiliar(String nombre, int maximoEstudiantes) {
		super(nombre, maximoEstudiantes);
	}
	
	public boolean permiteAlumno(Alumno alumno) {
		return (alumno.familiarEnCasa(this) && super.permiteAlumno(alumno));
	}
	
}
