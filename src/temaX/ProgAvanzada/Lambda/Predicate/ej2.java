package temaX.ProgAvanzada.Lambda.Predicate;

import java.util.function.Predicate;

public class ej2 {
    public static void main(String[] args) {
        Predicate<Integer> p1 = i -> i > 100 && i < 300;
        System.out.println(p1.test(301));
        System.out.println(p1.test(200));
    }
}
