package ejercicio4;

import ejercicio4.condicion.*;

import javax.print.Doc;
import java.util.ArrayList;

public class Historiador {
    private String nombre;
    private ArrayList<Documento> documentos;

    public Historiador(String nombre) {
        this.nombre = nombre;
        documentos = new ArrayList<Documento>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void addDocumentos(Documento documento){
        if(!documentos.contains(documento)) documentos.add(documento);
    }

    public ArrayList<Documento> documentosCumplen(Condicion condicion){
        ArrayList<Documento> documentosOk = new ArrayList<Documento>();
        for (Documento d: documentos) {
            if(condicion.cumple(d)) documentosOk.add(d);
        }
        return documentosOk;
    }
}
