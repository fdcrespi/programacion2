package ejercicio13;

import java.time.LocalTime;
import java.util.Objects;

public class Lluvia {
    private LocalTime hora;
    private double mm;

    public Lluvia(double mm) {
        this.mm = mm;
        hora = LocalTime.now();
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    public double getMm() {
        return mm;
    }

    public void setMm(double mm) {
        this.mm = mm;
    }

    @Override
    public boolean equals(Object o) {
        Lluvia lluvia = (Lluvia) o;
        return hora.equals(lluvia.hora);
    }
}
