package tema4.actividad2;

import java.util.Arrays;
import java.util.Scanner;

public class act2_7_12 {
    public static int[] insertar() {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[5];
        for (int i = 0; i < array.length; i++) {
            System.out.print("Númer: ");
            array[i] = sc.nextInt();
        }
        return array;
    }
    public static String act7() {
        /*
        7.)
        a. no
        b. 0
        c. si
        d. 0.0 ya que no hay nada en el array
         */

        double[] array ={};
        double total = 0.0;
        for (double valor : array)
            total += valor;
        return "El total es: " + total;
    }

    public static double act8() {
        double[] array = {-47.39, 24.96, -1.02, 3.45, 14.21, 32.6, 19.42 };
        double suma = 0;
        for (double i : array){
            suma += i;
        }
        return suma / array.length;
    }

    public static boolean act9_10() {
        int[] array1 = insertar();
        int[] array2 = insertar();

        Arrays.sort(array1);
        Arrays.sort(array2);

        if (array1.length != array2.length) {
            return false;
        }

        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i]){
                return false;
            }
        }

        return true;
    }

    public static boolean act11() {
        int[] array1 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] array2 = {1, 2, 3};

        for (int i : array1) {
            boolean encontrado = false;
            for (int j : array2) {
                if (i == j) {
                    encontrado = true;
                    break;
                }
            }
            if (!encontrado) return false;
        }
        return true;
    }

    public static String act12() {
        int[] array = insertar();
        Arrays.sort(array);
        return Arrays.toString(array);
    }

    public static void main(String[] args) {
        System.out.println(act11());
    }
}
