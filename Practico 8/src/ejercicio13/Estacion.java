package ejercicio13;

import ejercicio11.criterio.Criterio;
import ejercicio13.criterioEstacion.CriterioEstacion;

import java.util.ArrayList;

public class Estacion {
    private ArrayList<Sensor> sensores;
    private ArrayList<Lluvia> lluvias;
    private CriterioEstacion criterio;
    private String nombre;

    public Estacion(String nombre, CriterioEstacion criterio) {
        this.nombre = nombre;
        this.criterio = criterio;
        sensores = new ArrayList<>();
        lluvias = new ArrayList<>();
    }

    public void addSensor(Sensor s){
        if (!sensores.contains(s)){
            sensores.add(s);
        }
    }

    public void addLluvia(Lluvia l){
        if(!sensores.contains(l)){
            lluvias.add(l);
        }
    }

    public CriterioEstacion getCriterio() {
        return criterio;
    }

    public void setCriterio(CriterioEstacion criterio) {
        this.criterio = criterio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double promediosUltimasTemp(int cantidadUltimasTemp){
        if (cantidadUltimasTemp <= 0 || sensores.size() < cantidadUltimasTemp){
            return 0;
        }
        int suma = 0;
        for (int i = sensores.size() - 1; i > sensores.size() - cantidadUltimasTemp; i--) {
            suma += sensores.get(i).getTemperatura();
        }
        return suma / cantidadUltimasTemp;
    }

    public double ultimaLluvia(){
        if (lluvias.isEmpty()) return 0;
        else return lluvias.get(lluvias.size()-1).getMm();
    }

    public double promedioLLuvias(int cantidadLluvias){
        if(cantidadLluvias <= 0 || cantidadLluvias > lluvias.size()){
            return 0;
        }
        int suma = 0;
        for (int i = lluvias.size() - 1; i >= lluvias.size() - cantidadLluvias; i--) {
            suma += lluvias.get(i).getMm();
        }
        System.out.println(suma);
        return suma / cantidadLluvias;
    }

    public double ultimaTemperatura(){
        if (sensores.isEmpty()) return 0;
        return sensores.get(sensores.size()-1).getTemperatura();
    }

    public double ultimoViento(){
        if(sensores.isEmpty()){
            return 0;
        }
        return sensores.get(sensores.size()-1).getViento();
    }
    
    public double ultimaHumedad(){
        if(sensores.isEmpty()){
            return 0;
        } 
        return sensores.get(sensores.size()-1).getHumedad();
    }

    public double promedioHumedad(int candidadSensores){
        if (candidadSensores <= 0 || sensores.size() < candidadSensores){
            return 0;
        }
        int suma = 0;
        for (int i = sensores.size() - 1; i >= sensores.size() - candidadSensores; i--) {
            suma += sensores.get(i).getTemperatura();
        }
        return suma / candidadSensores;
    }

    public boolean llovera(){
        return criterio.cumple(this);
    }
}
