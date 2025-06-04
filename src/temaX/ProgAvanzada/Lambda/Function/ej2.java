package temaX.ProgAvanzada.Lambda.Function;

import java.util.function.Consumer;
import java.util.function.Function;

public class ej2 {
    public static void main(String[] args) {
        Function<Integer, Double> elevado = integer -> Math.pow(integer, 2);
        Consumer<Double> print = integer -> System.out.println(integer);
        print.accept(elevado.apply(4));
    }
}
