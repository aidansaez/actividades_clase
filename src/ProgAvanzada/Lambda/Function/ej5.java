package ProgAvanzada.Lambda.Function;

import java.util.function.BiFunction;
import java.util.function.Consumer;

public class ej5 {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> suma = (x, y) -> x + y;
        Consumer<Integer> print = integer -> System.out.println(integer);
        print.accept(suma.apply(8,7));
    }
}
