package criterio;

import app.Comercio;

public class CriterioRubro implements Criterio{
    private String rubro;

    public CriterioRubro(String rubro) {
        this.rubro = rubro;
    }

    @Override
    public boolean cumple(Comercio c) {
        return c.getRubro().toLowerCase().equals(rubro.toLowerCase());
    }
}
