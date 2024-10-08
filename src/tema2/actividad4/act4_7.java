package tema2.actividad4;

import java.util.Scanner;

public class act4_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Numero: ");
        int n = sc.nextInt();

        do {
            System.out.println(n);
            n--;
        } while (n > 0);
    }
}
