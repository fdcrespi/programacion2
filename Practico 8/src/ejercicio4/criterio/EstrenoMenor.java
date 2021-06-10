package ejercicio4.criterio;

import ejercicio4.Pelicula;

public class EstrenoMenor implements Criterio{
    private int estreno;

    public EstrenoMenor(int estreno) {
        this.estreno = estreno;
    }

    @Override
    public boolean cumple(Pelicula peli) {
        return peli.getAnio() < estreno;
    }
}
