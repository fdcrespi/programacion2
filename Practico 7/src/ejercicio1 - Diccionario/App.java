package ejercicio1;

public class App {
    public static void main(String[] args) {
        Diccionario diccionario = new Diccionario();
        Palabra palabra1 = new Palabra("programa","sustantivo");
        palabra1.addDefinicion("Proyecto o planificación ordenada de las distintas partes o actividades que componen algo que se va a realizar.");
        palabra1.addDefinicion("Exposición o declaración previa de las cosas que se van a realizar en una determinada materia.");
        Palabra palabra2 = new Palabra("cuestionario", "sustantivo");
        palabra2.addDefinicion("Conjunto de cuestiones o preguntas que deben ser contestadas en un examen, prueba, test, encuesta, etc.");
        Palabra palabra3 = new Palabra("imprevisacion", "adjetivo");
        palabra3.addDefinicion("Falta de previsión.");
        palabra1.agregarSinonimo(palabra3);
        palabra1.agregarSinonimo(palabra1);
        palabra1.agregarSinonimo(palabra2);
        diccionario.agregarPalabra(palabra1);
        diccionario.agregarPalabra(palabra2);
        diccionario.agregarPalabra(palabra3);
        System.out.println("----- sinonimos ------");
        System.out.println(palabra1.imprimirSinonimos());
        System.out.println("----- antonimos ------");
        System.out.println(palabra1.imprimirAntonimos());
        System.out.println(palabra1.imprimirDefiniciones());
        System.out.println(diccionario.palabrasEntre(palabra2, palabra1));

    }
}
