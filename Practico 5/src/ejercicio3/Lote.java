package ejercicio3;

import java.util.ArrayList;

public class Lote {

	private int numeroLote;
	private ArrayList<Mineral> minerales = new ArrayList<Mineral>();
	private double superficie;

	public Lote(int numeroLote, double superficie) {
		this.numeroLote = numeroLote;
		this.superficie = superficie;
	}

	public int getNumeroLote() {
		return numeroLote;
	}

	public void setNumeroLote(int numeroLote) {
		this.numeroLote = numeroLote;
	}

	public ArrayList<Mineral> getMinerales() {
		return minerales;
	}

	public void setMinerales(ArrayList<Mineral> minerales) {
		this.minerales = minerales;
	}

	public double getSuperficie() {
		return superficie;
	}

	public void setSuperficie(double superficie) {
		this.superficie = superficie;
	}
	
	public void addMineral(Mineral mineral) {
		minerales.add(mineral);
	}

}
