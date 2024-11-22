package tema4.actividad2;

import java.util.OptionalDouble;
import java.util.stream.DoubleStream;

public class act2_7 {
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
    public static OptionalDouble act8() {
        double[] array = {-47.39, 24.96, -1.02, 3.45, 14.21, 32.6, 19.42 };
        return DoubleStream.of(array).average();
    }
    public static void main(String[] args) {
        System.out.println(act7());
        System.out.println(act8());
    }
}
