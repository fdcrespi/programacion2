package ejercicio2.criterio;

import ejercicio2.Ficha;

public class CriterioFortalezaMayor implements Criterio{
    private int fortaleza;

    public CriterioFortalezaMayor(int fortaleza) {
        this.fortaleza = fortaleza;
    }

    @Override
    public boolean cumple(Ficha f) {
        return f.getFortaleza() > fortaleza;
    }
}
