package tema2.actividad6;

import java.util.Scanner;

public class act6_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String guess;

        for (guess = "" ;!"Pepe".equals(guess); ) {
            System.out.print("Adivina mi nombre: ");
            guess = scanner.nextLine();
        }
        System.out.println("¡¡Felicidades has adivinado mi nombre!!");

    }
}
