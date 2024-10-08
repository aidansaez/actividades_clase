package tema2.actividad5;

import java.util.Scanner;

public class act5_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Inserta numero objetivo: ");
        int o = sc.nextInt();
        System.out.println("Inserta 0 para salir");
        int n;
        int no = 0;
        int g = 0;
        int cg = 0;
        int ci = 0;
        int max = 0;

        do {
            System.out.print("Numero: ");
            n = sc.nextInt();
            g = g + n;
            if (!(n == 0)) {
                cg++;
            }
            if (n % 2 == 1) {
                ci++;
            }
            if (n == o){
                no++;
            }
            if (n > max) {
                max = n;
            }
        } while (!(n == 0));
        System.out.println("La suma de los valores es " + g);
        System.out.println("Total de numeros insertados " + cg);
        System.out.println("Total de numeros impares " + ci);
        System.out.println("El valor " + o + " se inserto " + no + " veces");
        System.out.println("El maximo valor insertado es " + max);
    }
}