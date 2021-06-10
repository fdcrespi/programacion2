package ejercicio4.criterio;

import ejercicio4.Pelicula;

public class GeneroIgual implements Criterio{
    private String genero;

    public GeneroIgual(String genero) {
        this.genero = genero;
    }

    @Override
    public boolean cumple(Pelicula peli) {
        return peli.contieneGenero(genero);
    }
}
