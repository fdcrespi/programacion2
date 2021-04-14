package ejercicio1;

import java.time.LocalDate;
import java.time.Period;

public class Persona {

    private int dni, edad;
    private LocalDate fechanac = LocalDate.of(2000, 1, 1);
    private String sexo = "femenino";
    private String nombre = "N";
    private String apellido = "N";
    private double peso = 1;
    private double altura = 1;
    /**
     * Variable de clase, es decir que todos los objetos instanciados de esta clase, va a tener siempre el mismo
     * Si yo la modifico, modifico la de todas las instancias
     * Tambien los metodos son static, tener cuidado que sin crear la clase, puedo acceder, pero no puedo acceder a las
     * variables de instancia.
     */
    private static int mayor = 18;
    private static int edadVotar = 16;

    public int getDni() {
        return dni;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public LocalDate getFechanac() {
        return fechanac;
    }

    public void setFechanac(LocalDate fechanac) {
        this.fechanac = fechanac;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
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

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public int getMayor() {
        return mayor;
    }

    public void setMayor(int mayor) {
        this.mayor = mayor;
    }

    public int getEdadVotar() {
        return edadVotar;
    }

    public void setEdadVotar(int edadVotar) {
        this.edadVotar = edadVotar;
    }

    public Persona(int dni){
        this.dni = dni;
    }

    public Persona(int dni, String nombre){
        this.dni = dni;
        this.setNombre(nombre);
    }

    public Persona(int dni, String nombre, String apellido){
        this.dni = dni;
        this.setNombre(nombre);
        this.setApellido(apellido);
    }

    public Persona(int dni, String nombre, String apellido, LocalDate fechanac, int edad){
        this.dni = dni;
        this.setNombre(nombre);
        this.setApellido(apellido);
        this.setFechanac(fechanac);
        this.setEdad(edad);
    }

    public Persona(int dni, String nombre, String apellido, LocalDate fechanac, int edad, String sexo){
        this.dni = dni;
        this.setNombre(nombre);
        this.setApellido(apellido);
        this.setFechanac(fechanac);
        this.setEdad(edad);
        this.setSexo(sexo);
    }

    public Persona(int dni, String nombre, String apellido, LocalDate fechanac, int edad, String sexo, double altura){
        this.dni = dni;
        this.setNombre(nombre);
        this.setApellido(apellido);
        this.setFechanac(fechanac);
        this.setEdad(edad);
        this.setSexo(sexo);
        this.setAltura(altura);
    }

    public Persona(int dni, String nombre, String apellido, LocalDate fechanac, int edad, String sexo, double altura, double peso){
        this.dni = dni;
        this.setNombre(nombre);
        this.setApellido(apellido);
        this.setFechanac(fechanac);
        this.setEdad(edad);
        this.setSexo(sexo);
        this.setAltura(altura);
        this.setPeso(peso);
    }

    public double masaCorporal(){
        return this.peso / Math.pow(this.altura,2);
    }

    public boolean enForma(){
        return (this.masaCorporal() >= 18.5 && this.masaCorporal() <= 25);
    }

    public boolean cumpleAnios(){
        return (Period.between(this.fechanac, LocalDate.now()).getDays() == 0);
    }

    public boolean esMayor(){
       return (obtenerAnios(this.fechanac) >= this.mayor);
    }

    public boolean puedeVotar(){
        return (obtenerAnios(this.fechanac) > this.edadVotar);
    }

    public boolean esCoherente(){
        return (obtenerAnios(this.fechanac) == this.edad);
    }

    public int obtenerAnios(LocalDate fecha) {
        return Period.between(fecha, LocalDate.now()).getYears();
    }

    public String info(){
        return "Nombre: " + this.nombre + ", Apellido: " + this.apellido + ". Fecha de Nacimiento: " + imprimirFechaNacimiento();
    }

    public String imprimirFechaNacimiento(){
        return this.fechanac.getDayOfMonth()+"/"+this.fechanac.getMonth()+"/"+this.fechanac.getYear();
    }

    public static void main(String[] args) {
	// write your code here
        LocalDate fechaNacimiento = LocalDate.of(2000,4,10);
        Persona person = new Persona(35334185, "Federico", "Crespi", fechaNacimiento,18,"masculino", 1.64, 61);
        System.out.println(person.masaCorporal());
        if (person.enForma()){
            System.out.println("en forma");
        } else System.out.println("fuera de forma");
        System.out.println("Edad declarada: "+person.getEdad());
        System.out.println("Edad segun su nacimiento: " + person.obtenerAnios(fechaNacimiento));
        if (person.cumpleAnios()){
            System.out.println("feliz cumpleaños");
        } else System.out.println("Hoy no");
        System.out.println(person.info());
        System.out.println("es Mayor: " + person.esMayor());
        System.out.println("Puede votar: " + person.puedeVotar());
        System.out.println("Es coherente: " + person.esCoherente());
    }
}










