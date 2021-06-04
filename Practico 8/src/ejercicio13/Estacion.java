package ejercicio13;

import ejercicio13.criterioEstacion.CriterioEstacion;

import java.util.ArrayList;

public class Estacion {
    private ArrayList<Sensor> sensores;
    private CriterioEstacion criterio;
    private String nombre;

    public Estacion(String nombre, CriterioEstacion criterio) {
        this.nombre = nombre;
        this.criterio = criterio;
        sensores = new ArrayList<>();
    }

    public void addSensor(Sensor s) {
        if (!sensores.contains(s)) {
            sensores.add(s);
        }
    }

    public boolean llovera() {
        for (Sensor s : sensores) {
            if (criterio.cumple(s)) {
                return true;
            }
        }
        return false;
    }
}
