package ejercicio13.criterioEstacion;

import ejercicio13.Estacion;

public class PromedioTemperaturasMayor implements CriterioEstacion{
    private int promedio;
    private int dias;

    public PromedioTemperaturasMayor(int promedio, int dias) {
        this.promedio = promedio;
        this.dias = dias;
    }

    @Override
    public boolean cumple(Estacion e) {
        return e.promediosUltimasTemp(dias) > promedio;
    }
}
