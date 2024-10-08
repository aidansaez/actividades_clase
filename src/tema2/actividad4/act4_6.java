package tema2.actividad4;

import java.util.Scanner;

public class act4_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Tabla del: ");
        int n = sc.nextInt();
        int m = 1;

        do {
            System.out.println(n + " x " + m + " = " + (n * m));
            m++;
        } while (m <= 10);
    }
}
