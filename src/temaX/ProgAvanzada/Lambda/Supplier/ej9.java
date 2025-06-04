package temaX.ProgAvanzada.Lambda.Supplier;

import java.util.function.BiConsumer;

public class ej9 {
    public static void calculator(int i, int y, BiConsumer<Integer, Integer> opera) {
        opera.accept(i, y);
    }
    public static void main(String[] args) {
        BiConsumer<Integer, Integer> suma = (num1, num2) -> System.out.println(num1 + num2);
        BiConsumer<Integer, Integer> resta = (num1, num2) -> System.out.println(num1 - num2);
        BiConsumer<Integer, Integer> multi = (num1, num2) -> System.out.println(num1 * num2);

        calculator(3, 5, suma);
        calculator(2, 5, resta);
        calculator(2, 3, multi);
    }
}
