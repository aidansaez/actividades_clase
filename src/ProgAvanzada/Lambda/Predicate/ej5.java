package ProgAvanzada.Lambda.Predicate;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class ej5 {
    public static void main(String[] args) {
        BiPredicate<String, String> biPredicate = (a, b) -> a.equals(b);
        System.out.println(biPredicate.test("A", "B"));
        System.out.println(biPredicate.test("A", "A"));
    }
}
