package ejercicio2;

import java.util.ArrayList;

public class Alumn {

	private String name;
	private ArrayList<Alumn> family = new ArrayList<Alumn>();
	private ArrayList<Quality> qualities = new ArrayList<Quality>();
	private House house;

	public Alumn(String name) {
		this.name = name;
		family = null;
		qualities = null;
		house = null;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void addQuality(Quality quality) {
		qualities.add(quality);
	}
	
	public void deleteQuality(Quality quality) {
		qualities.remove(quality);
	}
	
	public void addFamily(Alumn alumn) {
		family.add(alumn);
	}

	public void deleteFamily(Alumn alumn) {
		family.remove(alumn);
	}

	public ArrayList<Alumn> getFamily() {
		return family;
	}

	public void setFamily(ArrayList<Alumn> family) {
		this.family = family;
	}

	public ArrayList<Quality> getQualities() {
		return qualities;
	}

	public void setQualities(ArrayList<Quality> qualities) {
		this.qualities = qualities;
	}

	public House getHouse() {
		return house;
	}

	public void setHouse(House house) {
		this.house = house;
	}
	
	
	
	
}
