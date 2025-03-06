package tema7.JuegoDeAventuras;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    private static Map<Integer, Ubicacion> ubicaciones = new HashMap<>();
    public static boolean tieneDirec(String direccion, int ubicacionActual) {
        for (String key : ubicaciones.get(ubicacionActual).exits.keySet()) {
            if (key.equalsIgnoreCase(direccion)) {
                return true;
            }
        }
        return false;
    }

    public static String pedirDireccion(int ubicacionActual) {
        Scanner sc = new Scanner(System.in);
        boolean bien = false;
        String direccion;
        do {
            System.out.print("\nA que dirección quieres ir: ");
            direccion = sc.nextLine().toUpperCase();

            if (!tieneDirec(direccion, ubicacionActual)) {
                System.out.println("No puede ir en esa dirección");
            } else bien = true;

        } while (!bien);

        return direccion;
    }

    public Main() {
        ubicaciones.put(0, new Ubicacion(0, "Estás sentado en la clase de programación"));
        ubicaciones.put(1, new Ubicacion(1, "Estás en la cima de una montaña"));
        ubicaciones.put(2, new Ubicacion(2, "Estás bañándote en la playa"));
        ubicaciones.put(3, new Ubicacion(3, "Estás dentro de un edificio muy alto"));
        ubicaciones.put(4, new Ubicacion(4, "Estás de pie en un puente"));
        ubicaciones.put(5, new Ubicacion(5, "Estás en un bosque"));

        // Montaña
        ubicaciones.get(1).addExit("N", 5);
        ubicaciones.get(1).addExit("S", 4);
        ubicaciones.get(1).addExit("E", 3);
        ubicaciones.get(1).addExit("O", 2);
        ubicaciones.get(1).addExit("Q", 0);

        // Playa
        ubicaciones.get(2).addExit("N", 5);
        ubicaciones.get(2).addExit("S", 4);
        ubicaciones.get(2).addExit("E", 1);
        ubicaciones.get(2).addExit("Q", 0);

        // Edificio
        ubicaciones.get(3).addExit("O", 1);
        ubicaciones.get(3).addExit("Q", 0);

        // Puente
        ubicaciones.get(4).addExit("N", 1);
        ubicaciones.get(4).addExit("O", 2);
        ubicaciones.get(4).addExit("Q", 0);

        // Bosque
        ubicaciones.get(5).addExit("S", 1);
        ubicaciones.get(5).addExit("O", 2);
        ubicaciones.get(5).addExit("Q", 0);
    }

    public static void main(String[] args) {
        Main juego = new Main();
        int ubicacionActual = 1;
        String direccion = "";
        System.out.println("Juego iniciado.");
        do {
            System.out.println(ubicaciones.get(ubicacionActual).descripcion);
            System.out.print("Tus salidas validas son ");

            for (String key : ubicaciones.get(ubicacionActual).exits.keySet()) {
                System.out.print(key + " ");
            }

            direccion = pedirDireccion(ubicacionActual);
            ubicacionActual = ubicaciones.get(ubicacionActual).exits.get(direccion);

        } while (!direccion.equalsIgnoreCase("Q"));
    }
}
