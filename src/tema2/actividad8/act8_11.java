package tema2.actividad8;

import java.util.InputMismatchException;
import java.util.Scanner;

public class act8_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean correcto = false;
        int n1, n2;
        do {
            try {
                System.out.print("Que quieres sumar(1) o restar(2): ");
                int i = sc.nextInt();
                if (i == 1 || i == 2) {
                    switch (i) {
                        case 1:
                            System.out.println("-- Suma --");
                            System.out.print("Valor 1: ");
                            n1 = sc.nextInt();
                            System.out.print("Valor 2: ");
                            n2 = sc.nextInt();
                            System.out.println(n1 + " + " + n2 + " = " + (n1 + n2));
                            break;
                        case 2:
                            System.out.println("-- Resta --");
                            System.out.print("Valor 1: ");
                            n1 = sc.nextInt();
                            System.out.print("Valor 2: ");
                            n2 = sc.nextInt();
                            System.out.println(n1 + " + " + n2 + " = " + (n1 - n2));
                            break;
                    }
                } else System.out.println("Numero no valido");
                correcto = true;
            }catch (InputMismatchException e) {
                System.out.println("ERROR: No has introducido un numero");
                sc.next();
            }
        } while (!correcto);
    }
}
