package temaX.ProgAvanzada.Lambda.Predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class ej8_9 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("aid","psdfg","c","d","Aeee","f","pdddd","h","p");
        Predicate<String> va = s -> s.length() == 5 || s.startsWith("a") || s.startsWith("A");
        list.stream().filter(va).forEach(System.out::println);

        System.out.println();

        Predicate<String> va2 = s -> !s.startsWith("p") && !s.startsWith("P");
        list.stream().filter(va2).forEach(System.out::println);
    }
}
