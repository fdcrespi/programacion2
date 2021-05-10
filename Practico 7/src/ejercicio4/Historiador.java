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

    public ArrayList<Documento> documentosConTitulo(String titulo){
        CondicionTituloIgual condicion = new CondicionTituloIgual(titulo);
        return documentosCumplen(condicion);
    }

    public ArrayList<Documento> documentosTituloConPalabra(String palabra){
        CondicionTituloContiene condicion = new CondicionTituloContiene(palabra);
        return documentosCumplen(condicion);
    }

    public ArrayList<Documento> documentosConPalabraClave(String palabraClave){
        CondicionPalabraClave condicion = new CondicionPalabraClave(palabraClave);
        return documentosCumplen(condicion);
    }

    public ArrayList<Documento> documentosSinPalabraClave(){
        /*CondicionPalabraClave condicionSi = new CondicionPalabraClave(palabraClave);
        CondicionNot condicion = new CondicionNot(condicionSi);*/
        CondicionSinPalabraClave condicion = new CondicionSinPalabraClave();
        return documentosCumplen(condicion);
    }

    public ArrayList<Documento> documentosDeAutor(String autor){
        CondicionAutor condicion = new CondicionAutor(autor);
        return documentosCumplen(condicion);
    }

    public ArrayList<Documento> documentosContenidoConPalabra(String palabra){
        CondicionContenidoContiene condicion = new CondicionContenidoContiene(palabra);
        return documentosCumplen(condicion);
    }

    public ArrayList<Documento> documentosContenidoMasPalabras(){
        CondicionContenidoMasPalabras condicion = new CondicionContenidoMasPalabras();
        return documentosCumplen(condicion);
    }

    public ArrayList<Documento> variasCondiciones(Condicion condicion1, Condicion condicion2){
        CondicionesVarias condicion = new CondicionesVarias(condicion1, condicion2);
        return documentosCumplen(condicion);
    }

    private ArrayList<Documento> documentosCumplen(Condicion condicion){
        ArrayList<Documento> documentosOk = new ArrayList<Documento>();
        for (Documento d: documentos) {
            if(condicion.cumple(d)) documentosOk.add(d);
        }
        return documentosOk;
    }
}
