package ejercicio2.criterio;

import ejercicio2.Ficha;

public class CriterioNot implements Criterio {
    private Criterio criterio;

    public CriterioNot(Criterio criterio) {
        this.criterio = criterio;
    }

    @Override
    public boolean cumple(Ficha f) {
        return !criterio.cumple(f);
    }
}
