package app;

import java.util.ArrayList;
import java.util.Locale;

public class Comercio {
    private String nombre;
    private String rubro;
    private double metrosCuadrados;
    private boolean espacioLibre;
    private ArrayList<String> protocolos;

    public Comercio(String nombre, String rubro, double metrosCuadrados, boolean espacioLibre) {
        this.nombre = nombre;
        this.rubro = rubro;
        this.metrosCuadrados = metrosCuadrados;
        this.espacioLibre = espacioLibre;
        protocolos = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRubro() {
        return rubro;
    }

    public void setRubro(String rubro) {
        this.rubro = rubro;
    }

    public double getMetrosCuadrados() {
        return metrosCuadrados;
    }

    public void setMetrosCuadrados(double metrosCuadrados) {
        this.metrosCuadrados = metrosCuadrados;
    }

    public boolean isEspacioLibre() {
        return espacioLibre;
    }

    public void setEspacioLibre(boolean espacioLibre) {
        this.espacioLibre = espacioLibre;
    }

    public void addProtocolo(String protocolo){
        if (!protocolos.contains(protocolo.toLowerCase())) {
            protocolos.add(protocolo.toLowerCase());
        }
    }

    //Se da por sentado que los comercios son iguales cuando tienen el mismo nombre y pertenecen al mismo rubro
    @Override
    public boolean equals(Object o) {
        Comercio comercio = (Comercio) o;
        return getNombre().equals(comercio.getNombre()) && getRubro().equals(comercio.getRubro());
    }

    @Override
    public String toString() {
        return "Nombre:" + getNombre() + " Rubro:" + getRubro();
    }

    public boolean implementaProtocolo(String protocolo) {
        return protocolos.contains(protocolo);
    }
}
