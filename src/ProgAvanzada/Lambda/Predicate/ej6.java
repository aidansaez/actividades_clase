package ProgAvanzada.Lambda.Predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class ej6 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList( 1, 27, 3, 4, 5, 26, 7, 8, 29, 10);

        Predicate<Integer> compara = i -> i >= 25 && i <= 30;
        list.stream().filter(compara).forEach(System.out::println);
    }
}