package ejercicio3;

public class EmpleadoPorComision extends Empleado {

	private int cantidadVentas;
	private double porcentaje;

	public int getCantidadVentas() {
		return cantidadVentas;
	}

	public void setCantidadVentas(int cantidadVentas) {
		this.cantidadVentas = cantidadVentas;
	}

	public double getPorcentaje() {
		return porcentaje;
	}

	public void setPorcentaje(double porcentaje) {
		this.porcentaje = porcentaje;
	}
	
	public EmpleadoPorComision(String nombre, String apellido, int cuit) {
		super(nombre, apellido, cuit);
		cantidadVentas = 0;
		porcentaje = 0;
	}
	
	public EmpleadoPorComision(String nombre, String apellido, int cuit, double salario) {
		super(nombre, apellido, cuit, salario);
		cantidadVentas = 0;
		porcentaje = 0;
	}
	
	public EmpleadoPorComision(String nombre, String apellido, int cuit, double salario, double porcentaje) {
		super(nombre, apellido, cuit, salario);
		cantidadVentas = 0;
		this.porcentaje = porcentaje;
	}
	
	public double getSalario() {
		return (super.getSalario() * (1 + (cantidadVentas * (porcentaje / 100))));
	}

}
