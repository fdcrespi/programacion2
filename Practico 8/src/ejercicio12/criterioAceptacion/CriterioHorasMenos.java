package ejercicio12.criterioAceptacion;

import ejercicio12.OfertaLaboral;

public class CriterioHorasMenos implements CriterioAceptacion{
    private int horas;

    public CriterioHorasMenos(int horas) {
        this.horas = horas;
    }

    @Override
    public boolean cumple(OfertaLaboral oferta) {
        return oferta.getHorasSemanales() < horas;
    }
}
