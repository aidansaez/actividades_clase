package tema3.actividad9;

import java.util.Scanner;

public class ej9_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el número binario: ");
        int bin = sc.nextInt();
        int valor = 1, num, suma = 0;

        while (bin > 0) {
            num = bin % 10;
            num *= valor;
            suma = suma + num;
            valor *= 2;
            bin /= 10;
        }
        System.out.println("Numero en decimal: " + suma);
    }
}
