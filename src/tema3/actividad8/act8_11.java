package tema3.actividad8;

import java.util.InputMismatchException;
import java.util.Scanner;

public class act8_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean correcto = false;
        do {
            try {
                System.out.print("Valor 1: ");
                int n1 = sc.nextInt();
                System.out.print("Valor 2: ");
                int n2 = sc.nextInt();
                correcto = true;
            }catch (InputMismatchException e) {
                System.out.println("ERROR: No has introducido un numero");
                sc.next();
            }
        } while (!correcto);
        System.out.println("finish");

    }
}
