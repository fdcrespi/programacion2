package ejercicio13.criterioEstacion;

import ejercicio13.Estacion;

public class CriterioNot implements CriterioEstacion{
    CriterioEstacion criterio;

    public CriterioNot(CriterioEstacion criterio) {
        this.criterio = criterio;
    }

    @Override
    public boolean cumple(Estacion e) {
        return !criterio.cumple(e);
    }
}
