package ProgAvanzada.Lambda.Predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class ej7 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,22,7,8,9,10);

        Predicate<Integer> ve = i -> i == 22;
        list.stream().filter(ve).forEach(System.out::println);
    }
}
