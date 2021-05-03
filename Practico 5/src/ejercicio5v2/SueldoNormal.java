package ejercicio5v2;

public class SueldoNormal extends CalculoSueldo {

	private double montoSueldo;
	
	private SueldoNormal(double montoSueldo) {
		this.montoSueldo = montoSueldo;
	}
	
	@Override
	public double getSueldo() {
		// TODO Auto-generated method stub
		return montoSueldo;
	}

}
