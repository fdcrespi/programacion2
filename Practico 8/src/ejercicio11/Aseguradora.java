package ejercicio11;

import ejercicio11.criterio.Criterio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Aseguradora {
    private ArrayList<Seguro> seguros;

    public Aseguradora(ArrayList<Seguro> seguros) {
        this.seguros = seguros;
    }

    public void addSeguro(Seguro s){
        if (!seguros.contains(s)){
            seguros.add(s);
        }
    }

    public ArrayList<Seguro> buscar(Criterio criterio, Comparator comparador){
        ArrayList<Seguro> segurosCumplen = new ArrayList<>();
        for (Seguro s: seguros) {
            segurosCumplen.addAll(s.buscar(criterio));
        }
        Collections.sort(segurosCumplen, comparador);
        return segurosCumplen;
    }

    public static void main(String[] args) {

    }
}
