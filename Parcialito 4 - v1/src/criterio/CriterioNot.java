package criterio;

import app.Comercio;

public class CriterioNot implements Criterio{
    private Criterio criterio;

    public CriterioNot(Criterio criterio) {
        this.criterio = criterio;
    }

    @Override
    public boolean cumple(Comercio c) {
        return !criterio.cumple(c);
    }
}
