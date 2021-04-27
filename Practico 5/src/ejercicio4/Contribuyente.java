package ejercicio4;

public class Contribuyente {

	private String nombre;
	private int identificacionTributaria;
	private double montoFijo;

	public Contribuyente(String nombre, int identificacionTributaria, double montoFijo) {
		this.nombre = nombre;
		this.identificacionTributaria = identificacionTributaria;
		this.montoFijo = montoFijo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	protected double getMontoFijo() {
		return montoFijo;
	}

	public int getIdentificacionTributaria() {
		return identificacionTributaria;
	}

	public void setIdentificacionTributaria(int identificacionTributaria) {
		this.identificacionTributaria = identificacionTributaria;
	}
	
	public double getImpuesto() {
		return montoFijo;
	}
	
}
