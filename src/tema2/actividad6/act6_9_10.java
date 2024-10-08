package tema2.actividad6;

import java.util.Scanner;

public class act6_9_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double i;
        System.out.print("Introduzca un valor o -1 para salir: ");
        i = scanner.nextDouble();
        for (; ; ) {
            System.out.println("La raíz cuadrada de " + i + " es " +
                    Math.sqrt(i));
            System.out.print("Introduzca un valor o -1 para salir: ");
            i = scanner.nextDouble();

        }
        /*
        a.) Las 4 primeras lineas
        b.) Que es infinito

        10.)
        a. que se ira sumando 1 a 1
        */
    }
}
