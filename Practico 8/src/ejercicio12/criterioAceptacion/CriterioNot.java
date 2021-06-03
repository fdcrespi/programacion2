package ejercicio12.criterioAceptacion;

import ejercicio12.OfertaLaboral;

public class CriterioNot implements CriterioAceptacion{
    CriterioAceptacion criterioAceptacion;

    public CriterioNot(CriterioAceptacion criterioAceptacion) {
        this.criterioAceptacion = criterioAceptacion;
    }

    @Override
    public boolean cumple(OfertaLaboral oferta) {
        return !criterioAceptacion.cumple(oferta);
    }
}
