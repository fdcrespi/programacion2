package ejercicio13.criterioEstacion;

import ejercicio13.Estacion;

public class PromedioLluviasMayor implements CriterioEstacion{
    private int dias;
    private double promedio;

    public PromedioLluviasMayor(int dias, double promedio) {
        this.dias = dias;
        this.promedio = promedio;
    }

    @Override
    public boolean cumple(Estacion e) {
        return e.promedioLLuvias(dias) > promedio;
    }
}
