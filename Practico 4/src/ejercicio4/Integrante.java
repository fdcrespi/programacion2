package ejercicio4;

import java.time.LocalDate;

public class Integrante {

	private String nombre;
	private String apellido;
	private int pasaporte;
	private LocalDate fechaNac;
	private String estado;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public LocalDate getFechaNac() {
		return fechaNac;
	}

	public void setFechaNac(LocalDate fechaNac) {
		this.fechaNac = fechaNac;
	}

	public int getPasaporte() {
		return pasaporte;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Integrante(String nombre, String apellido, LocalDate fechaNac) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechaNac = fechaNac;
		this.pasaporte = 0;
		this.estado = "";
	}

	public Integrante(String nombre, String apellido, LocalDate fechaNac, int pasaporte) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechaNac = fechaNac;
		this.pasaporte = pasaporte;
		this.estado = "";
	}

}
