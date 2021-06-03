package ejercicio13;

import ejercicio13.criterioEstacion.PromedioLluviasMayor;
import ejercicio13.criterioEstacion.UltimaTemperaturaMayor;

public class Main {
    public static void main(String[] args) {
        Estacion tandil = new Estacion("tandil", new PromedioLluviasMayor(2, 54));
        Estacion tresa = new Estacion("Tres Arroyos", new UltimaTemperaturaMayor(20));
        Sensor sensorTresa = new Sensor(25,48,20);
        tresa.addSensor(sensorTresa);

        Lluvia tandil1 = new Lluvia(60);
        Lluvia tandil2 = new Lluvia(55);
        Lluvia tandil3 = new Lluvia(30);

        tandil.addLluvia(tandil3);
        tandil.addLluvia(tandil1);
        tandil.addLluvia(tandil2);

        System.out.println(tresa.llovera());
        System.out.println(tandil.llovera());
    }
}
