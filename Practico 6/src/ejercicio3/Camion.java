package ejercicio3;

import java.time.LocalDate;

public class Camion implements Comparable<Camion>{
    public String patente;
    public LocalDate fechaCarga;

    public Camion(String patente, LocalDate fechaCarga) {
        this.patente = patente;
        this.fechaCarga = fechaCarga;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public LocalDate getFechaCarga() {
        return fechaCarga;
    }

    public void setFechaCarga(LocalDate fechaCarga) {
        this.fechaCarga = fechaCarga;
    }

    @Override
    public boolean equals(Object o) {
        Camion camion = (Camion) o;
        return getPatente().equals(camion.getPatente());
    }

    @Override
    public int compareTo(Camion o) {
        return getFechaCarga().compareTo(o.getFechaCarga());
    }
}
