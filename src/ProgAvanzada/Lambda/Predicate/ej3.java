package ProgAvanzada.Lambda.Predicate;

import java.util.function.Predicate;

public class ej3 {
    public static void main(String[] args) {
        Predicate<Integer> p1 = i -> i > 100 || i < 50;
        System.out.println(p1.test(75));
        System.out.println(p1.test(10));
    }
}
