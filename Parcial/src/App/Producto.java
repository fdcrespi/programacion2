package App;

import App.criterio.CriterioElemento;

import java.util.ArrayList;

public class Producto extends ElementoLibreria{
    private String marca;
    private double precio;
    private double volumen;

    public Producto(String nombre, String marca, double precio, double volumen) {
        super(nombre);
        this.marca = marca;
        this.precio = precio;
        this.volumen = volumen;
    }

    @Override
    public String getMarca() {
        return marca;
    }

    @Override
    public double getVolumen() {
        return volumen;
    }

    @Override
    public double getPrecio() {
        return precio;
    }

    @Override
    public int getCantidadProductos() {
        return 1;
    }

    @Override
    public ArrayList<ElementoLibreria> buscar(CriterioElemento criterio) {
        ArrayList<ElementoLibreria> elementoCumple = new ArrayList<>();
        if (criterio.cumple(this)){
            elementoCumple.add(this);
        }
        return elementoCumple;
    }
/*
    @Override
    public boolean equals(Object o) {
        try {
            Producto producto = (Producto) o;
            return getNombre().equals(producto.getNombre().toLowerCase()) && getMarca().equals(producto.getMarca().toLowerCase());
        }catch (Exception e){
            return false;
        }
    }*/

}
