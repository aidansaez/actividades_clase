package examen;

import java.util.InputMismatchException;
import java.util.Scanner;

public class chuletilla {
    public static final Scanner sc = new Scanner(System.in);
    public static int pedirNum(String text) {
        boolean continuar = false;
        int num = 0;
        do {
            try {
                System.out.print(text + ": ");
                num = sc.nextInt();
                if (num < 0) {
                    System.out.println("El valor no puede ser negativo");
                } else continuar = true;
            } catch (InputMismatchException nonum) {
                System.out.println("Introduce un valor numerico");
                sc.nextLine(); //buffer
            }
        } while (!continuar);

        sc.nextLine();
        return num;
    }
    public static void printmenu() {
        System.out.println("""
                ========================================
                    titulo
                ========================================
                1 - 
                2 - 
                3 - 
                4 - 
                5 - 
                0 - 
                -------------------------------""");
    }
    public static void main(String[] args) {
        boolean continuar = true;
        printmenu();
        do {
            int opc = pedirNum("Elige una opción");


            switch (opc) {
                case 0:
                    continuar = false;
                    break;
                case 1:

                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:

                    break;
            }
            System.out.println("-------------------------------");
        } while (continuar);
    }
}
