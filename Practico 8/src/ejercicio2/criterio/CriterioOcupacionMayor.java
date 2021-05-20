package ejercicio2.criterio;

import ejercicio2.Ficha;

public class CriterioOcupacionMayor implements Criterio{
    private int ocupacion;

    public CriterioOcupacionMayor(int ocupacion) {
        this.ocupacion = ocupacion;
    }

    @Override
    public boolean cumple(Ficha f) {
        return f.getCantidadCasilleros() > ocupacion;
    }
}
