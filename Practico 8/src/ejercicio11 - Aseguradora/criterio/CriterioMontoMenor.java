package ejercicio11.criterio;

import ejercicio11.Seguro;

public class CriterioMontoMenor implements Criterio{
    private double monto;

    public CriterioMontoMenor(double monto) {
        this.monto = monto;
    }

    @Override
    public boolean cumple(Seguro seguro) {
        return seguro.getMonto() < monto;
    }
}
