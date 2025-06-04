package temaX.ProgAvanzada.Lambda.Function;

import java.util.function.Consumer;
import java.util.function.Function;

public class ej1 {
    public static void main(String[] args) {
        Function<String, Integer> longitud = s -> s.length();
        Consumer<Integer> print = integer -> System.out.println(integer);
        print.accept(longitud.apply("Luis"));
    }
}
