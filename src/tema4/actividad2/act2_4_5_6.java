package tema4.actividad2;

import java.util.Arrays;

public class act2_4_5_6 {
    public static void main(String[] args) {
        //4.)
        int[] array = {-35, -13, -77, -46, -82, -2, -26};
        int num = array[0];
        for (int i = 0; i < array.length; i++) {
            if (num > array[i]) {
                num = array[i];
            }
        }
        System.out.println(num);


        //5.)
        int[] pagoSemanal = {987, 688, 1324, 450, 667, 801};
        int sum = 0;

        for (int j = 0; j < pagoSemanal.length; j++) {
            sum += pagoSemanal[j];
        }

    }
}
