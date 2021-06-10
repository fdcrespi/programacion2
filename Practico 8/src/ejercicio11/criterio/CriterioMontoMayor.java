package ejercicio11.criterio;

import ejercicio11.Seguro;

public class CriterioMontoMayor implements Criterio{
    private int monto;

    public CriterioMontoMayor(int monto) {
        this.monto = monto;
    }

    @Override
    public boolean cumple(Seguro seguro) {
        return seguro.getMonto() > monto;
    }
}
