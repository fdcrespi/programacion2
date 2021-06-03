package ejercicio13.criterioEstacion;

import ejercicio13.Estacion;

public class UltimaLluviaMayor implements CriterioEstacion{
    private int mm;

    public UltimaLluviaMayor(int mm) {
        this.mm = mm;
    }

    @Override
    public boolean cumple(Estacion e) {
        return e.ultimaLluvia() > mm;
    }
}
