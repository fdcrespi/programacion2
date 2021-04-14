package ejercicio3;

public class PuntoGeometrico {

	private double x = 0;
	private double y = 0;

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}
	
	public PuntoGeometrico(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public void desplazar(double x, double y) {
		this.x += x;
		this.y += y;
	}
	
	public double distanciaEuclidea(PuntoGeometrico punto) {
		return Math.sqrt((Math.pow(this.x - punto.getX(), 2) + Math.pow(this.y - punto.getY(), 2)));
	}

	public static void main(String[] args) {

	}
}