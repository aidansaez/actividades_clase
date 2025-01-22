package tema6.actividad2.ejercicio1;

public class Main {
    public static void main(String[] args) {
        // Create Pared objects
        Pared pared1 = new Pared("Norte");
        Pared pared2 = new Pared("Sur");
        Pared pared3 = new Pared("Este");
        Pared pared4 = new Pared("Oeste");

        // Create Techo object
        Techo techo = new Techo(3, 1); // altura = 3, color = 1

        // Create Cama object
        Cama cama = new Cama(2, 1, 1, "Moderno", 2); // almohadas = 2, altura = 1, colcha = 1, estilo = "Moderno", sabanas = 2

        // Create Lampara object
        Lampara lampara = new Lampara(true, 5, "Minimalista"); // bateria = true, calificacion = 5, estilo = "Minimalista"

        // Create Habitacion object
        Habitacion habitacion = new Habitacion(cama, lampara, "Habitación Principal", pared1, pared2, pared3, pared4, techo);

        // Use methods from Habitacion
        System.out.println("Nombre de la habitación: " + habitacion.getLampara().getEstilo());
        habitacion.hacerLaCama();
        lampara.encender();
    }
}