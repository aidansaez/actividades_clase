package tema2.actividad2;

import java.util.Scanner;

public class act2_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Indique el sabor de helado (0 es vainilla, 1 es chocolate y 2 es fresa): ");
        int sabor = sc.nextInt();

        switch (sabor) {
            case 0:
                System.out.println("Vainilla");
                break;
            case 1:
                System.out.println("Chocolate");
                break;
            case 2:
                System.out.println("Fresa");
                break;
            default:
                System.out.println("Error, ese helado no existe");
        }
    }
}
