package ejercicio13;

import ejercicio13.criterioEstacion.CriterioAnd;
import ejercicio13.criterioEstacion.CriterioNombre;
import ejercicio13.criterioEstacion.PromedioRegistroMayor;
import ejercicio13.criterioEstacion.UltimaRegistroMayor;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        PromedioRegistroMayor promMayor = new PromedioRegistroMayor(54,2);
        CriterioNombre nombre = new CriterioNombre("humedad");
        CriterioAnd criterioTandil = new CriterioAnd(promMayor, nombre);
        Estacion tandil = new Estacion("tandil", criterioTandil);
        Sensor humedadTandil = new Sensor("humedad");
        humedadTandil.addRegistro(new Registro(62));
        humedadTandil.addRegistro(new Registro(55));
        tandil.addSensor(humedadTandil);


        Estacion tresa = new Estacion("Tres Arroyos", new UltimaRegistroMayor(20));
        Sensor sensorTresa = new Sensor("humedad");
        tresa.addSensor(sensorTresa);

        //System.out.println(tresa.llovera());
        System.out.println(tandil.llovera());
    }
}
