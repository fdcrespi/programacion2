package ejercicio8.criterioNoticia;

import ejercicio8.Noticia;

public class LinkNoticiaContiene implements CriterioNoticia{
    private String link;

    public LinkNoticiaContiene(String link) {
        this.link = link;
    }

    @Override
    public boolean cumple(Noticia noticia) {
        return noticia.getLink().toLowerCase().contains(link.toLowerCase());
    }
}
