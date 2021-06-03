package ejercicio13.criterioEstacion;

import ejercicio13.Estacion;

public class UltimaTemperaturaMayor implements CriterioEstacion{
    private int temperatura;

    public UltimaTemperaturaMayor(int temperatura) {
        this.temperatura = temperatura;
    }

    @Override
    public boolean cumple(Estacion e) {
        return e.ultimaTemperatura() > temperatura;
    }
}
