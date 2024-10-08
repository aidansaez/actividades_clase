package tema2.actividad1;

import java.util.Scanner;

public class act1_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Introduce tu edad: ");
        int age = scan.nextInt();

        if (age < 0) {
            System.out.println("Error");
        } else if (age < 13) {
            System.out.println("Se le aplicara la tarifa de niño");
            System.out.println("Disfrute de la pelicula");
        } else {
            System.out.println("Se le aplicara la tarifa de adulto");
            System.out.println("Disfrute de la pelicula");
        }
    }
}
