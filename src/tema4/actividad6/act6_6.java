package tema4.actividad6;

import java.util.Scanner;

public class act6_6 {
    public static final int minimo = 1;
    public static final int maximo = 100;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("-- Adivina el numero --");
        System.out.print("Adivina el numero (1 - 100): ");
        int num = sc.nextInt();

        int random = minimo + (int) (Math.random() * maximo);

        do {
            if (num < random) {
                System.out.println("El numero es mayor que " + num);
            } else if (num > random) {
                System.out.println("El numero es menor que " + num);
            }

            System.out.print("Adivina el numero (1 - 100): ");
            num = sc.nextInt();
        } while (num != random);

        System.out.println("VICTORIA MAGISTRAL");
    }
}
