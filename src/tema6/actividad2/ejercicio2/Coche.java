package tema6.actividad2.ejercicio2;

public class Coche {
    private Motor motor;
    private Rueda rueda;
    private Asiento asiento;

    public Coche(Motor motor, Rueda rueda, Asiento asiento) {
        this.motor = motor;
        this.rueda = rueda;
        this.asiento = asiento;
    }

    // Métodos para acceder a las partes sin usar getters
    public void encenderMotor() {
        motor.encender();
    }

    public void inflarRueda() {
        rueda.inflar();
    }

    public void ajustarAsiento() {
        asiento.ajustar();
    }

    // Método para mostrar información del coche
    public void mostrarInfo() {
        System.out.println("Coche con motor tipo: " + motor.getTipo() + " y potencia: " + motor.getPotencia() + " HP.");
        System.out.println("Rueda de tamaño: " + rueda.getTamaño() + " y tipo: " + rueda.getTipo() + ".");
        System.out.println("Asiento de material: " + asiento.getMaterial() + " y reclinable: " + asiento.isReclinable() + ".");
    }
}