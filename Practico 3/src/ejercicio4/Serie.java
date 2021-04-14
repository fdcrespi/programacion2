package ejercicio4;

public class Serie {
	
	private String titulo;
	private String descripcion;
	private String creador;
	private String genero;
	private Temporada[] temporadas;
	
	public String getTitulo() {
		return titulo;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public String getDescripcion() {
		return descripcion;
	}
	
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	public String getCreador() {
		return creador;
	}
	
	public void setCreador(String creador) {
		this.creador = creador;
	}
	
	public String getGenero() {
		return genero;
	}
	
	public void setGenero(String genero) {
		this.genero = genero;
	}

	public Serie(String titulo, String descripcion, String creador, String genero) {
		this.titulo = titulo;
		this.descripcion = descripcion;
		this.creador = creador;
		this.genero = genero;
	}
	
	public int episodiosVistos() {
		int cantidad = 0;
		for (int i = 0; i < temporadas.length; i++) {
			cantidad += temporadas[i].episodiosVistos();
		}
		return cantidad;
	}
	
	/**
	 * @return Compara la cantidad de episodios vistos de una temporada con su cantidad de episodios
	 */
	public boolean completada() {
		for (int i = 0; i < temporadas.length; i++) {
			if (!(temporadas[i].completada())) {
				return false;
			}
		}
		return true;
	}
	
	/**
	 * @return 0 en caso de que ningun episodio haya sido visto, dado que la calificacion nunca es 0
	 */
	public double promedioCalificaciones(){
		int episodiosVistos = 0;
		int calificaciones = 0;
		for (int i = 0; i < temporadas.length; i++) {
			episodiosVistos += temporadas[i].episodiosVistos();
			calificaciones += temporadas[i].sumaCalificaciones();
		}
		if (episodiosVistos == 0) {
			return 0;
		}
		return calificaciones / episodiosVistos;
	}
}