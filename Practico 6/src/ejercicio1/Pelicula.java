package ejercicio1;

public class Pelicula implements Item {

    public String titulo;
    public String filmografia;
    public int copiasDisponibles;

    public Pelicula(String titulo, String filmografia, int copiasDisponibles) {
        this.titulo = titulo;
        this.filmografia = filmografia;
        this.copiasDisponibles = copiasDisponibles;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getFilmografia() {
        return filmografia;
    }

    public void setFilmografia(String filmografia) {
        this.filmografia = filmografia;
    }

    public int getCopiasDisponibles() {
        return copiasDisponibles;
    }

    public void setCopiasDisponibles(int copiasDisponibles) {
        this.copiasDisponibles = copiasDisponibles;
    }

    @Override
    public boolean aptoAlquiler() {
        return copiasDisponibles > 0;
    }

    @Override
    public boolean alquilar() {
        if (aptoAlquiler()) {
            setCopiasDisponibles(copiasDisponibles--);
            return true;
        }
        return false;
    }

    @Override
    public boolean equals(Object o) {
        Pelicula pelicula = (Pelicula) o;
        return getTitulo().equals(pelicula.getTitulo());
    }

    @Override
    public String toString() {
        return "Pelicula{" +
                "titulo='" + titulo + '\'' +
                ", copiasDisponibles=" + copiasDisponibles +
                '}';
    }
}
