package tema2.actividad5;

import java.util.Scanner;

public class act5_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n;
        int g = 0;
        System.out.println("Inserta 0 para salir");

        do {
            System.out.print("Numero: ");
            n = sc.nextInt();
            g = g + n;
        } while (!(n == 0));
        System.out.println("La suma de los valores es " + g);
    }
}
