package tema2.actividad5;

import java.util.Scanner;

public class act5_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un numero: ");
        int n1 = sc.nextInt();
        System.out.print("Introduce otro numero: ");
        int n2 = sc.nextInt();
        System.out.print("Introduce un limite: ");
        int l = sc.nextInt();
        int nn;

        while (!(n1 > 0 && n2 > n1 && l > 2 && l <= 30)) {
            if (n1 <= 0) {
                System.out.println("Error el n1 debe ser mayor que 0");
            } else if (n2 < n1) {
                System.out.println("Error el n2 debe ser mayor que n1");
            } else {
                System.out.println("Error el limite esta entre 3 y 30");
            }
            System.out.print("Introduce un numero: ");
            n1 = sc.nextInt();
            System.out.print("Introduce otro numero: ");
            n2 = sc.nextInt();
            System.out.print("Introduce un limite: ");
            l = sc.nextInt();
        }

        System.out.print(n1 + " " + n2 + " ");
        do {
            nn = n1 + n2;
            System.out.print(nn + " ");
            n1 = n2;
            n2 = nn;
            l--;
        } while (l > 2);
    }
}
