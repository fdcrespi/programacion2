package ejercicio12.criterioAceptacion;

import ejercicio12.OfertaLaboral;

public class CriterioMontoMayor implements CriterioAceptacion{
    private double monto;

    public CriterioMontoMayor(double monto) {
        this.monto = monto;
    }

    @Override
    public boolean cumple(OfertaLaboral oferta) {
        return oferta.getMonto() >= monto;
    }
}
