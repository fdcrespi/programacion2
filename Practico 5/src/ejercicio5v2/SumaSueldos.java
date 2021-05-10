package ejercicio5v2;

public class SumaSueldos extends CalculoSueldo {

	private CalculoSueldo sueldo1;
	private CalculoSueldo sueldo2;
	
	private SumaSueldos (CalculoSueldo sueldo1, CalculoSueldo sueldo2) {
		this.sueldo1 = sueldo1;
		this.sueldo2 = sueldo2;
	}
	
	public double getSueldo() {
		return sueldo1.getSueldo() + sueldo2.getSueldo();
	}
}
