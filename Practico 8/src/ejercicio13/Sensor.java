package ejercicio13;

import java.time.LocalTime;
import java.util.Objects;

public class Sensor {
    private LocalTime hora;
    private double temperatura;
    private double humedad;
    private double viento;

    public Sensor(double temperatura, double humedad, double viento) {
        this.temperatura = temperatura;
        this.humedad = humedad;
        this.viento = viento;
        hora = LocalTime.now();
    }

    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    public double getHumedad() {
        return humedad;
    }

    public void setHumedad(double humedad) {
        this.humedad = humedad;
    }

    public double getViento() {
        return viento;
    }

    public void setViento(double viento) {
        this.viento = viento;
    }

    public LocalTime getHora() {
        return hora;
    }

    @Override
    public boolean equals(Object o) {
        Sensor sensor = (Sensor) o;
        return getHora().equals(sensor.getHora());
    }

}
