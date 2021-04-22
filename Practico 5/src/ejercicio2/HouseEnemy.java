package ejercicio2;

import java.util.ArrayList;

public class HouseEnemy extends House {
	private ArrayList<House> enemies = new ArrayList<House>();

	public ArrayList<House> getEnemies() {
		return enemies;
	}

	public void setEnemies(ArrayList<House> enemies) {
		this.enemies = enemies;
	}

	public HouseEnemy(String nameHouse, int maxStudents, ArrayList<Quality> qualities) {
		super(nameHouse, maxStudents, qualities);
		// TODO Auto-generated constructor stub
	}

	public HouseEnemy(String nameHouse, int maxStudents) {
		super(nameHouse, maxStudents);
		// TODO Auto-generated constructor stub
	}
	
	public boolean addAlumn(Alumn alumn) {
		for (int i = 0; i < enemies.size(); i++) {
			if (enemies.get(i).addAlumn(alumn)) {
				alumn.setHouse(null);
				System.out.println("El alumno puede ser aceptado por nuestros enemigos");
				return false;
			}
		}
		alumn.setHouse(this);
		return true;
	}
	
}
