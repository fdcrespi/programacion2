package ejercicio3;

import java.util.ArrayList;
import java.util.Objects;

public class Socio {
    private String nombre;
    private String apellido;
    private int edad;
    private boolean aldia;
    private ArrayList<Alquiler> alquileres;
    private final static int mayorEdad = 18;

    public Socio(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        aldia = true;
        alquileres = new ArrayList<Alquiler>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean isAldia() {
        return aldia;
    }

    public void setAldia(boolean aldia) {
        this.aldia = aldia;
    }

    public void addAlquiler(Alquiler a){
        if (!alquileres.contains(a)) alquileres.add(a);
    }

    public boolean esMayor(){
        return getEdad() >= mayorEdad;
    }

    public boolean alquiloCancha(int cancha) {
        for (Alquiler a: alquileres) {
            if(a.getCancha() == cancha){
                return true;
            }
        }
        return false;
    }


    public boolean precioCancha(double importe) {
        for (Alquiler a: alquileres) {
            if(a.getPrecio() > importe){
                return true;
            }
        }
        return false;
    }

    public int totalAlquileresCancha(int cancha) {
        int cant = 0;
        for (Alquiler a: alquileres) {
            if(a.getCancha() == cancha){
                cant++;
            }
        }
        return cant;
    }

    @Override
    public boolean equals(Object o) {
        Socio socio = (Socio) o;
        return edad == socio.getEdad() && nombre.equals(socio.getNombre()) && apellido.equals(socio.getApellido());
    }

    @Override
    public String toString() {
        return "Nombre:" + nombre + " Apellido:" + apellido + " Edad:" + edad + " ¿Debe?:" + isAldia() + "\n";
    }
}
