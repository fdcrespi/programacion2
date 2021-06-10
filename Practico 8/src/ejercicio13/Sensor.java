package ejercicio13;

import java.util.ArrayList;

public class Sensor {
    private ArrayList<Registro> registros;
    private String nombre;

    public Sensor(String nombre) {
        this.nombre = nombre;
        registros = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void addRegistro(Registro reg){
        if(!registros.contains(reg)){
            registros.add(reg);
        }
    }

    public double promediosUltimosNRegistros(int cantidadRegistros){
        if (cantidadRegistros <= 0 || registros.size() < cantidadRegistros){
            return 0;
        }
        int suma = 0;
        for (int i = registros.size() - 1; i >= registros.size() - cantidadRegistros; i--) {
            suma += registros.get(i).getValor();
        }
        return suma / registros.size();
    }

    public double ultimoRegistro(){
        if(registros.isEmpty()) return 0;
        return registros.get(registros.size()).getValor();
    }

    @Override
    public boolean equals(Object o) {
        Sensor sensor = (Sensor) o;
        return getNombre().equals(sensor.getNombre());
    }

}
