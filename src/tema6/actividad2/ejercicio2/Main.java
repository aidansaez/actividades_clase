package tema6.actividad2.ejercicio2;

public class Main {
    public static void main(String[] args) {
        // Crear objetos de las partes
        Motor motor = new Motor("Gasolina", 150);
        Rueda rueda = new Rueda(17, "Deportivo");
        Asiento asiento = new Asiento("Cuero", true);

        // Crear objeto Coche
        Coche coche = new Coche(motor, rueda, asiento);

        // Probar métodos del coche
        coche.mostrarInfo();
        coche.encenderMotor();
        coche.inflarRueda();
        coche.ajustarAsiento();
    }
}