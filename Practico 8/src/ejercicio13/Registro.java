package ejercicio13;

import java.time.LocalTime;
import java.util.Objects;

public class Registro {
    private LocalTime hora;
    private int valor;

    public Registro(int valor) {
        hora = LocalTime.now();
        this.valor = valor;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    @Override
    public boolean equals(Object o) {
        Registro registro = (Registro) o;
        return getHora().equals(registro.getHora()) && getValor() == registro.getValor();
    }

}
