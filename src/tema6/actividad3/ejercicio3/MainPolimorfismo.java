package tema6.actividad3.ejercicio3;

import java.util.ArrayList;

public class MainPolimorfismo {
    public static void main(String[] args) {
        ArrayList<Coche> coches = new ArrayList<>();
        Coche coche1 = new CocheDeportivo(6);
        Coche coche2 = new CocheFamiliar(4);
        Coche coche3 = new CocheElectrico(0);
        coches.add(coche1);
        coches.add(coche2);
        coches.add(coche3);

        accionarCoches(coches);
    }

    public static void accionarCoches(ArrayList<Coche> coches) {
        for (Coche coche: coches) {
            coche.arrancar();
            coche.acelerar();
            coche.frenar();
        }
    }
}
