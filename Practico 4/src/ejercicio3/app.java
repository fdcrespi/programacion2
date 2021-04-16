package ejercicio3;

public class app {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmpleadoPorHora empleado = new EmpleadoPorHora("federico", "crespi", 353341856, 500, 100);
		empleado.setHorasTrabajadas(50);
		System.out.println(empleado.getSalario());
		System.out.println("--------");
		EmpleadoPorComision empleado2 = new EmpleadoPorComision("bautista", "crespi", 57166950, 1000, 20);
		empleado2.setCantidadVentas(2);
		System.out.println(empleado2.getSalario());
	}

}
