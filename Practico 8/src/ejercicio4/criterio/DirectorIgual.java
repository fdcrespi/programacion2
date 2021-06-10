package ejercicio4.criterio;

import ejercicio4.Pelicula;

import java.util.Locale;

public class DirectorIgual implements Criterio{
    private String director;

    public DirectorIgual(String director) {
        this.director = director;
    }

    @Override
    public boolean cumple(Pelicula peli) {
        return peli.getDirector().toLowerCase().equals(director.toLowerCase());
    }
}
