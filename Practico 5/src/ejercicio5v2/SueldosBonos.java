package ejercicio5v2;

public class SueldosBonos extends CalculoSueldo {

	private int cantVentas;
	private int ventasMinimas;
	private double bono;
	
	public SueldosBonos(double bono, int ventasMinimas, int cantVentas) {
		this.bono = bono;
		this.ventasMinimas = ventasMinimas;
		this.cantVentas = cantVentas;
	}
	
	@Override
	public double getSueldo() {
		// TODO Auto-generated method stub
		if (cantVentas >= ventasMinimas) {
			return bono;
		}
		return 0;
	}

}
