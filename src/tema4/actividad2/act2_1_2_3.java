package tema4.actividad2;

import java.util.Arrays;

public class act2_1_2_3 {
    public static void main(String[] args) {
        /*

        1.) size

        2.)
        a. 24
        b. por que es el mayor
         */

        //3.)
        int[] array = {-22, 5, 19, 1, -17, 0, -1, 19, 24, -13};
        Arrays.sort(array);
        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}
