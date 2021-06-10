package ejercicio1.criterio;

import ejercicio1.Agroquimico;
import ejercicio1.Cultivo;

public class aplicableCultivo implements Criterio{
    private Cultivo cultivo;

    public aplicableCultivo(Cultivo cultivo) {
        this.cultivo = cultivo;
    }

    @Override
    public boolean cumple(Agroquimico a) {
        return a.desaconsejableEnCultivo(cultivo);
    }
}
