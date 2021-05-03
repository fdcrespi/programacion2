package ejercicio5v2;

public class SueldoVentas extends CalculoSueldo {

	private double porcVentas;
	private double totalVentas;
	
	public SueldoVentas(double totalVentas, double porcVentas) {
		this.porcVentas = porcVentas;
		this.totalVentas = totalVentas;
	}
	
	@Override
	public double getSueldo() {
		// TODO Auto-generated method stub
		return totalVentas * porcVentas / 100;
	}

}
