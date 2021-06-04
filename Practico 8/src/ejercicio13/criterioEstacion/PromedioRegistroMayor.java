package ejercicio13.criterioEstacion;

import ejercicio13.Sensor;

public class PromedioRegistroMayor implements CriterioEstacion{
    private int promedio;
    private int dias;

    public PromedioRegistroMayor(int promedio, int dias) {
        this.promedio = promedio;
        this.dias = dias;
    }

    @Override
    public boolean cumple(Sensor s) {
        return s.promediosUltimosNRegistros(dias) > promedio;
    }
}
