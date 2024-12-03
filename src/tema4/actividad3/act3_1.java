package tema4.actividad3;

import java.util.Arrays;
import java.util.Scanner;

public class act3_1 {
    public static int[] insertar() {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[5];
        for (int i = 0; i < array.length; i++) {
            System.out.print("Númer: ");
            array[i] = sc.nextInt();
        }
        return array;
    }
    public static void reverse(int[] array) {
        int[] array2 = new int[array.length];
        int j = 0;
        for (int i = array.length - 1; i >= 0; i--) {
            array2[j] = array[i];
            j++;
        }
        System.out.println(Arrays.toString(array2));
    }
    public static void main(String[] args) {
        reverse(insertar());
    }
}
