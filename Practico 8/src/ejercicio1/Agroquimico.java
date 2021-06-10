package ejercicio1;

import java.util.ArrayList;

public class Agroquimico {
    private String nombre;
    private ArrayList<Cultivo> productosDesaconsejados;
    private ArrayList<String> estadosPatologicos;

    public Agroquimico(String nombre) {
        this.nombre = nombre;
        productosDesaconsejados = new ArrayList<>();
        estadosPatologicos = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean desaconsejableEnCultivo(Cultivo cultivo){
        return productosDesaconsejados.contains(cultivo);
    }

    public boolean contains(String estadoPatologico){
        return estadoPatologico.contains(estadoPatologico);
    }

    public boolean trataEnfermedad(Enfermedad enfermedad){
        return enfermedad.agroquimicoPermitido(this);
    }
}
