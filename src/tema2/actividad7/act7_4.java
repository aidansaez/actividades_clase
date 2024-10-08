package tema2.actividad7;

import java.util.Scanner;

public class act7_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce la altura: ");
        int a = sc.nextInt();
        System.out.print("Introduce el ancho: ");
        int an = sc.nextInt();

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < an; j++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }
}
