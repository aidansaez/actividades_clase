package tema2.actividad6;

import java.util.Scanner;

public class act6_13 {
    public static void main(String[] args) {
        System.out.println("- Descomposicion del dinero -");
        Scanner sc = new Scanner(System.in);
        String sn = "s";
        int d = 1;

        while (sn.equals("s") && d >= 0) {
            System.out.print("Dinero a descomponer: ");
            d = sc.nextInt();
                for (int c = 1; d >= 500; d = d - 500, c++) {
                    System.out.println(d + " - " + 500 + " = " + (d - 500) + ", " + c + " billete/s de 500 €");
                }
                for (int c = 1; d >= 200; d = d - 200, c++) {
                    System.out.println(d + " - " + 200 + " = " + (d - 200) + ", " + c + " billete/s de 200 €");
                }
                for (int c = 1; d >= 100; d = d - 100, c++) {
                    System.out.println(d + " - " + 100 + " = " + (d - 100) + ", " + c + " billete/s de 100 €");
                }
                for (int c = 1; d >= 50; d = d - 50) {
                    System.out.println(d + " - " + 50 + " = " + (d - 50) + ", " + c + " billete/s de 50 €");
                }
                for (int c = 1; d >= 20; d = d - 20) {
                    System.out.println(d + " - " + 20 + " = " + (d - 20) + ", " + c + " billete/s de 20 €");
                }
                for (int c = 1; d >= 10; d = d - 10) {
                    System.out.println(d + " - " + 10 + " = " + (d - 10) + ", " + c + " billete/s de 10 €");
                }
                for (int c = 1; d >= 5; d = d - 5) {
                    System.out.println(d + " - " + 5 + " = " + (d - 5) + ", " + c + " billete/s de 5 €");
                }
                for (int c = 1; d >= 2; d = d - 2) {
                    System.out.println(d + " - " + 2 + " = " + (d - 2) + ", " + c + " moneda/s de 2 €");
                }
                for (int c = 1; d == 1; d = 0) {
                    System.out.println(d + " - " + 1 + " = " + 0 + ", " + c + " moneda/s de 1 €");
                }
                if (d == 0) {
                    System.out.print("Quieres seguir? (s/n): ");
                    sn = sc.next();
                } else System.out.println("Error: Numero no valido");
                if (sn.equals("n")) {
                    System.out.println("Saliendo del programa...");
                } else {
                    if (!sn.equals("s")) {
                        System.out.println("Valor no valido, saliendo del programa...");
                    }
                }
        }
    }
}
