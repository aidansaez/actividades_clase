package tema2.actividad6;

import java.util.Scanner;

public class act6_6_7_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el valor del incremento: ");
        int incremento = sc.nextInt();
        System.out.print("Introduce cuántas veces deseas incrementar: ");
        int veces = sc.nextInt();

        int contador = 0;
        for (int i = 0; i < veces; i++) {
            contador = contador + incremento;
        }

        System.out.println("El valor final del contador es: " + contador);

        //7.) No
        //8.) Si. Si.
    }
}
