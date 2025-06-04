package temaX.ProgAvanzada.Lambda.Function;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;

public class ej11 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("aidan", "luis", "daniel", "troliluis");
        BiFunction<String, Integer, String> check = (s, integer) -> s.length() > integer ? s : null;
        Consumer<String> print = System.out::println;
        for (String s : list) {
            print.accept(check.apply(s, 4));
        };
    }
}
