package criterio;

import app.Comercio;

public class CriterioEspacioLibre implements Criterio{
    @Override
    public boolean cumple(Comercio c) {
        return c.isEspacioLibre();
    }
}
