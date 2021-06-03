package ejercicio13.criterioEstacion;

import ejercicio13.Estacion;

public class CriterioAnd implements CriterioEstacion{
    CriterioEstacion criterio1;
    CriterioEstacion criterio2;

    public CriterioAnd(CriterioEstacion criterio1, CriterioEstacion criterio2) {
        this.criterio1 = criterio1;
        this.criterio2 = criterio2;
    }

    @Override
    public boolean cumple(Estacion e) {
        return criterio1.cumple(e) && criterio2.cumple(e);
    }
}
