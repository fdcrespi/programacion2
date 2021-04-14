package ejercicio2;

import java.awt.*;

public class Electrodomestico {

    private String nombre;
    private double precioBase = 100;
    private Color color = new Color(192,192,192);
    private double consumo = 10;
    private double peso = 2;
    private static double consumoBajo = 45;
    private static int altaGama = 3;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public double getConsumo() {
        return consumo;
    }

    public void setConsumo(double consumo) {
        this.consumo = consumo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getConsumoBajo() {
        return consumoBajo;
    }

    public void setConsumoBajo(double consumoBajo) {
        this.consumoBajo = consumoBajo;
    }

    public int getAltaGama() {
        return altaGama;
    }

    public void setAltaGama(int altaGama) {
        this.altaGama = altaGama;
    }

    public Electrodomestico(String nombre) {
        this.nombre = nombre;
    }

    public Electrodomestico(String nombre, double precioBase) {
        this.nombre = nombre;
        this.precioBase = precioBase;
    }

    public Electrodomestico(String nombre, double precioBase, Color color) {
        this.nombre = nombre;
        this.precioBase = precioBase;
        this.color = color;
    }

    public Electrodomestico(String nombre, double precioBase, Color color, double consumo) {
        this.nombre = nombre;
        this.precioBase = precioBase;
        this.color = color;
        this.consumo = consumo;
    }

    public Electrodomestico(String nombre, double precioBase, Color color, double consumo, double peso) {
        this.nombre = nombre;
        this.precioBase = precioBase;
        this.color = color;
        this.consumo = consumo;
        this.peso = peso;
    }

    public boolean esBajoConsumo(){
        return (this.consumo < this.consumoBajo);
    }

    public double balance(){
        return this.precioBase / this.peso;
    }

    public boolean esAltaGama(){
        return this.balance() > this.altaGama;
    }

    public static void main(String[] args) {

    }
}