package ejercicio5;

import ejercicio5.criterio.Criterio;
import ejercicio5.criterio.CriterioNombre;

import java.util.ArrayList;

public class FileSystem {

    public ArrayList<ElementoFS> elementosFS;

    public ArrayList<ElementoFS> buscar(Criterio criterio){
        ArrayList<ElementoFS> elementosCumplen = new ArrayList<>();
        for (ElementoFS e: elementosFS) {
            if(criterio.cumple(e)){
                elementosCumplen.add(e);
            }
        }
        return elementosCumplen;
    }

    public void add(ElementoFS elementoFS){
        if(!elementosFS.contains(elementoFS)){
            elementosFS.add(elementoFS);
        }
    }

    public static void main(String[] args) {
        FileSystem fs = new FileSystem();
        Directorio carpeta1 = new Directorio("Carpeta");
        Archivo archivo1 = new Archivo("foto1.jpg",280);
        Comprimido archivoRar = new Comprimido("archivo1.rar", archivo1, 2);
        carpeta1.addElemento(archivo1);
        carpeta1.addElemento(archivoRar);
        fs.add(carpeta1);

        Criterio buscarTitulo = new CriterioNombre("1");
        System.out.println(fs.buscar(buscarTitulo));
    }
}
