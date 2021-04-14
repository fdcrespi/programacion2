package ejercicio4;

public class Temporada {

	private int numero;
	private String titulo;
	private Episodio[] episodios;
	
	public int getNumero() {
		return numero;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public boolean completada() {
		return (this.episodiosVistos() == this.episodios.length);
	}
	
	/**
	 * @return Devuelve la cantidad de episodios vistos de una temporada
	 */
	public int episodiosVistos() {
		int cantidad = 0;
		for (int i = 0; i < episodios.length; i++) {
			if (episodios[i].fueVisto()) {
				cantidad++;
			}
		}
		return cantidad;
	}
	
	/**
	 * @return Devuelve 0 en caso de que ningun episodio de la temporada haya sido visto.
	 * Y solo hace el promedio de aquellos episodios que se hayan visto.
	 */
	public double promedioCalificaciones() {
		if (this.episodiosVistos() == 0) {
			return 0;
		}
		return this.sumaCalificaciones() / this.episodiosVistos();
	}
	
	public int sumaCalificaciones() {
		int sumaCalificaciones = 0;
		for (int i = 0; i < episodios.length; i++) {
			if (episodios[i].getCalificacion() > 0) {
				sumaCalificaciones += episodios[i].getCalificacion();
			}
		}
		return sumaCalificaciones;
	}
	
}
