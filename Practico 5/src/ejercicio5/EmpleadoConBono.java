package ejercicio5;

public class EmpleadoConBono extends Empleado {

	private int cantVentas;
	private double ventasMinimas;
	private double bono;
	
	public EmpleadoConBono(String nombre, String apellido, int dni, double sueldo, double ventasMinimas, double bono) {
		super(nombre, apellido, dni, sueldo);
		this.ventasMinimas = ventasMinimas;
		this.bono = bono;
	}

	public double getVentasMinimas() {
		return ventasMinimas;
	}

	public void setVentasMinimas(double ventasMinimas) {
		this.ventasMinimas = ventasMinimas;
	}

	public double getBono() {
		return bono;
	}

	public void setBono(double bono) {
		this.bono = bono;
	}
	
	public double sueldo() {
		if (cantVentas >= ventasMinimas) {
			return super.sueldo() + bono;
		}
		return super.sueldo();
	}
	
}
