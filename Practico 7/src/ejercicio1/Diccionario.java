package ejercicio1;

import java.util.ArrayList;
import java.util.Collections;

public class Diccionario {
    ArrayList<Palabra> palabras;

    public Diccionario() {
        palabras = new ArrayList<Palabra>();
    }

    public void agregarPalabra(Palabra palabra){
        if (!palabras.contains(palabra))
            palabras.add(palabra);
    }

    public void eliminarPalabra(Palabra palabra){
        palabras.remove(palabra);
    }

    public void editarPalabra(Palabra palabra, String funcionGramatica){
        palabra.setFuncionGramatica(funcionGramatica);
    }

    public ArrayList<Palabra> getPalabrasOrdenadas(){
        ArrayList<Palabra> palabrasOrdenadas = new ArrayList<Palabra>();
        for (Palabra p: palabras) {
            palabrasOrdenadas.add(p);
        }
        Collections.sort(palabrasOrdenadas);
        return palabrasOrdenadas;
    }

    public ArrayList<Palabra> palabrasEntre(Palabra palabra1, Palabra palabra2){
        ArrayList<Palabra> palEntre = new ArrayList<Palabra>();
        if (palabras.contains(palabra1) && palabras.contains(palabra2)){
            Collections.sort(palabras);
            int inicio = posicionPalabra(palabra1);
            int fin = posicionPalabra(palabra2);
            if (inicio < fin){
                for (int i = ++inicio; i < fin; i++){
                    palEntre.add(palabras.get(i));
                }
            }
        }
        return palEntre;
    }

    private int posicionPalabra(Palabra palabraBuscada){
        int pos = -1;
        int iterador = 0;
        while (iterador < palabras.size() && pos == -1){
            if(palabras.get(iterador).equals(palabraBuscada)){
                pos = iterador;
            } else iterador++;
        }
        return pos;
    }
}
