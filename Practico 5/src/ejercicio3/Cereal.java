package ejercicio3;

import java.util.ArrayList;

public class Cereal {

	private String name;
	private ArrayList<String> minerales;
	
	public Cereal(String name) {
		this.name = name;
		minerales = new ArrayList<String>();
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void addMineral(String mineral) {
		if (!(minerales.contains(mineral.toLowerCase()))) {
			minerales.add(mineral.toLowerCase());
		}
	}
	
	public void removeMineral(String mineral) {
		minerales.remove(mineral.toLowerCase());
	}
	
	public boolean sirveParaLote(Lote lote) {
		for (int i = 0; i < minerales.size(); i++) {
			if(!(lote.contieneMineral(minerales.get(i).toLowerCase()))) {
				return false;
			}
		}
		return true;
	}

	public boolean contieneMineral(String mineral) {
		// TODO Auto-generated method stub
		return minerales.contains(mineral.toLowerCase());
	}

}
