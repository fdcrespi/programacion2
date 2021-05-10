package ejercicio2;

import ejercicio2.comparador.ComparadorFrecuencia;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;

public class Vocabulario {
    private String texto;
    private ArrayList<Palabra> palabrasDiferentes;

    public Vocabulario(String texto){
        this.texto = texto;
        palabrasDiferentes = new ArrayList<Palabra>();
        palabrasDiferentes = arregloPalabras(texto);
    }

    public String getTexto() {
        return texto;
    }

    private ArrayList<Palabra> arregloPalabras(String texto) {
        ArrayList<Palabra> arregloPalabras = new ArrayList<Palabra>();
        for (String t: texto.split("\\s+|\n|, ")) {
            Palabra newpal = new Palabra(t.toLowerCase());
            if (arregloPalabras.contains(newpal)){
                arregloPalabras.get(arregloPalabras.indexOf(newpal)).sumarFrecuencia();
            } else {
                arregloPalabras.add(newpal);
            }
        }
        return arregloPalabras;
    }

    public ArrayList<Palabra> palabrasOrdenadas(){
        ArrayList<Palabra> listaOrdenada = new ArrayList<Palabra>(palabrasDiferentes);
        Collections.sort(listaOrdenada);
        return listaOrdenada;
    }
/*
    public ArrayList<Palabra> palabrasMasFrecuentes(){
        ArrayList<Palabra> listaFrecuentes = new ArrayList<Palabra>();
        ArrayList<Palabra> ordenadaFrecuencia = new ArrayList<Palabra>(ordenFrecuencia());
        if (ordenadaFrecuencia.size() == 0) return listaFrecuentes;
        int frecuenciaMayor = ordenadaFrecuencia.get(0).getFrecuencia();
        //TODO falta recorrer y agregar a listaFrecuentes
    }
*/
    public ArrayList<Palabra> ordenFrecuencia(){
        ComparadorFrecuencia compF = new ComparadorFrecuencia();
        ArrayList<Palabra> listaFrecuencia = new ArrayList<Palabra>(palabrasDiferentes);
        Collections.sort(listaFrecuencia, compF);
        return listaFrecuencia;
    }

    public int cantidadVeces(String palabra){
        Palabra pal = new Palabra(palabra.toLowerCase());
        if (palabrasDiferentes.contains(pal))
            return palabrasDiferentes.get(palabrasDiferentes.indexOf(pal)).getFrecuencia();
        return 0;
    }

    public int cantidadPalabras(){
        return palabrasDiferentes.size();
    }


}
