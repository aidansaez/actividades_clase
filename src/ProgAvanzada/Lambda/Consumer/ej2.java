package ProgAvanzada.Lambda.Consumer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ej2 {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        Consumer<Integer> numero = System.out::println;
        for (int i = 5; i < 15; i++) {
            numeros.add(i);
        };
        numeros.forEach(numero);
    }
}
