package ejercicio3;

public class Pastura extends Cereal {
	private double superficieMinima;

	public Pastura(String name, double superficieMinima) {
		super(name);
		this.superficieMinima = superficieMinima;
	}
	
	public Pastura(String name) {
		super(name);
		superficieMinima = 0;
	}

	public double getSuperficieMinima() {
		return superficieMinima;
	}

	public void setSuperficieMinima(double superficieMinima) {
		this.superficieMinima = superficieMinima;
	}
	
	public boolean sirveParaLote(Lote lote) {
		return ((superficieMinima > lote.getSuperficie()) && super.sirveParaLote(lote));
	}
	
}
