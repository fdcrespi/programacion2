package ejercicio13.criterioEstacion;

import ejercicio13.Estacion;
import ejercicio13.Sensor;

public class CriterioNot implements CriterioEstacion{
    CriterioEstacion criterio;

    public CriterioNot(CriterioEstacion criterio) {
        this.criterio = criterio;
    }

    @Override
    public boolean cumple(Sensor s) {
        return !criterio.cumple(s);
    }
}
