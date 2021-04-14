package ejercicio4;

public class Episodio {

	private String titulo;
	private String descripcion;
	private boolean flag;
	private int calificacion, calificacionMin = 1, calificacionMax = 5;
	
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
	
	public boolean isFlag() {
		return flag;
	}
	
	public void setFlag(boolean flag) {
		this.flag = flag;
	}
	
	public int getCalificacion() {
		return calificacion;
	}
	
	public void setCalificacion(int calificacion) {
		this.calificacion = calificacion;
	}
	
	public void calificar(int calificacion) {
		if (calificacion >= calificacionMin && calificacion <= calificacionMax) {
			this.calificacion = calificacion;
		} else {
			System.out.println("La calificación ingresada es incorrecta");
		}
	}
	
	public boolean fueVisto() {
		return this.flag;
	}
	
}
