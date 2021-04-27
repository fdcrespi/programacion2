package ejercicio3;

import java.util.ArrayList;

public class Cooperativa {

	private String nombre;
	private int cuit;
	private ArrayList<Lote> lotes = new ArrayList<Lote>();
	private ArrayList<Cereal> cereales = new ArrayList<Cereal>();
	private ArrayList<String> mineralesPrimarios = new ArrayList<String>();
	//private ArrayList<String> mineralesSecundarios = new ArrayList<String>();

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

	public ArrayList<Cereal> cerealEnLote(Lote lote) {
		ArrayList<Cereal> cerealesOk = new ArrayList<Cereal>();
		for (int i = 0; i < this.cereales.size(); i++) {
			/* NO HACER
			if(contieneMinerales(lote, cereales.get(i))) {
				cerealesOk.add(cereales.get(i));
			}
			*/
			if(cereales.get(i).sirveParaLote(lote)) {
				cerealesOk.add(cereales.get(i));
			}
		}
		return cerealesOk;
	}
	
	public ArrayList<Lote> lotesParaCereal(Cereal cereal){
		ArrayList<Lote> lotesOk = new ArrayList<Lote>();
		for (int i = 0; i < this.lotes.size(); i++) {
			if(cereal.sirveParaLote(lotes.get(i))) {
				lotesOk.add(lotesOk.get(i));
			}		
		}
		return lotesOk;
	}
	
	public boolean esEspecial(Lote lote) {
		for (int i = 0; i < mineralesPrimarios.size(); i++) {
			if(lote.contieneMineral(mineralesPrimarios.get(i))) {
				return true;
			}
		}
		return false;
	}
}
