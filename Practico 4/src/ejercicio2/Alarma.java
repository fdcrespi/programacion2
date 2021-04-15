package ejercicio2;

import java.util.ArrayList;

public class Alarma {
	ArrayList<Sensor> sensores = new ArrayList<Sensor>();
	private Timbre timbre;


	public Timbre getTimbre() {
		return timbre;
	}
	
	public void setTimbre(Timbre timbre) {
		this.timbre = timbre;
	}

	public Alarma() {
	}
	
	public boolean comprobar() {
		for (int i = 0; i < sensores.size(); i++) {
			if (sensores.get(i).isDetectado()) {
				this.timbre.hacerSonar();
				System.out.println(this.sensores.get(i).getZona());
				return true;
			}
		}
		return false;
	}

}
