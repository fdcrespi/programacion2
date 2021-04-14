package ejercicio5;

public class Agenda {

	private Persona propietario;
	private Reunion[] reuniones;
	private Persona[] contactos;
	
	private boolean estaLibre(Reunion reunion) {
		for (int i = 0; i < this.reuniones.length; i++) {
			if (this.reuniones[i].yaExiste(reunion)) {
				return false;
			}
		}
		return true;
	}
	
	public void agregarReunion (Reunion reunion) {
		if (this.estaLibre(reunion)) {
			this.reuniones[this.reuniones.length - 1] = reunion;
		}
	}
	
	public void agregarPersona (Persona persona) {
		this.contactos[this.contactos.length - 1] = persona;
	}

	public Persona getPropietario() {
		return propietario;
	}

	public void setPropietario(Persona propietario) {
		this.propietario = propietario;
	}
	
	
}
