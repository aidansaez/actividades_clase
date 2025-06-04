package temaX.ProgAvanzada.Lambda.Predicate;

import java.util.function.Predicate;

public class ej1 {
    public static void main(String[] args) {
        Predicate<Integer> p1 = i -> i > 100;
        System.out.println(p1.test(10));
        System.out.println(p1.test(101));
    }
}
