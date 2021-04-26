package ejercicio4;

public class Comerciante extends Contribuyente {

	private double ventas;
	private static double porcVentas;
	private static double porcMontoFijo;

	public Comerciante(String nombre, int identificacionTributaria, double montoFijo) {
		super(nombre, identificacionTributaria, montoFijo);
		this.ventas = 0;
		porcVentas = 3.5;
		porcMontoFijo = 50;
	}

	public double getVentas() {
		return ventas;
	}

	public void setVentas(double ventas) {
		this.ventas = ventas;
	}

	public double montoFijo() {
		return (getMontoFijo() * porcMontoFijo / 100) + (ventas * porcVentas * 100); 
	}

}
