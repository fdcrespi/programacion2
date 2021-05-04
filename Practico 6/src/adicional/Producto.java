package adicional;

import java.util.Objects;

public class Producto {
    private String nombre;
    private String autor;
    private double precio;

    public Producto(String nombre, String autor, double precio) {
        this.nombre = nombre;
        this.autor = autor;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public boolean equals(Object o) {
        Producto producto = (Producto) o;
        return getNombre().equals(producto.getNombre()) && getAutor().equals(producto.getAutor());
    }

}
