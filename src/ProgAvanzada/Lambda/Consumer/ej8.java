package ProgAvanzada.Lambda.Consumer;

import java.util.function.BiConsumer;

public class ej8 {
    public static void main(String[] args) {
        BiConsumer<Integer, Integer> suma = (num1, num2) -> System.out.println(num1 + num2);
        BiConsumer<Integer, Integer> resta = (num1, num2) -> System.out.println(num1 - num2);
        BiConsumer<Integer, Integer> divis = (num1, num2) -> System.out.println(num1 / num2);

        suma.accept(-9, 7);
        resta.accept(-9, 7);
        divis.accept(-9, 7);
    }
}
