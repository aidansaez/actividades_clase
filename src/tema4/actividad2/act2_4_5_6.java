package tema4.actividad2;

import java.util.Arrays;

public class act2_4_5_6 {
    public static void main(String[] args) {
        //4.)
        int[] array = {-35, -13, -77, -46, -82, -2, -26};
        Arrays.sort(array);
        System.out.println(array[0]);


        //5.)
        int[] pagoSemanal = {987, 688, 1324, 450, 667, 801};
        int sum = 0;

        for (int j = 0; j <= pagoSemanal.length - 1; j++) {
            sum += pagoSemanal[j];
        }

    }
}
