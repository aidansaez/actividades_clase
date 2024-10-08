package tema2.actividad2;

import java.util.Scanner;

public class act2_5 {


    public static void main(String[] args) {
        final String REY = "R";
        final String DAMA = "D";
        final String ALFIL = "A";
        final String CABALLO = "C";
        final String TORRE = "T";
        final String PEON = "P";

        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce la inicial del nombre de la pieza de ajedrez: ");
        String piece = sc.nextLine().toUpperCase();

        switch (piece) {
            case REY:
                System.out.println("El rey puede moverse en todas direcciones pero solo avanza una posición.");
                break;
            case DAMA:
                System.out.println("La dama puede moverse en todas las direcciones las posiciones que quiera.");
                break;
            case ALFIL:
                System.out.println("El alfil puede moverse diagonalmente las posiciones que quiera.");
                break;
            case CABALLO:
                System.out.println("El caballo puede moverse en forma de L.");
                break;
            case TORRE:
                System.out.println("La torre puede moverse recto pero no diagonalmente.");
                break;
            case PEON:
                System.out.println("El peón puede moverse dos casillas inicialmente y luego de una en una.");
                break;
            default:
                System.out.println("Pieza no reconocida.");
        }
    }
}
