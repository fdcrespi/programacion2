package ejercicio2;

import java.util.Objects;

public class Palabra implements Comparable<Palabra> {
    public String escritura;
    public int frecuencia;

    public Palabra(String escritura) {
        this.escritura = escritura;
        frecuencia = 0;
    }

    public String getEscritura() {
        return escritura;
    }

    public void setEscritura(String escritura) {
        this.escritura = escritura;
    }

    public int getFrecuencia() {
        return frecuencia;
    }

    public void setFrecuencia(int frecuencia) {
        this.frecuencia = frecuencia;
    }

    public void sumarFrecuencia(){
        frecuencia++;
    }

    @Override
    public String toString() {
        return "escritura=" + escritura;
    }

    @Override
    public int compareTo(Palabra o) {
        return getEscritura().compareTo(o.getEscritura());
    }

    @Override
    public boolean equals(Object o) {
        Palabra palabra = (Palabra) o;
        return getEscritura().equals(palabra.getEscritura());
    }

}
