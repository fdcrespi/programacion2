package ejercicio1;

public class Luz {

	private boolean estado;

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

	public Luz() {
		this.estado = false;
	}
	
	public void encender() {
		if (!(estado)) {
			this.estado = true;
		}
	}
	
	public void apagar() {
		if(estado) {
			this.estado = false;
		}
	}
}
