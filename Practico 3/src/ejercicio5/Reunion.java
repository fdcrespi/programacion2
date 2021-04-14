package ejercicio5;

import java.time.LocalDate;

public class Reunion {

	private LocalDate fecha = LocalDate.now();
	private int horaInicio;
	private int duracion;
	private String tema;
	private String lugar;
	private Persona[] participantes;
	
	public LocalDate getFecha() {
		return fecha;
	}
	
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	
	public int getHoraInicio() {
		return horaInicio;
	}
	
	public void setHoraInicio(int horaInicio) {
		this.horaInicio = horaInicio;
	}
	
	public int getDuracion() {
		return duracion;
	}
	
	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}
	
	public String getTema() {
		return tema;
	}
	
	public void setTema(String tema) {
		this.tema = tema;
	}
	
	public String getLugar() {
		return lugar;
	}
	
	public void setLugar(String lugar) {
		this.lugar = lugar;
	}
	
	public boolean yaExiste(Reunion reunion) {
		return (this.fecha == reunion.fecha && this.horaInicio == reunion.horaInicio);
	}	
	
	public void agregarParticipante(Persona persona) {
		this.participantes[this.participantes.length - 1] = persona;
	}
	
}
