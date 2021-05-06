package ejercicio1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Objects;

public class Palabra implements Comparable<Palabra>{
    private String escritura;
    private String funcionGramatica;
    private ArrayList<String> definiciones;
    private ArrayList<Palabra> sinonimos;
    private ArrayList<Palabra> antonimos;

    public Palabra(String escritura, String funcionGramatica) {
        this.escritura = escritura;
        this.funcionGramatica = funcionGramatica;
        definiciones = new ArrayList<String>();
        sinonimos = new ArrayList<Palabra>();
        antonimos = new ArrayList<Palabra>();
    }

    public String getFuncionGramatica() {
        return funcionGramatica;
    }

    public void setFuncionGramatica(String funcionGramatica) {
        this.funcionGramatica = funcionGramatica;
    }

    public String getEscritura() {
        return escritura;
    }

    public void setEscritura(String escritura) {
        this.escritura = escritura;
    }

    public void addDefinicion(String definicion){
        definiciones.add(definicion);
    }

    public ArrayList<Palabra> imprimirAntonimos(){
        return listado(antonimos);
    }

    public ArrayList<Palabra> imprimirSinonimos(){
        return listado(sinonimos);
    }

    private ArrayList<Palabra> listado(ArrayList<Palabra> lista){
        ArrayList<Palabra> listadoPalabras = new ArrayList<Palabra>();
        for (Palabra p: lista
             ) {
            listadoPalabras.add(p);
        }
        Collections.sort(listadoPalabras);
        return listadoPalabras;
    }

    @Override
    public boolean equals(Object o) {
        Palabra palabra = (Palabra) o;
        return getEscritura().equals(palabra.getEscritura());
    }

    public void agregarSinonimo(Palabra palabra){
        if (!sinonimos.contains(palabra)) sinonimos.add(palabra);
    }

    public void agregarAntonimo(Palabra palabra){
        if (!antonimos.contains(palabra)) antonimos.add(palabra);
    }

    public void agregarDefinicion(String definicion){
        if(!definiciones.contains(definicion)) definiciones.add(definicion);
    }

    @Override
    public String toString() {
        return "{" +
                "escritura='" + escritura + '\'' +
                ", funcionGramatica='" + funcionGramatica + '\'' +
                '}';
    }

    @Override
    public int compareTo(Palabra o) {
        return getEscritura().compareTo(o.getEscritura());
    }

    public ArrayList<String> imprimirDefiniciones(){
        ArrayList<String> definicionesPalabra = new ArrayList<String>();
        for (String d: definiciones
             ) {
            definicionesPalabra.add(d);
        }
        return definicionesPalabra;
    }
    
}
