package tema4.parte2.actividad1;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayTester {
    public static int[] leerEnteros() {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[5];
        for (int i = 0; i <= array.length - 1; i++) {
            System.out.print("Numero " + i + ": ");
            array[i] = sc.nextInt();
        }
        return array;
    }
    public static void imprimirArray(int[] array) {
        System.out.println(Arrays.toString(array));
    }
    public static int[] transformarArray(int[] array) {
        int[] bien = new int[array.length];
        for (int i = 0; i <= array.length - 1; i++) {
            bien[i] = array[i];
        }
        for (int i = 0; i <= bien.length - 1; i++) {
            if (bien[i] % 2 == 1) {
                bien[i] = -1;
            }
        }
        return bien;
    }
    public static void main(String[] args) {
        imprimirArray(transformarArray(leerEnteros()));
    }
}
