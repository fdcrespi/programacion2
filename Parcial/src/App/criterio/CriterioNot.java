package App.criterio;

import App.ElementoLibreria;

public class CriterioNot implements CriterioElemento{
    private CriterioElemento criterio;

    public CriterioNot(CriterioElemento criterio) {
        this.criterio = criterio;
    }

    @Override
    public boolean cumple(ElementoLibreria elemento) {
        return !criterio.cumple(elemento);
    }
}
