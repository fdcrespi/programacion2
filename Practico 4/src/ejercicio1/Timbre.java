package ejercicio1;

public class Timbre {

	private boolean sonando;
	
	public boolean isSonando() {
		return sonando;
	}

	public Timbre() {
		sonando = false;
	}
	
	public void hacerSonar() {
		if (!(this.isSonando())){
			sonando = true;
		}
	}
	
	public void callar() {
		if(sonando) {
			sonando = false;
		}
	}
}
