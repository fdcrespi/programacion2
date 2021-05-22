package app;

import java.util.ArrayList;

public abstract class Tributario {
    private String nombre;
    private double metrosCuadrados;
    private boolean espacioLibre;
    private ArrayList<String> protocolos;

    public Tributario(String nombre, String rubro, double metrosCuadrados, boolean espacioLibre) {
        this.nombre = nombre;
        this.metrosCuadrados = metrosCuadrados;
        this.espacioLibre = espacioLibre;
        protocolos = new ArrayList<>();
    }


}
