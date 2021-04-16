package ejercicio3;

public class EmpleadoPorHora extends Empleado {

	private double horasTrabajadas;
	private double montoPorHora;

	public double getHorasTrabajadas() {
		return horasTrabajadas;
	}

	public void setHorasTrabajadas(double horasTrabajadas) {
		this.horasTrabajadas = horasTrabajadas;
	}

	public double getMontoPorHora() {
		return montoPorHora;
	}

	public void setMontoPorHora(double montoPorHora) {
		this.montoPorHora = montoPorHora;
	}
	
	public EmpleadoPorHora(String nombre, String apellido, int cuit) {
		super(nombre, apellido, cuit);
		horasTrabajadas = 0;
		montoPorHora = 0;
	}
	
	public EmpleadoPorHora(String nombre, String apellido, int cuit, double salario) {
		super(nombre, apellido, cuit, salario);
		horasTrabajadas = 0;
		montoPorHora = 0;
	}
	
	public EmpleadoPorHora(String nombre, String apellido, int cuit, double salario, double montoPorHora) {
		super(nombre, apellido, cuit, salario);
		horasTrabajadas = 0;
		this.montoPorHora = montoPorHora;
	}
	
	public double getSalario() {
		return (super.getSalario() + horasTrabajadas * montoPorHora);
	}

	
}
