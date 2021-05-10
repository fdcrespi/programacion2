package parcialito1;

public class Application {

    public static void main(String[] args) {
        Caballero arturo = new Caballero(400, 20);
        arturo.setNombre("Mago");
        System.out.println(arturo);

        Personaje merlin = null;
        merlin = new Mago(8);
        System.out.println(merlin);
    }
}
