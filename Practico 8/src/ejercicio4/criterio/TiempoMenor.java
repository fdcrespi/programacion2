package ejercicio4.criterio;

import ejercicio4.Pelicula;

import java.time.LocalTime;

public class TiempoMenor implements Criterio{
    private LocalTime tiempo;

    public TiempoMenor(LocalTime tiempo) {
        this.tiempo = tiempo;
    }

    @Override
    public boolean cumple(Pelicula peli) {
        return peli.getDuracion().compareTo(tiempo) < 0;
    }
}
