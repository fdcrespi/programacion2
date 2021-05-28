package app;

import java.util.ArrayList;

public abstract class Tributario {
    private String nombre;
    private double metrosCuadrados;
    private boolean espacioLibre;
    protected ArrayList<String> protocolos;

    public Tributario(String nombre, double metrosCuadrados, boolean espacioLibre) {
        this.nombre = nombre;
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

    /**
     *
     * @param protocolo
     * @return Si el Comercio ó Cliente implementan/requieren ese protocolo
     */
    public boolean implementaProtocolo(String protocolo) {
        return protocolos.contains(protocolo.toLowerCase());
    }


}
