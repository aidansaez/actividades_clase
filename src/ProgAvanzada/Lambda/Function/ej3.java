package ProgAvanzada.Lambda.Function;

import java.util.function.Consumer;
import java.util.function.Function;

public class ej3 {
    public static void main(String[] args) {
        Function<String, Double> longitud = s -> (double) s.length();
        Function<Double, Double> elevado = integer -> Math.pow(integer, 2);
        Consumer<Double> print = integer -> System.out.println(integer);
        print.accept(elevado.apply(longitud.apply("Programacion")));
    }
}
