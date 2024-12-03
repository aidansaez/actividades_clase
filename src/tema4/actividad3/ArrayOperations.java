package tema4.actividad3;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayOperations {

    // Solicita al usuario que introduzca 5 números y los almacena en un array.
    public static int[] insertar() {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[5];
        for (int i = 0; i < array.length; i++) {
            System.out.print("Númer: ");
            array[i] = sc.nextInt();
        }
        return array;
    }

    // Devuelve una representación en formato de texto de un array (similar a Arrays.toString).
    public static String print(int[] array) {
        String text = "[";
        int c = 0;
        for (int i : array) {
            text += i;
            if (c < array.length - 1) {
                text += ", ";
            }
            c++;
        }
        return text + "]";
    }

    // Crea y devuelve un nuevo array con los elementos en orden inverso al original.
    public static void reverse(int[] array) {
        int[] array2 = new int[array.length];
        int j = 0;
        for (int i = array.length - 1; i >= 0; i--) {
            array2[j] = array[i];
            j++;
        }

        for (int i = 0; i < array.length; i++) {
            array[i] = array2[i];
        }
    }

    // Encuentra y devuelve el valor máximo en el array. **Nota: modifica el array al usar sort.**
    public static int max(int[] array) {
        Arrays.sort(array);
        return array[array.length - 1];
    }

    // Encuentra y devuelve el valor mínimo en el array. **Nota: modifica el array al usar sort.**
    public static int min(int[] array) {
        Arrays.sort(array);
        return array[0];
    }

    // Calcula y devuelve la suma de todos los elementos del array.
    public static int sum(int[] array) {
        int sum = 0;
        for (int i : array) {
            sum += i;
        }
        return sum;
    }

    // Compara dos arrays para verificar si son iguales (mismos valores en el mismo orden).
    public static boolean equals(int[] array1, int[] array2) {
        boolean tf = true;
        if (array1.length != array2.length) {
            tf = false;
        }

        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i]) {
                tf = false;
            }
        }

        return tf;
    }

    // Compara dos arrays para verificar si son iguales independientemente del orden.
    public static boolean equalsWithoutOrder(int[] array1, int[] array2) {
        Arrays.sort(array1);
        Arrays.sort(array2);
        boolean tf = true;

        if (array1.length != array2.length) {
            tf = false;
        }

        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i]) {
                tf = false;
            }
        }

        return tf;
    }

    // Verifica si todos los elementos de array2 están presentes en array1.
    public static boolean isArrayOn(int[] array1, int[] array2) {
        boolean tf = false;
        
        if (array2.length > array1.length) {
            tf = false;
        }
        
        int c = 0;
        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array1.length; j++) {
                if (array2[i] == array1[j]) {
                    c++;
                    break;
                }
            }
        }

        if (c >= array2.length) tf = true;
        
        return tf;
    }

    // Ordena el array en orden ascendente y lo devuelve.
    public static void sort(int[] array) {
        Arrays.sort(array);
    }

    // Copia el contenido de un array fuente (`src`) a un array destino (`dst`).
    public static void copy(int[] src, int[] dst) {
        dst = src;
    }

    // Reemplaza los números impares en el array con el valor 0.
    public static void removeOddNumbers(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 1) {
                array[i] = 0;
            }
        }
    }

    // Devuelve un subarray basado en un rango de índices (start a end, inclusivo).
    public static int[] printRange(int[] array, int start, int end) {
        int [] good = new int[end - start + 1];
        int c = 0;
        for (int i = start; i <= end; i++) {
            good[c] = array[i];
            c++;
        }
        return good;
    }

    // Devuelve un nuevo array con elementos del original que tengan al menos 2 dígitos (en valor absoluto).
    public static int[] deleteOne(int[] array) {
        int c = 0;
        for (int i : array) {
            if (i >= 10 || i <= -10) {
                c++;
            }
        }

        int[] arrayfinal = new int[c];
        int i = 0;
        for (int j : array) {
            if (j >= 10 || j <= -10) {
                arrayfinal[i] = j;
                i++;
            }
        }

        return arrayfinal;
    }

    // Concatena los valores del array en un único string y lo devuelve.
    public static String concatenar(int[] array) {
        String p = "";
        for (int i : array) {
            p += i + "";
        }
        return p;
    }
}
