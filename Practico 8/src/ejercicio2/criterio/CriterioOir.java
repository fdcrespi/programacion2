package ejercicio2.criterio;

import ejercicio2.Ficha;

public class CriterioOir implements Criterio{
    private Criterio criterio1;
    private Criterio criterio2;

    public CriterioOir(Criterio criterio1, Criterio criterio2) {
        this.criterio1 = criterio1;
        this.criterio2 = criterio2;
    }

    @Override
    public boolean cumple(Ficha f) {
        return criterio1.cumple(f) || criterio2.cumple(f);
    }
}
