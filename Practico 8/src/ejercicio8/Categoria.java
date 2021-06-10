package ejercicio8;

import ejercicio8.criterioNoticia.CriterioNoticia;

import java.util.ArrayList;

public class Categoria implements Contenido{
    private String descripcion;
    private String imagen;
    private ArrayList<Contenido> contenidos;

    public Categoria(String descripcion) {
        this.descripcion = descripcion;
        this.imagen = null;
        contenidos = new ArrayList<>();
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public void addContenido(Contenido contenido){
        contenidos.add(contenido);
    }

    @Override
    public int cantidadNoticias() {
        int cant = 0;
        for (Contenido c: contenidos) {
            cant+=c.cantidadNoticias();
        };
        return cant;
    }

    @Override
    public ArrayList<String> imprimirse() {
        ArrayList<String> palabras = new ArrayList<>();
        String desc = descripcion;
        palabras.add(desc);
        for (Contenido c: contenidos) {
            for(String hijos: c.imprimirse()){
                String continuacion = desc + "/" + hijos;
                palabras.add(continuacion);
            }
        }
        return palabras;
    }

    @Override
    public ArrayList<Noticia> noticiasCumplen(CriterioNoticia criterio) {
        ArrayList<Noticia> noticiasOk = new ArrayList<>();
        for (Contenido c: contenidos) {
            noticiasOk.addAll(c.noticiasCumplen(criterio));
        }
        return noticiasOk;
    }

    @Override
    public Contenido copia(CriterioNoticia criterioPalabra) {
        ArrayList<Contenido> hijosContenido = new ArrayList<>();
        for (Contenido c: contenidos){
            if (c.copia(criterioPalabra) != null)
                hijosContenido.add(c.copia(criterioPalabra));
        }
        if(!hijosContenido.isEmpty()){ //Porque el ejercicio pide que si no tiene nada, puede que no
            Categoria categoriaCopia = new Categoria(getDescripcion());
            for (Contenido h: hijosContenido) {
                categoriaCopia.addContenido(h);
            }
            return categoriaCopia;
        }
        return null;
    }

    @Override
    public String toString() {
        return descripcion + "/" + contenidos;
    }
}
