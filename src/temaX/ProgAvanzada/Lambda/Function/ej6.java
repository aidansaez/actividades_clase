package temaX.ProgAvanzada.Lambda.Function;

import java.util.function.BiFunction;
import java.util.function.Consumer;

public class ej6 {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Double> ele = (integer, integer2) -> Math.pow(integer, integer2);
        Consumer<Double> print = integer -> System.out.println(integer);
        print.accept(ele.apply(2, 3));
    }
}
