package ejercicio4;

import java.time.LocalDate;

public class Masajista extends Integrante {

	public String titulo;
	public int experiencia;

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getExperiencia() {
		return experiencia;
	}

	public void setExperiencia(int experiencia) {
		this.experiencia = experiencia;
	}
	
	public Masajista(String nombre, String apellido, LocalDate fechaNac, String titulo, int experiencia){
		super(nombre, apellido, fechaNac);
		this.titulo = titulo;
		this.experiencia = experiencia;
	}

}
