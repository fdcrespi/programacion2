package ejercicio2v2;

public class CasaFamiliar extends Casa{

	public CasaFamiliar(String nombre, int maximoEstudiantes) {
		super(nombre, maximoEstudiantes);
	}
	
	public boolean agregarAlumno(Alumno alumno) {
		return (tieneFamiliar(alumno) && super.agregarAlumno(alumno));
	}
	
	/*
	private boolean tieneFamiliar(Alumno alumno) {
		for (int i = 0; i < alumno.getFamilia().size(); i++) {
			if (this.getAlumnos().contains(alumno.getFamilia().get(i))) {
				return true;
			}
		}
		return false;
	}
	*/
	
	private boolean tieneFamiliar(Alumno alumno) {
		boolean encontro = false;
		int i = 0;
		while (!(encontro) && i < alumno.getFamilia().size()) {
			if (this.getAlumnos().contains(alumno.getFamilia().get(i))) {
				encontro = true;
			}
			i++;
		}
		return encontro;
	}
	
	
}
