package ejercicio4.criterio;

import ejercicio4.Pelicula;

public class ContieneActor implements Criterio{
    private String actor;

    public ContieneActor(String actor) {
        this.actor = actor;
    }

    @Override
    public boolean cumple(Pelicula peli) {
        return peli.contieneActor(actor);
    }
}
