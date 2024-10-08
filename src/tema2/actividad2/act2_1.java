package tema2.actividad2;

import java.lang.invoke.SwitchPoint;
import java.util.Scanner;

public class act2_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Cuantos años tienes? ");
        int edad = sc.nextInt();
        System.out.print("Cuantos euros tienes en tu tarjeta? ");
        int credito = sc.nextInt();

        if (edad >= 21 && credito >= 10000) {
            System.out.println("Eres apto");
        } else {
            System.out.println("No eres apto");
        }

        // Si, alguien con 25 años y 10000€ si podria. Alguien con 21 y 9000 no podria. Si cambiasemos el y (&&) por un o (||), bastaria con que una condición fuese verdadera.
    }
}
