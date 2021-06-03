package ejercicio8.criterioNoticia;

import ejercicio8.Noticia;

public class AutorNoticia implements CriterioNoticia{
    private String autor;

    public AutorNoticia(String autor) {
        this.autor = autor;
    }

    @Override
    public boolean cumple(Noticia noticia) {
        return noticia.getAutor().toLowerCase().equals(autor.toLowerCase());
    }
}
