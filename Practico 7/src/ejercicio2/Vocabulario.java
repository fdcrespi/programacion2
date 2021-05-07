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
                newpal.sumarFrecuencia();
            } else {
                arregloPalabras.add(newpal);
            }
        }
        return arregloPalabras;
    }

    public ArrayList<Palabra> palabrasOrdenadas(){
        Collections.sort(palabrasDiferentes);
        return palabrasDiferentes;
    }

    public ArrayList<Palabra> ordenFrecuencia(){
        ComparadorFrecuencia compF = new ComparadorFrecuencia();
        Collections.sort(palabrasDiferentes, compF);
        return palabrasDiferentes;
    }


}
