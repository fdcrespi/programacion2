package ejercicio2;

import java.util.Objects;

public class Computadora implements Comparable<Computadora> {
    public int id;
    public Proceso proceso;
    public double velocidad;

    public Computadora(int id, double velocidad) {
        this.id = id;
        this.velocidad = velocidad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }

    @Override
    public boolean equals(Object o) {
        Computadora computadora = (Computadora) o;
        return this.getId() == computadora.getId();
    }

    public Proceso getProceso() {
        return proceso;
    }

    private void setProceso(Proceso proceso) {
        this.proceso = proceso;
    }

    @Override
    public int compareTo(Computadora o) {
        return (int) getVelocidad() - (int) o.getVelocidad();
    }

    @Override
    public String toString() {
        return "Computadora{" +
                "id=" + id +
                ", velocidad=" + velocidad +
                '}';
    }

    public boolean realizarProceso(Proceso proceso) {
        if (getProceso() == null) {
            setProceso(proceso);
            return true;
        }
        return false;
    }
}
