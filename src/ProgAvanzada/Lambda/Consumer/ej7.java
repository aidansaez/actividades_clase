package ProgAvanzada.Lambda.Consumer;

import java.util.function.BiConsumer;

public class ej7 {
    public static void main(String[] args) {
        BiConsumer<Integer, Integer> mult = (o, o2) -> System.out.println(o * o2);
        mult.accept(-9, 7);
    }
}
