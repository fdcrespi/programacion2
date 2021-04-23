package ejercicio3;

import java.util.ArrayList;

public class Cooperativa {

	private String nombre;
	private int cuit;
	private ArrayList<Lote> lotes = new ArrayList<Lote>();
	private ArrayList<Cereal> cereales = new ArrayList<Cereal>();
	private ArrayList<Mineral> mineralesPrimarios = new ArrayList<Mineral>();
	private ArrayList<Mineral> mineralesSecundarios = new ArrayList<Mineral>();

	public Cooperativa(String nombre) {
		this.nombre = nombre;
	}
	
	public Cooperativa(String nombre, int cuit) {
		this.nombre = nombre;
		this.cuit = cuit;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCuit() {
		return cuit;
	}

	public void setCuit(int cuit) {
		this.cuit = cuit;
	}

	public ArrayList<Lote> getLotes() {
		return lotes;
	}

	public void setLotes(ArrayList<Lote> lotes) {
		this.lotes = lotes;
	}

	public ArrayList<Cereal> getMinerales() {
		return cereales;
	}

	public void setMinerales(ArrayList<Cereal> cereales) {
		this.cereales = cereales;
	}

	public ArrayList<Mineral> getMineralesPrimarios() {
		return mineralesPrimarios;
	}

	public void setMineralesPrimarios(ArrayList<Mineral> mineralesPrimarios) {
		this.mineralesPrimarios = mineralesPrimarios;
	}

	public ArrayList<Mineral> getMineralesSecundarios() {
		return mineralesSecundarios;
	}

	public void setMineralesSecundarios(ArrayList<Mineral> mineralesSecundarios) {
		this.mineralesSecundarios = mineralesSecundarios;
	}

	public ArrayList<Cereal> cerealEnLote(Lote lote) {
		ArrayList<Cereal> cerealesOk = new ArrayList<Cereal>();
		for (int i = 0; i < this.cereales.size(); i++) {
			if(contieneMinerales(lote, cereales.get(i))) {
				cerealesOk.add(cereales.get(i));
			}
		}
		return cerealesOk;
	}
	
	private boolean contieneMinerales(Lote lote, Cereal cereal) {
		return lote.getMinerales().containsAll(cereal.getMinerales());
	}
	
	public ArrayList<Lote> lotesParaCereal(Cereal cereal){
		ArrayList<Lote> lotesOk = new ArrayList<Lote>();
		for (int i = 0; i < this.lotes.size(); i++) {
			if(contieneMinerales(lotes.get(i), cereal)) {
				lotesOk.add(lotes.get(i));
			}
		}
		return lotesOk;
	}
	
	public boolean lotePrimario(Lote lote) {
		return lote.getMinerales().containsAll(mineralesPrimarios);
	}
	
	public boolean loteSecundario(Lote lote) {
		return !(lotePrimario(lote));
	}
}
