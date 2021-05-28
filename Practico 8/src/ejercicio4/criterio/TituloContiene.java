package ejercicio4.criterio;

import ejercicio4.Pelicula;

import java.util.Locale;

public class TituloContiene implements Criterio{
    private String palabra;

    public TituloContiene(String palabra) {
        this.palabra = palabra;
    }

    @Override
    public boolean cumple(Pelicula peli) {
        return peli.getTitulo().toLowerCase().contains(palabra.toLowerCase());
    }
}
