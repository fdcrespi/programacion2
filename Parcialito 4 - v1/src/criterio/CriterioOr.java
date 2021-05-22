package criterio;

import app.Comercio;

public class CriterioOr implements Criterio{
    private Criterio criterio1;
    private Criterio criterio2;

    public CriterioOr(Criterio criterio1, Criterio criterio2) {
        this.criterio1 = criterio1;
        this.criterio2 = criterio2;
    }

    @Override
    public boolean cumple(Comercio c) {
        return criterio1.cumple(c) || criterio2.cumple(c);
    }
}
