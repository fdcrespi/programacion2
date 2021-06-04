package ejercicio13.criterioEstacion;

import ejercicio13.Estacion;
import ejercicio13.Sensor;

public class UltimaRegistroMayor implements CriterioEstacion{
    private double humedad;

    public UltimaRegistroMayor(double humedad) {
        this.humedad = humedad;
    }

    @Override
    public boolean cumple(Sensor s) {
        return s.ultimoRegistro() > humedad;
    }
}
