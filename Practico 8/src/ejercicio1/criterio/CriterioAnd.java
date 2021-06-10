package ejercicio1.criterio;

import ejercicio1.Agroquimico;

public class CriterioAnd implements Criterio{
    private Criterio criterio1;
    private Criterio criterio2;

    public CriterioAnd(Criterio criterio1, Criterio criterio2) {
        this.criterio1 = criterio1;
        this.criterio2 = criterio2;
    }

    @Override
    public boolean cumple(Agroquimico a) {
        return criterio1.cumple(a) && criterio2.cumple(a);
    }
}
