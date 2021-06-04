package ejercicio13.criterioEstacion;

import ejercicio13.Estacion;
import ejercicio13.Sensor;

public class CriterioOr implements CriterioEstacion{
    CriterioEstacion criterio1;
    CriterioEstacion criterio2;

    public CriterioOr(CriterioEstacion criterio1, CriterioEstacion criterio2) {
        this.criterio1 = criterio1;
        this.criterio2 = criterio2;
    }

    @Override
    public boolean cumple(Sensor s) {
        return criterio1.cumple(s) || criterio2.cumple(s);
    }
}
