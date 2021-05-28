package ejercicio4;

import ejercicio4.criterio.*;

import java.time.LocalTime;
import java.util.ArrayList;

public class Streaming {
    ArrayList<Pelicula> peliculas;

    public Streaming() {
        peliculas = new ArrayList<>();
    }

    public void addPelicula(Pelicula peli){
        if(!peliculas.contains(peli))
            peliculas.add(peli);
    }

    public ArrayList<Pelicula> getPeliculas(Criterio c) {
        ArrayList<Pelicula> pelis = new ArrayList<>();
        for (Pelicula p: peliculas) {
            if(c.cumple(p))
                pelis.add(p);
        }
        return pelis;
    }

    public static void main(String[] args) {
        Streaming plataforma = new Streaming();
        Pelicula peli1 = new Pelicula("Red Social", "la pelicula de facebook", "David Fincher", 2010, LocalTime.of(02, 01));
        Pelicula peli2 = new Pelicula("Toy Story 3", "Historia de Andy, Woody y sus amigos", "Lee Unkrich", 2010, LocalTime.of(01,48, 25));
        Pelicula peli3 = new Pelicula("El espantatiburones", "Pez que limpia lenguas", "Martin Scorsese", 2004, LocalTime.of(01, 31, 55));
        Pelicula peli4 = new Pelicula("En busca de la felicidad", "Hombre busca trabajo", "abriele Muccino", 2006, LocalTime.of(01, 57));
        peli1.addGenero("drama");
        peli1.addGenero("Ficcion historica");
        peli2.addGenero("infantil");
        peli2.addGenero("comedia");
        peli3.addGenero("infantil");
        peli4.addGenero("drama");

        peli3.addActor("Will Smith");
        peli4.addActor("Will Smith");

        plataforma.addPelicula(peli1);
        plataforma.addPelicula(peli2);
        plataforma.addPelicula(peli3);
        plataforma.addPelicula(peli4);

        /*TituloContiene buscarTitulo = new TituloContiene("ci");
        System.out.println(plataforma.getPeliculas(buscarTitulo));*/
        /*GeneroIgual generoIgual = new GeneroIgual("infantil");
        System.out.println(plataforma.getPeliculas(generoIgual));*/
        /*ContieneActor contieneActor = new ContieneActor("Will Smith");
        CriterioNot criterioNot = new CriterioNot(new DirectorIgual("martin Scorsese"));
        CriterioAnd criterioAnd = new CriterioAnd(contieneActor, criterioNot);
        System.out.println(plataforma.getPeliculas(criterioAnd));*/
        EstrenoMenor estrenoMenor = new EstrenoMenor(2010);
        TiempoMenor tiempoMenor = new TiempoMenor(LocalTime.of(1, 35));
        CriterioAnd criterioAnd = new CriterioAnd(estrenoMenor, tiempoMenor);
        System.out.println(plataforma.getPeliculas(criterioAnd));

        peli1.esRentable(new CriterioAnd(new TiempoMenor(LocalTime.of(0,45)), new GeneroIgual("infantil")));

    }
}
