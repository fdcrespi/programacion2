package app;

import java.util.ArrayList;

public class Cliente {
    private String nombre;
    private int dni;
    private double minimoMetros;
    private boolean tieneAireLibre;
    private ArrayList<String> protocolosPreferidos;

    public Cliente(String nombre, int dni) {
        this.nombre = nombre;
        this.dni = dni;
        minimoMetros = 0;
        tieneAireLibre = false;
        protocolosPreferidos = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public double getMinimoMetros() {
        return minimoMetros;
    }

    public void setMinimoMetros(double minimoMetros) {
        if (minimoMetros > 0) {
            this.minimoMetros = minimoMetros;
        }
    }

    public boolean isTieneAireLibre() {
        return tieneAireLibre;
    }

    public void setTieneAireLibre(boolean tieneAireLibre) {
        this.tieneAireLibre = tieneAireLibre;
    }

    public void addPreferencia(String preferencia){
        if(!protocolosPreferidos.contains(preferencia)){
            protocolosPreferidos.add(preferencia);
        }
    }

    public boolean puedeAsistir(Comercio c){
        if(isTieneAireLibre()){
            if (!(c.isEspacioLibre())){
                return false;
            }
        }
        if (getMinimoMetros() > c.getMetrosCuadrados()){
            return false;
        }
        for (String p: protocolosPreferidos) {
            if (!c.implementaProtocolo(p)){
                return false;
            }
        }
        return true;
    }
}
