package ejercicio11.criterio;

import ejercicio11.Seguro;

public class CriterioNot implements Criterio{
    Criterio criterio;

    public CriterioNot(Criterio criterio) {
        this.criterio = criterio;
    }

    @Override
    public boolean cumple(Seguro seguro) {
        return !criterio.cumple(seguro);
    }
}
