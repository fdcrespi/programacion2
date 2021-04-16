package ejercicio3;

public class Empleado {

	private String nombre;
	private String apellido;
	private int cuit;
	private double salario;

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

	public int getCuit() {
		return cuit;
	}

	public void setCuit(int cuit) {
		this.cuit = cuit;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public Empleado(String nombre, String apellido, int cuit){
		this.nombre = nombre;
		this.apellido = apellido;
		this.cuit = cuit;
		this.salario = 0;
	}

	public Empleado(String nombre, String apellido, int cuit, double salario) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.cuit = cuit;
		this.salario = salario;
	}
	
	

}
