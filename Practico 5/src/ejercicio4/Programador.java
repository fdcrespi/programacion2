package ejercicio4;

public class Programador extends Contribuyente {
	
	private double facturado;
	private static double porcFacturado;
	private static double porcMontoFijo;
	
	public Programador(String nombre, int identificacionTributaria, double montoFijo) {
		super(nombre, identificacionTributaria, montoFijo);
		facturado = 0;
		porcFacturado = 2;
		porcMontoFijo = 20;
	}

	public double montoFijo() {
		return (getMontoFijo() * porcMontoFijo / 100) + (facturado * porcFacturado / 100);
	}

}
