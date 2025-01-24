package tema6.actividad3.ejercicio3;

public class MainPolimorfismo {
    public static void main(String[] args) {
        Coche coche1 = new CocheDeportivo(6);
        Coche coche2 = new CocheFamiliar(4);
        Coche coche3 = new CocheElectrico(0);

        coche1.arrancar();
        coche1.acelerar();
        coche1.frenar();

        coche2.arrancar();
        coche2.acelerar();
        coche2.frenar();

        coche3.arrancar();
        coche3.acelerar();
        coche3.frenar();
    }
}
