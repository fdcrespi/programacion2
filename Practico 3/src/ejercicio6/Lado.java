package ejercicio6;

public class Lado {

	private double longitud;
	private String orientacion;

	public double getLongitud() {
		return longitud;
	}

	public void setLongitud(double longitud) {
		this.longitud = longitud;
	}

	public String getOrientacion() {
		return orientacion;
	}

	public void setOrientacion(String orientacion) {
		this.orientacion = orientacion;
	}
	
	public Lado(double longitud, String orientacion) {
		this.longitud = longitud;
		this.orientacion = orientacion;
	}

}
