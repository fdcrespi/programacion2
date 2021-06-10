package ejercicio1;

import java.util.ArrayList;

public class Enfermedad {
    private String nombre;
    private ArrayList<String> estadosPatologicos;

    public Enfermedad(String nombre) {
        this.nombre = nombre;
        this.estadosPatologicos = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean agroquimicoPermitido(Agroquimico agroquimico){
        for (String s: estadosPatologicos) {
            if(!agroquimico.contains(s)){
                return false;
            }
        } return true;
    }
}
