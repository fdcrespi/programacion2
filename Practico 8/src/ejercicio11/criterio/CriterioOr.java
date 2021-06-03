package ejercicio11.criterio;

import ejercicio11.Seguro;

public class CriterioOr implements Criterio{
    Criterio criterio1;
    Criterio criterio2;

    public CriterioOr(Criterio criterio1, Criterio criterio2) {
        this.criterio1 = criterio1;
        this.criterio2 = criterio2;
    }

    @Override
    public boolean cumple(Seguro seguro) {
        return criterio1.cumple(seguro) || criterio2.cumple(seguro);
    }
}
