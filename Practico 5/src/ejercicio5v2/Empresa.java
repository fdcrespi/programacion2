package ejercicio5v2;

import java.util.ArrayList;

public class Empresa {

	private String nombre;
	private int cuit;
	private ArrayList<Empleado> empleados;

	public Empresa(String nombre, int cuit) {
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
	
	public void addEmpleado(Empleado empleado) {
		empleados.add(empleado);
	}
	
	public double gastosSueldos() {
		double sueldos = 0;
		for (int i = 0; i < empleados.size(); i++) {
			sueldos += empleados.get(i).getSueldo();
		}
		return sueldos;
	}
}
