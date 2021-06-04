package ejercicio3;

import java.time.LocalDate;
import java.util.Objects;

public class Alquiler {
    private LocalDate fecha;
    private int cancha;
    private double precio;

    public Alquiler(LocalDate fecha, int cancha, double precio) {
        this.fecha = fecha;
        this.cancha = cancha;
        this.precio = precio;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public int getCancha() {
        return cancha;
    }

    public void setCancha(int cancha) {
        this.cancha = cancha;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public boolean equals(Object o) {
        Alquiler alquiler = (Alquiler) o;
        return cancha == alquiler.cancha && fecha.equals(alquiler.fecha);
    }

}
