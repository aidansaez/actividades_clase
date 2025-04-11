package ProgAvanzada.Lambda.Consumer;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class ej10 {
    public static void main(String[] args) {
        Map<Integer, String> map = new LinkedHashMap<>();
        BiConsumer<Integer, String> print = (integer, s) -> System.out.println(integer + " " + s);
        map.put(1, "siu");
        map.put(2, "siuu");
        map.put(3, "siuuu");
        map.put(4, "siuuuu");
        map.put(5, "siuuuuu");
        map.forEach(print);
    }
}
