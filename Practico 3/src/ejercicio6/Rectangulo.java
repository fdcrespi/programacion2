package ejercicio6;

public class Rectangulo {
	
	PuntoGeometrico vertice;
	private Lado base;
	private Lado altura;
		
	public PuntoGeometrico getVertice() {
		return vertice;
	}

	public void setVertice(PuntoGeometrico vertice) {
		this.vertice = vertice;
	}

	public Lado getBase() {
		return base;
	}

	public Lado getAltura() {
		return altura;
	}

	public Rectangulo(PuntoGeometrico vertice1, PuntoGeometrico vertice2, PuntoGeometrico vertice3, PuntoGeometrico vertice4) {
		this.vertice = vertice1;
		this.base.setLongitud(vertice2.distanciaEuclidea(vertice1));
		this.altura.setLongitud(vertice3.distanciaEuclidea(vertice1));
	}
	
	public Rectangulo(PuntoGeometrico punto, Lado base, Lado altura) {
		this.vertice = punto;
		this.base = base;
		this.altura = altura;
	}
	
	public void transladarRectangulo(double x, double y) {
		vertice.desplazar(x, y);
	}
	
	public double area() {
		return (this.base.getLongitud() * this.altura.getLongitud());
	}
	
	
	public int esMayor(Rectangulo rect) {
		if (rect.area() > this.area()) {
			return 1;
		} else if (rect.area() == this.area()) {
			return 0;
		} else return -1;
	}
	
	public boolean esCuadrado() {
		return (this.base.getLongitud() == this.altura.getLongitud());
	}
	
	/**
	 * @return Si ambos son iguales, retorna 0, es decir que es un cuadrado
	 */
	public double ladoSuperior() {
		if (this.esCuadrado()) {
			return 0;
		}
		if (this.base.getLongitud() > this.altura.getLongitud()) {
			return this.base.getLongitud();
		}
		return this.altura.getLongitud();
	}
	
	public String orientacion() {
		if (this.base.getLongitud() > this.altura.getLongitud()) {
			return "acostado";
		} else if(this.esCuadrado()) {
			return "cuadrado";
		} return "parado";
	}
}