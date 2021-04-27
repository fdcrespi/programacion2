package ejercicio5v2;

public class Empleado {

	private String nombre;
	private String apellido;
	private int dni;
	private double sueldo;

	public Empleado(String nombre, String apellido, int dni, double sueldo) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.sueldo = sueldo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}
	
	public double sueldo() {
		return sueldo;
	}

}
