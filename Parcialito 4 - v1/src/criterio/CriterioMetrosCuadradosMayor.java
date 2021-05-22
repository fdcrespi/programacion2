package criterio;

import app.Comercio;

public class CriterioMetrosCuadradosMayor implements Criterio{
    private double metros;

    public CriterioMetrosCuadradosMayor(double metros) {
        this.metros = metros;
    }

    @Override
    public boolean cumple(Comercio c) {
        return c.getMetrosCuadrados() > metros;
    }
}
