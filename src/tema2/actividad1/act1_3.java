package tema2.actividad1;

import java.util.Scanner;

public class act1_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un numero: ");
        int num = sc.nextInt();

        if (num == 0) {
            System.out.println("El numero 0 es neutro");
        } else if (num > 0) {
            System.out.println("El numero " + num + " es positivo");
            System.out.println("Todos los numeros positivos son mayores a cero");
        } else {
            System.out.println("El numero " + num + " es negativo");
        }
    }
}
