package ejercicio4;

public class AppMain {
    public static void main(String[] args) {
        Historiador pedro = new Historiador("Pedro");
        Documento doc1 = new Documento("Documento1", "Tiene todo lo que quieras tener y lo que no tambien. Ver las caracteristicas del mismo por si tienen algun contenido especial");
        Documento doc2 = new Documento("Documento2", "Tiene solamente algunas cosas");
        Documento doc3 = new Documento("Docu3", "Tiene poco");
        doc1.addPalabraClave("docu");
        doc1.addPalabraClave("mento");
        doc3.addPalabraClave("docu");
        pedro.addDocumentos(doc1);
        pedro.addDocumentos(doc2);
        pedro.addDocumentos(doc3);
        System.out.println(pedro.documentosConTitulo("documento1"));
        System.out.println(pedro.documentosTituloConPalabra("documento"));
        System.out.println(pedro.documentosConPalabraClave("docu"));
        System.out.println(pedro.documentosSinPalabraClave());
        System.out.println(pedro.documentosContenidoConPalabra("tiene"));
        System.out.println(pedro.documentosContenidoMasPalabras());

    }
}
