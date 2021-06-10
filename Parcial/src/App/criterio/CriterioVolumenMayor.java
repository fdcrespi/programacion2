package App.criterio;

import App.ElementoLibreria;

public class CriterioVolumenMayor implements CriterioElemento{
    private double volumen;

    public CriterioVolumenMayor(double volumen) {
        this.volumen = volumen;
    }

    @Override
    public boolean cumple(ElementoLibreria elemento) {
        return elemento.getVolumen()>volumen;
    }
}
