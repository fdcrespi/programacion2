package ejercicio4;

public class ContribuyenteVentas extends Contribuyente {
	
	private double facturado;
	private double porcFacturado;
	private double porcMontoFijo;
	
	public ContribuyenteVentas(String nombre, int identificacionTributaria, double montoFijo, double porcFacturado, double porcMontoFijo) {
		super(nombre, identificacionTributaria, montoFijo);
		facturado = 0;
		this.porcFacturado = porcFacturado;
		this.porcMontoFijo = porcMontoFijo;
	}

	public double getImpuesto() {
		return (super.getImpuesto() * porcMontoFijo / 100) + (facturado * porcFacturado / 100);
	}

}
