package App.criterio;

import App.ElementoLibreria;

public class CriterioVolumenMenor implements CriterioElemento{
    private double volumen;

    public CriterioVolumenMenor(double volumen) {
        this.volumen = volumen;
    }

    @Override
    public boolean cumple(ElementoLibreria elemento) {
        return elemento.getVolumen()<volumen;
    }
}
