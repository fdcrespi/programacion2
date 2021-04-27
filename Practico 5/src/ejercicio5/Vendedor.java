package ejercicio5;

public class Vendedor extends Empleado {

	private double porcVentas;
	private double ventas;

	public Vendedor(String nombre, String apellido, int dni, double sueldo, double ventas, double porcVentas) {
		super(nombre, apellido, dni, sueldo);
		this.porcVentas = porcVentas;
	}

	public double getPorcVentas() {
		return porcVentas;
	}

	public void setPorcVentas(double porcVentas) {
		this.porcVentas = porcVentas;
	}
	
	public double sueldo() {
		return super.sueldo() +  (ventas * porcVentas / 100) ;
	}
	
	
}
