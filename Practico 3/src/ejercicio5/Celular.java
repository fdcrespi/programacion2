package ejercicio5;

public class Celular {

	private Persona propietario;
	private Persona[] contactos;

	public Persona getPropietario() {
		return propietario;
	}

	public void setPropietario(Persona propietario) {
		this.propietario = propietario;
	}
	
	public void agregarContacto(Persona persona) {
		this.contactos[this.contactos.length - 1] = persona;
	}

}
