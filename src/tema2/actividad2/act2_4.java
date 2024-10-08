package tema2.actividad2;

import java.util.Scanner;

public class act2_4 {
    public static void main(String[] args) {
        final String VAINILLA = "vainilla";
        final String CHOCOLATE = "chocolate";
        final String FRESA = "fresa";

        Scanner sc = new Scanner(System.in);
        System.out.print("Indique el sabor de helado (vainilla, chocolate o fresa): ");
        String sabor = sc.nextLine().toLowerCase(); // Convertimos la entrada a minúsculas para facilitar la comparación

        switch (sabor) {
            case VAINILLA:
                System.out.println("Has elegido Vainilla");
                break;
            case CHOCOLATE:
                System.out.println("Has elegido Chocolate");
                break;
            case FRESA:
                System.out.println("Has elegido Fresa");
                break;
            default:
                System.out.println("Error, ese helado no existe");
        }
    }
}
