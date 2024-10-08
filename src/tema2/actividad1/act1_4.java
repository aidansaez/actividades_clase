package tema2.actividad1;

import java.util.Scanner;

public class act1_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Cuanto cuesta el articulo? ");
        int precio = sc.nextInt();
        double impuesto = 0.05;
        double total = precio * impuesto;

        if (precio >= 300) {
            System.out.println("El impuesto sera de: " + total + " €");
            System.out.println("Coste total: " + (precio + total) + " €");
        } else if (precio < 1) {
            System.out.println("Error");
        } else {
            System.out.println("Coste total: " + precio + " €");
        }
    }
}
