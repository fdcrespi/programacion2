package ejercicio12.criterioAceptacion;

import ejercicio12.OfertaLaboral;

public class CriterioAnd implements CriterioAceptacion{
    CriterioAceptacion criterio1;
    CriterioAceptacion criterio2;

    public CriterioAnd(CriterioAceptacion criterio1, CriterioAceptacion criterio2) {
        this.criterio1 = criterio1;
        this.criterio2 = criterio2;
    }

    @Override
    public boolean cumple(OfertaLaboral oferta) {
        return criterio1.cumple(oferta) && criterio2.cumple(oferta);
    }
}
