package ejercicio3;

import java.util.Objects;

public class Barco implements Comparable<Barco> {
    public int id;
    public Camion camionAsignado;
    public double capacidad;

    public Barco(int id, double capacidad) {
        this.id = id;
        this.capacidad = capacidad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Camion getCamionAsignado() {
        return camionAsignado;
    }

    public void setCamionAsignado(Camion camionAsignado) {
        this.camionAsignado = camionAsignado;
    }

    public double getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(double capacidad) {
        this.capacidad = capacidad;
    }

    @Override
    public boolean equals(Object o) {
        Barco barco = (Barco) o;
        return getId() == barco.getId();
    }

    @Override
    public int compareTo(Barco o) {
        return (int) getCapacidad() - (int) o.getCapacidad();
    }

    public boolean cargar(Camion camion){
        if (getCamionAsignado() == null){
            setCamionAsignado(camion);
            return true;
        }
        return false;
    }
}
