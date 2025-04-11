package ProgAvanzada.Lambda.Function;

import java.util.function.Consumer;
import java.util.function.Function;

public class ej7 {
    public static void main(String[] args) {
        Function<Double, String> res = aDouble -> "Resultado: " + aDouble;
        Consumer<String> print = System.out::println;
        print.accept(res.apply(2.0));
    }
}
