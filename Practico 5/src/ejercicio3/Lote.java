package ejercicio3;

import java.util.ArrayList;

public class Lote {

	private int numeroLote;
	private ArrayList<String> minerales;
	private double superficie;

	public Lote(int numeroLote, double superficie) {
		this.numeroLote = numeroLote;
		this.superficie = superficie;
		minerales = new ArrayList<String>();
	}

	public int getNumeroLote() {
		return numeroLote;
	}

	public void setNumeroLote(int numeroLote) {
		this.numeroLote = numeroLote;
	}

	public double getSuperficie() {
		return superficie;
	}

	public void setSuperficie(double superficie) {
		this.superficie = superficie;
	}
	
	public void addMineral(String mineral) {
		if (!(minerales.contains(mineral.toLowerCase()))) {
			minerales.add(mineral);
		}
	}
	
	public void removeMineral(String mineral) {
		minerales.remove(mineral.toLowerCase());
	}

	public boolean contieneMineral(String string) {
		// TODO Auto-generated method stub
		return minerales.contains(string.toLowerCase());
	}

	public boolean sirveParaCereal(Cereal cereal) {
		// TODO Auto-generated method stub
		for (int i = 0; i < minerales.size(); i++) {
			if(!(cereal.contieneMineral(minerales.get(i)))) {
				return false;
			}
			
		}
		return true;
	}

	public boolean esEspecial(ArrayList<String> mineralesPrimarios) {
		// TODO Auto-generated method stub
		return minerales.containsAll(mineralesPrimarios);
	}
	
	

}
