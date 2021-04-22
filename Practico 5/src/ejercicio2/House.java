package ejercicio2;

import java.util.ArrayList;

public class House {
	private String nameHouse;
	private int maxStudents;
	private ArrayList<Quality> qualities = new ArrayList<Quality>();
	private ArrayList<Alumn> alumns = new ArrayList<Alumn>();

	public House(String nameHouse, int maxStudents) {
		this.nameHouse = nameHouse;
		this.maxStudents = maxStudents;
	}

	public House(String nameHouse, int maxStudents, ArrayList<Quality> qualities) {
		this.nameHouse = nameHouse;
		this.maxStudents = maxStudents;
		this.qualities = qualities;
	}

	public String getNameHouse() {
		return nameHouse;
	}

	public void setNameHouse(String nameHouse) {
		this.nameHouse = nameHouse;
	}

	public int getMaxStudents() {
		return maxStudents;
	}

	public void setMaxStudents(int maxStudents) {
		this.maxStudents = maxStudents;
	}

	public ArrayList<Quality> getQualities() {
		return qualities;
	}

	public void setQualities(ArrayList<Quality> qualities) {
		this.qualities = qualities;
	}

	public void addQuality(Quality quality) {
		qualities.add(quality);
	}

	public void deleteQuality(Quality quality) {
		qualities.remove(quality);
	}

	public boolean addAlumn(Alumn alumn) {
		if (maxStudents != alumns.size()) {
			if (alumn.getHouse() != null) {
				System.out.println("El alumno ya tiene casa");
				return false;
			} else {
				if (includeQuality(alumn)) {
					alumn.setHouse(this);
					System.out.println("Alumno agregado con exito"); 
					return true;
				} else {
					System.out.println("El alumno no posee las cualidades necesarias"); 
					return false;
				}
			}
		} else {
			System.out.println("La casa esta llena"); 
			return false;
		}
	}

	private boolean includeQuality(Alumn alumn) {
		ArrayList<Quality> qualitiesAlumn = alumn.getQualities();
		for (int i = 0; i < qualitiesAlumn.size(); i++) {
			if (!(qualities.contains(qualitiesAlumn.get(i)))) {
				return false;
			}
		}
		return true;
	}
}
