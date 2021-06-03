package ejercicio5;

import ejercicio5.criterio.Criterio;
import ejercicio5.criterio.CriterioAnd;
import ejercicio5.criterio.CriterioFechaModificacionMayor;
import ejercicio5.criterio.CriterioNombre;

import java.time.LocalDate;
import java.util.ArrayList;

public class FileSystem {

    public ArrayList<ElementoFS> elementosFS;

    public FileSystem() {
        this.elementosFS = new ArrayList<>();
    }

    public ArrayList<ElementoFS> buscar(Criterio criterio) {
        ArrayList<ElementoFS> elementosCumplen = new ArrayList<>();
        for (ElementoFS e : elementosFS) {
            elementosCumplen.addAll(e.buscar(criterio));
        }
        return elementosCumplen;
    }

    public void add(ElementoFS elemento) {
        if (!elementosFS.contains(elemento)) elementosFS.add(elemento);
    }

    public static void main(String[] args) {
        FileSystem fs = new FileSystem();
        Directorio carpeta1 = new Directorio("Carpeta");
        Archivo archivo1 = new Archivo("foto1.jpg", 280);
        Comprimido archivoRar = new Comprimido("archivo1.rar", archivo1, 2);
        carpeta1.addElemento(archivo1);
        carpeta1.addElemento(archivoRar);
        fs.add(carpeta1);

        Criterio buscarTitulo = new CriterioNombre("1");
        System.out.println(fs.buscar(buscarTitulo));

        Criterio fecha = new CriterioFechaModificacionMayor(LocalDate.of(2021, 05, 18));
        System.out.println(fs.buscar(fecha));

        Criterio and = new CriterioAnd(buscarTitulo, fecha);
        System.out.println(fs.buscar(and));
    }
}
