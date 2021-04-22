package ejercicio3;

import java.util.ArrayList;

public class Cereal {

	private String name;
	private ArrayList<Mineral> minerales = new ArrayList<Mineral>();

	public Cereal(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<Mineral> getMinerales() {
		return minerales;
	}

	public void setMinerales(ArrayList<Mineral> minerales) {
		this.minerales = minerales;
	}
	
	public void addMineral(Mineral mineral) {
		minerales.add(mineral);
	}

}
