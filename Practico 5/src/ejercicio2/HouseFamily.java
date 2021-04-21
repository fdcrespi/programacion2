package ejercicio2;

import java.util.ArrayList;

public class HouseFamily extends House {

	public HouseFamily(String nameHouse, int maxStudents, ArrayList<Quality> qualities) {
		super(nameHouse, maxStudents, qualities);
		// TODO Auto-generated constructor stub
	}

	public HouseFamily(String nameHouse, int maxStudents) {
		super(nameHouse, maxStudents);
		// TODO Auto-generated constructor stub
	}
	
	public boolean addAlumn(Alumn alumn) {
		ArrayList<Alumn> familyAlumn = alumn.getFamily();
		for (int i = 0; i < familyAlumn.size(); i++) {
			if(familyAlumn.get(i).getHouse() == this) {
				return super.addAlumn(alumn);
			}
		}
		System.out.println("El alumno no posee familiares en la casa");
		return false;
	}
}
