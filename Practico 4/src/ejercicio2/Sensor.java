package ejercicio2;

public class Sensor {

	private String zona;
	private boolean detectado;

	public String getZona() {
		return zona;
	}

	public void setZona(String zona) {
		this.zona = zona;
	}
	
	
	public boolean isDetectado() {
		return detectado;
	}

	public void setDetectado(boolean detectado) {
		this.detectado = detectado;
	}

	public Sensor (String zona) {
		this.zona = zona;
	}
}
