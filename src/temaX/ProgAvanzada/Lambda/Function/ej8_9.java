package temaX.ProgAvanzada.Lambda.Function;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;

public class ej8_9 {
    public static void main(String[] args) {
        resultado(2,3);
    }
    public static void resultado(int a, int b) {
        Function<Double, String> res = aDouble -> "Resultado: " + aDouble;
        BiFunction<Integer, Integer, Double> ele = (integer, integer2) -> Math.pow(integer, integer2);
        Consumer<String> print = System.out::println;
        print.accept(res.apply(ele.apply(a,b)));
    }
}
