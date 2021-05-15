package ejercicio1;

import java.util.ArrayList;

public class Cultivo {
    private String nombre;
    private ArrayList<Enfermedad> enfermedades;

    public Cultivo(String nombre) {
        this.nombre = nombre;
        enfermedades = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean productoUtil(Agroquimico agroquimico){
        if (!agroquimico.desaconsejableEnCultivo(this)){
            /*boolean trata = false;
            int i = 0;
            while (!trata && i < enfermedades.size()){
                if (agroquimico.trataEnfermedad(enfermedades.get(i))){
                    trata = true;
                }
            }*/
            for (Enfermedad e: enfermedades) {
                if(agroquimico.trataEnfermedad((e))){
                    return true;
                }
            }
            return false;
        } else {
            return false;
        }
    }

    @Override
    public boolean equals(Object o) {
        Cultivo cultivo = (Cultivo) o;
        return getNombre().equals(cultivo.getNombre());
    }

}
