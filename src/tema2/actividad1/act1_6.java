package tema2.actividad1;

import java.util.Scanner;

public class act1_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce la inicial del nombre de la pieza de ajedrez: ");
        String piece = sc.nextLine();

        if (piece.equals("R")) { //Rey
            System.out.println("El rey puede moverse en todas direcciones pero solo avanza una posición.");
        } else if (piece.equals("D")) { //Dama
            System.out.println("La dama puede moverse en todas las direcciones las posiciones que quiera.");
        } else if (piece.equals("A")) {
            System.out.println("El alfil puede moverse diagonalmente las posiciones que quiera");
        } else if (piece.equals("C")){
            System.out.println("El caballo puede moverse en forma de L");
        } else if (piece.equals("T")) {
            System.out.println("La torre puede moverse recto pero no diagonalmente");
        } else if (piece.equals("P")){
            System.out.println("El peon puede moverse dos casillas inicialmente y luego de 1 en 1");
        } else System.out.println("Pieza no reconocida");
    }
}
