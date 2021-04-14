package ejercicio1;

public class AlarmaLuminosa extends Alarma {
	
	private Luz luz;

	public Luz getLuz() {
		return luz;
	}

	public void setLuz(Luz luz) {
		this.luz = luz;
	}

	public AlarmaLuminosa() {
		super();
	}
	
	public void encenderLuz() {
		luz.encender();
	}
	
	
}
