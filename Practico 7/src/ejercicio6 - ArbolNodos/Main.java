package ejercicio6;

public class Main {
    public static void main(String[] args) {
        Arbol palabras = new Arbol();
        palabras.addValor("Hola");
        palabras.addValor("Como");
        palabras.addValor("Estas");
        palabras.addValor("Perro");
        System.out.println(palabras);
        System.out.println(palabras.recorrido());
    }
}
