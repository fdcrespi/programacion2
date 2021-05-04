package adicional;

import java.util.ArrayList;

public class Cliente {
    private String nombre;
    private String apellido;
    private int dni;
    private String direccion;
    private ArrayList<String> autoresPreferidos;
    private ArrayList<String> generosPreferidos;
    private ArrayList<Producto> compras;
    private double descuento;

    public Cliente(String nombre, String apellido, int dni, String direccion, double descuento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.direccion = direccion;
        this.autoresPreferidos = new ArrayList<String>();
        this.generosPreferidos = new ArrayList<String>();
        this.compras = new ArrayList<Producto>();
        this.descuento = descuento;
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

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public double precioProducto(Producto producto){
        return producto.getPrecio() - producto.getPrecio() * getDescuento() / 100;
    }

    public boolean comproProducto(Producto producto){
        return compras.contains(producto);
    }

    public boolean leGustaLibro(Libro libro){
        return autoresPreferidos.contains(libro.getAutor());
    }

    public boolean contieneGenero(String genero){
        return genero.contains(genero);
    }

    public boolean leGustaAutor(String autor){
        return autoresPreferidos.contains(autor);
    }

    public void agregarAutor(String autor){
        autoresPreferidos.add(autor);
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", dni=" + dni +
                '}';
    }
}
