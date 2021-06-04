package ejercicio11.criterio;

import ejercicio11.Seguro;

public class CriterioPoliza implements Criterio{
    private int poliza;

    public CriterioPoliza(int poliza) {
        this.poliza = poliza;
    }

    @Override
    public boolean cumple(Seguro seguro) {
        return seguro.getPoliza() == poliza;
    }
}
