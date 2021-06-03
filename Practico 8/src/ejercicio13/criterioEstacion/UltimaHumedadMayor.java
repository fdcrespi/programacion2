package ejercicio13.criterioEstacion;

import ejercicio13.Estacion;

public class UltimaHumedadMayor implements CriterioEstacion{
    private double humedad;

    public UltimaHumedadMayor(double humedad) {
        this.humedad = humedad;
    }

    @Override
    public boolean cumple(Estacion e) {
        return e.ultimaHumedad() > humedad;
    }
}
