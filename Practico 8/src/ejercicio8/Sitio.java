package ejercicio8;

import ejercicio8.criterioNoticia.CriterioNoticia;
import ejercicio8.criterioNoticia.LinkNoticiaContiene;
import ejercicio8.criterioNoticia.NoticiaConPalabraClave;
import ejercicio8.criterioNoticia.TituloNoticia;

import java.util.ArrayList;

public class Sitio {
    private ArrayList<Contenido> contenidos;

    public Sitio() {
        this.contenidos = new ArrayList<>();
    }

    public void addContenido(Contenido contenido){
        contenidos.add(contenido);
    }

    public ArrayList<Noticia> buscar(CriterioNoticia criterio){
        ArrayList<Noticia> noticias = new ArrayList<>();
        for (Contenido c: contenidos) {
            noticias.addAll(c.noticiasCumplen(criterio));
        }
        return noticias;
    }

    public Contenido getCopia(String palabra){
        for (Contenido c: contenidos) {
            return c.copia(new NoticiaConPalabraClave(palabra));
        }
        return null;
    }

    public void imprimirPath(){
        for (Contenido c: contenidos){
            for (String s: c.imprimirse()) {
                System.out.println(s);
            }
        }
    }

    public static void main(String[] args) {
        /*
        Generales
        Generales\Espectáculos
        Generales\Espectáculos\Link 1
        Generales\Espectáculos\Divorcios
        Generales\Espectáculos\Divorcios\Link 2
        Generales\Espectáculos\Divorcios\Link 3
        Generales\Deportes
        Generales\Deportes\Fútbol
        Generales\Deportes\Fútbol\Link 4
        Generales\Deportes\Link 5
        Generales\Link 6
         */
        Sitio sitio = new Sitio();
        Categoria generales = new Categoria("Generales");
        Categoria espectaculos = new Categoria("Espectaculos");
        Noticia noticia1 = new Noticia("Noti1", "intronoti1","noticia 1", "yo", "Link 1");
        espectaculos.addContenido(noticia1);
        generales.addContenido(espectaculos);
        Categoria divorcios = new Categoria("Divorcios");
        Noticia noticia2 = new Noticia("Noti2", "intronoti2","noticia 2", "yo", "Link 2");
        Noticia noticia3 = new Noticia("Noti3", "intronoti3","noticia 3", "yo", "Link 3");
        noticia3.addPalabraClave("noti");
        divorcios.addContenido(noticia2);
        divorcios.addContenido(noticia3);
        generales.addContenido(divorcios);
        //System.out.println(generales.imprimirse());
        sitio.addContenido(generales);
        sitio.imprimirPath();
        //System.out.println(sitio.buscar(new LinkNoticiaContiene("3")));
        Contenido copia = sitio.getCopia("noti");
        System.out.println(copia);
    }
}
