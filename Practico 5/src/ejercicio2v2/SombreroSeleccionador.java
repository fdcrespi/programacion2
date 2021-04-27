package ejercicio2v2;

public class SombreroSeleccionador {

	public String asignarCasa(Alumno alumno, Casa casa) {
		if (casa.agregarAlumno(alumno)) {
			return "Al alumno: " + alumno.getNombre() + "Se le asigno la casa: " + casa.getNombre();
		} 
		return "El alumno no cumple con las conficiones necesarias";
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

}
