package ProgAvanzada.Lambda.Function;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;

public class ej12 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("aidan", "luis", "daniel", "troliluis");
        BiFunction<String, String, String> empieza = (s, s2) -> s.startsWith(s2) ? s : null;
        Consumer<String> print = System.out::println;

        for (String s : list) {
            print.accept(empieza.apply(s, "a"));
        }
    }
}
