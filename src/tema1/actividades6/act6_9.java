package tema1.actividades6;

import java.util.Scanner;

public class act6_9 {
    public static void main(String[] args){
        final int meses = 12;
        final double preciofolios = 0.05;
        final double pi = Math.PI;

        Scanner sc = new Scanner(System.in);
        System.out.print("Cuantos folios quieres? ");
        double folios = sc.nextDouble();
        System.out.println("En total te costara: " + folios * preciofolios);

        System.out.print("Salario mensual: ");
        int salario = sc.nextInt();
        System.out.println("Cobras " + salario * meses + "€ al año");

        System.out.print("Cuanto mide el radio del circulo: ");
        double r = sc.nextDouble();
        System.out.println("El area del circulo es de: " + Math.pow(r, 2) * pi + "cm");
    }
}
