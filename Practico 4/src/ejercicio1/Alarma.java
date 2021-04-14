package ejercicio1;

public class Alarma {

	private boolean vidrioRoto, puertaAbierta, ventanaAbierta;
	private Timbre timbre;

	public boolean isVidrioRoto() {
		return vidrioRoto;
	}

	public void setVidrioRoto(boolean vidrioRoto) {
		this.vidrioRoto = vidrioRoto;
	}

	public boolean isPuertaAbierta() {
		return puertaAbierta;
	}

	public void setPuertaAbierta(boolean puertaAbierta) {
		this.puertaAbierta = puertaAbierta;
	}

	public boolean isVentanaAbierta() {
		return ventanaAbierta;
	}

	public void setVentanaAbierta(boolean ventanaAbierta) {
		this.ventanaAbierta = ventanaAbierta;
	}

	public Timbre getTimbre() {
		return timbre;
	}
	
	public void setTimbre(Timbre timbre) {
		this.timbre = timbre;
	}

	public Alarma() {
		vidrioRoto = false;
		puertaAbierta = false;
		ventanaAbierta = false;
	}
	
	public boolean comprobar() {
		return (vidrioRoto && puertaAbierta && ventanaAbierta);
	}

	public void sonar() {
		if (this.comprobar()){
			this.timbre.hacerSonar();
		}
	}
}
