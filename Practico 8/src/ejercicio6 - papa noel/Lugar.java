package ejercicio6;

import java.util.Objects;

public abstract class Lugar {
    private String nombre;

    public Lugar(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public abstract int cantidadCartasRegalo(String regalo);
    public abstract int cantidadCartas();
    public abstract int cantidadNiniosMalos();

    @Override
    public boolean equals(Object o) {
        Lugar lugar = (Lugar) o;
        return getNombre().equals(lugar.getNombre());
    }

    public double porcentajeRegalo(String regalo){
        return cantidadCartasRegalo(regalo) / 100 * cantidadCartas();
    }

}
