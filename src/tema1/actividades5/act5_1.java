package tema1.actividades5;

import java.util.Scanner;

public class act5_1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce cuanto mide el lado del cuadrado: ");
        int cuadrado = sc.nextInt();
        System.out.println("area cuadrado: " + Math.pow(cuadrado, 2) + "cm");

        System.out.print("Introduce cuanto mide la base del rectangulo: ");
        int br = sc.nextInt();
        System.out.print("Introduce cuanto mide la altura del rectangulo: ");
        int ar = sc.nextInt();
        System.out.println("perimetro rectangulo: " + 2 * (br + ar) + "cm");

        System.out.print("Introduce cuanto mide la base del triangulo: ");
        int bt = sc.nextInt();
        System.out.print("Introduce cuanto mide la altura del triangulo: ");
        int ht = sc.nextInt();
        System.out.println("area triangulo: " + (bt * ht) / 2 + "cm");

        System.out.print("Introduce cuanto mide el radio del circulo: ");
        double rc = sc.nextDouble();
        System.out.println("area circulo: " + Math.pow(rc, 2) * Math.PI + "cm");
        System.out.println("perimetro circulo: " + 2 * Math.PI * rc + "cm");
    }
}

