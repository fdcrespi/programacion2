package ejercicio3;

public class Rectangulo {
	
	PuntoGeometrico[] puntos;
	private int cantLados = 4;
	
	public int getCantLados() {
		return cantLados;
	}
	
	public void setCantLados(int cantLados) {
		this.cantLados = cantLados;
	}
	
	public Rectangulo(double x, double y, double x1, double y1) {
		this.puntos[0] = new PuntoGeometrico(x,y);
		this.puntos[1] = new PuntoGeometrico(x1, y);
		this.puntos[2] = new PuntoGeometrico(x,y1);
		this.puntos[3] = new PuntoGeometrico(x1,y1);
	}
	
	public void transladarRectangulo(double x, double y) {
		for (int i = 0; i < puntos.length; i++) {
			puntos[i].desplazar(x, y);
		}
	}
	
	public double area() {
		return (this.base() * this.altura());
	}
	
	public double base() {
		return (this.puntos[1].distanciaEuclidea(this.puntos[0]));
	}
	
	public double altura() {
		return (this.puntos[1].distanciaEuclidea(this.puntos[3]));
	}
	
	public int esMayor(Rectangulo rect) {
		if (rect.area() > this.area()) {
			return 1;
		} else if (rect.area() == this.area()) {
			return 0;
		} else return -1;
	}
	
	public boolean esCuadrado() {
		return (this.base() == this.altura());
	}
	
	public double ladoSuperior() {
		return (this.base());
	}
	
	public String orientacion() {
		if (this.base() > this.altura()) {
			return "acostado";
		} else if(this.esCuadrado()) {
			return "cuadrado";
		} return "parado";
	}
}