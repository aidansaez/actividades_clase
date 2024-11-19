package tema4.parte2.actividad1;

import java.util.Arrays;

public class act1_8 {
    public static void main(String[] args) {
        char[] profesora = {'p', 'a', 't', 'r', 'i', 'c', 'i', 'a'};

        char[] profesora1 = new char[8];
        profesora1[0] = 'p';
        profesora1[1] = 'a';
        profesora1[2] = 't';
        profesora1[3] = 'r';
        profesora1[4] = 'i';
        profesora1[5] = 'c';
        profesora1[6] = 'i';
        profesora1[7] = 'a';

        for (int i = profesora.length - 1; i >= 0 ; i--) {
            System.out.print(profesora[i] + " ");
        }

        //11.) 45, 23, 0, 45, 0, 12

        int[] array = {1, 2, 3, 4, 5};
        int[] reverse = new int[5];
        int n = 0;
        for (int i = array.length - 1; i >= 0; i--){
            reverse[n] = array[i];
            n++;
        }
    }
}
