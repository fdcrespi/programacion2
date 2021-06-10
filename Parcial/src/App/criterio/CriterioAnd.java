package App.criterio;

import App.ElementoLibreria;

public class CriterioAnd implements CriterioElemento{
    private CriterioElemento criterio1;
    private CriterioElemento criterio2;

    public CriterioAnd(CriterioElemento criterio1, CriterioElemento criterio2) {
        this.criterio1 = criterio1;
        this.criterio2 = criterio2;
    }

    @Override
    public boolean cumple(ElementoLibreria elemento) {
        return criterio1.cumple(elemento) && criterio2.cumple(elemento);
    }
}
